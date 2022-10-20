package proxy;

import java.util.HashMap;
// * The interface of a remote service
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
    // * The concrete implementation of a service connector
    // *  These methods can request information from YouTube
    // *The speed of the request depends on the users internet connection as well as YouTubes

}
