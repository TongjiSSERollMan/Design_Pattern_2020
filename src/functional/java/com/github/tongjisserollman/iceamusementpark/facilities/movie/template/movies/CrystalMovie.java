package com.github.tongjisserollman.iceamusementpark.facilities.movie.template.movies;

import com.github.tongjisserollman.iceamusementpark.facilities.movie.template.MovieTemplate;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * “冰影迷踪”电影
 */
public class CrystalMovie extends MovieTemplate {
    @Override
    public void play() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CrystalMovie",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "“冰影迷踪”电影正在播放！"
                )
        );
    }
}
