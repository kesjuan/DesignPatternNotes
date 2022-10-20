package proxy;

import java.util.HashMap;
/*
!This is the proxy
*implements the same interface as the service class, To disguise itself as a service object
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib{
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {

                         this.youtubeService = new ThirdPartyYouTubeClass();
        // *reference field that points to our service object ^^^
        // * our proxy contains the actual object and is used in the proxy methods to perform.
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();

        } else {
            System.out.println("Retrieved list from cache.");
        }
        // ?Lazy initialization ^^^
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
                    // ? ^^ Uses the service object
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        // ?  Lazy initialization ^^^
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
