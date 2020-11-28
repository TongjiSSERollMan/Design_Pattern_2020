package com.github.tongjisserollman.iceamusementpark.entertainment.movie.template.movies;

import com.github.tongjisserollman.iceamusementpark.entertainment.movie.template.MovieTemplate;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * “水晶龙骨”电影
 */
public class DragonMovie extends MovieTemplate {
    @Override
    public void play() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "DragonMovie",
                        "play",
                        String.valueOf(System.identityHashCode(this)),
                        "“水晶龙骨”电影正在播放！"
                )
        );
    }
}
