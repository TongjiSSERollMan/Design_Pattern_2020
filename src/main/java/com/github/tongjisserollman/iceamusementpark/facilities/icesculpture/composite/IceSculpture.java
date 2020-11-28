package com.github.tongjisserollman.iceamusementpark.facilities.icesculpture.composite;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HR8398Cephei
 *
 * 冰雕
 */
public class IceSculpture {
    /**
     * 冰雕名称
     */
    private String sculptureName;

    /**
     * 组成冰雕的多个子冰雕
     */
    private List<IceSculpture> sculptureComponents = new ArrayList<>();

    public IceSculpture(String sculptureName) {
        this.sculptureName = sculptureName;
    }

    public String getSculptureName() {
        return sculptureName;
    }

    public List<IceSculpture> getSculptureComponents() {
        return sculptureComponents;
    }

    public void setSculptureName(String sculptureName) {
        this.sculptureName = sculptureName;
    }

    /**
     * 向一个冰雕中加入子冰雕
     *
     * @param sculptureComponent 所需加入的子冰雕
     */
    public void addSculptureComponent(IceSculpture sculptureComponent) {

        CallStackLogger.log(
                new CallStackLogInfo(
                        "IceSculpture",
                        "addSculptureComponent",
                        String.valueOf(System.identityHashCode(this)),
                         "冰雕 " + sculptureName + " 添加子冰雕 " + sculptureComponent.getSculptureName()
                )
        );

        sculptureComponents.add(sculptureComponent);
    }

    /**
     * 从一个冰雕中移除子冰雕
     *
     * @param sculptureComponent 所需移除的子冰雕
     */
    public void removeSculptureComponent(IceSculpture sculptureComponent) {

        CallStackLogger.log(
                new CallStackLogInfo(
                        "IceSculpture",
                        "addSculptureComponent",
                        String.valueOf(System.identityHashCode(this)),
                        "冰雕 " + sculptureName + " 移除子冰雕 " + sculptureComponent.getSculptureName()
                )
        );

        sculptureComponents.remove(sculptureComponent);
    }
}
