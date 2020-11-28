package com.github.tongjisserollman.iceamusementpark.shoppingmall.toy.lazyinitializationpattern;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Major333
 *
 * 游乐场售卖的玩具
 */
public class Toy {
    public static final Map<String, Toy> types = new HashMap<String,Toy>();
    private final String type;
    private double price;

    /**
     * 获取一个游乐场售卖的玩具，使用工厂模式私有化构造函数
     *
     * @param type 要获取玩具的类型
     */
    private Toy(String type) {
        this.type = type;
        this.price = Math.random()*100;
    }

    /**
     * 获取玩具的价格
     */
    public double getPrice() {
        return price;
    }

    /**
     * 修改玩具的价格
     *
     * @param price 玩具最新的价格
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取玩具的类型
     */
    public String getType() {
        return type;
    }

    /**
     * 静态方法获取一个新的玩具。使用懒加载，如果之前并没有获取过此类型则在types中加入此类型
     *
     * @param type 要获取玩具的类型
     */
    public static synchronized Toy getToy(String type) {

        if(!types.containsKey(type)){

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "Toy",
                            "getToy",
                            "Toy",
                            "获取玩具类型: " + type + "，并加载到Toy.types中"
                    )
            );

            types.put(type, new Toy(type));
        }
        else{
            CallStackLogger.log(
                    new CallStackLogInfo(
                            "Toy",
                            "getToy",
                            "Toy",
                            "从Toy.types中获取玩具类型: " + type
                    )
            );
        }
        return types.get(type);
    }

}
