package com.github.tongjisserollman.iceamusementpark.template.game;

import com.github.tongjisserollman.iceamusementpark.template.GameTemplate;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * “水晶龙骨”游乐项目
 */
public class GameA extends GameTemplate {
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GameA",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "“水晶龙骨”游乐项目正在进行！"
                )
        );
    }
}
