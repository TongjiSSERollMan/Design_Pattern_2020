package com.github.tongjisserollman.iceamusementpark.extensionobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rand1925
 *
 * 角色的抽象基类
 */
public abstract class Role implements Extensible {
    protected List<Extension> extensions;
    protected String name;

    /**
     * 以角色名创建角色
     *
     * @param name 角色名
     */
    public Role(String name) {
        this.name = name;
        extensions = new ArrayList<>();
    }

    /**
     * 返回角色名
     *
     * @return 角色名
     */
    String getName() {
        return name;
    }

    @Override
    public void addExtension(String extensionName) {
        if (getExtension(extensionName) == null) {
            try {
                Extension extension = (Extension) Class.forName(extensionName).getConstructor(Role.class).newInstance(this);
                extensions.add(extension);
                CallStackLogger.log(new CallStackLogInfo(
                        "Role",
                        "addExtension",
                        String.valueOf(System.identityHashCode(this)),
                        "添加扩展"
                ));
            }
            catch(ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception) {
                CallStackLogger.log(new CallStackLogInfo(
                        "Role",
                        "addExtension",
                        String.valueOf(System.identityHashCode(this)),
                        "创建扩展错误"
                ));
            }
        }

    }

    @Override
    public void removeExtension(String extensionName) {
        CallStackLogger.log(new CallStackLogInfo(
                "Role",
                "removeExtension",
                String.valueOf(System.identityHashCode(this)),
                "删除扩展"
        ));
        extensions.removeIf(extension -> extension.getClass().getName().equals(extensionName));
    }

    @Override
    public Extension getExtension(String extensionName){
        CallStackLogger.log(new CallStackLogInfo(
                "Role",
                "getExtension",
                String.valueOf(System.identityHashCode(this)),
                "查找扩展"
        ));
        return extensions.stream().filter(extension -> extension.getClass().getName().equals(extensionName)).findAny().orElse(null);
    }


}
