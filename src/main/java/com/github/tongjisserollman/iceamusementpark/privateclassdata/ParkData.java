package com.github.tongjisserollman.iceamusementpark.privateclassdata;

import java.util.Date;

/**
 * @author aodethri
 *
 * 游乐园数据类
 */
public class ParkData {

    /**
     * 名称
     */
    private String parkName;

    /**
     * 占地面积
     */
    private double area;

    /**
     * 建立时间
     */
    private Date createdTime;

    /**
     * 创始人
     */
    private String creatorName;

    public ParkData(String parkName, double area, Date createdTime,String creatorName){
        this.parkName = parkName;
        this.area = area;
        this.createdTime = createdTime;
        this.creatorName = creatorName;
    }

    /**
     * 获取游乐园的名称
     * @return 游乐园名称
     */
    public String getParkName(){
        return parkName;
    }

    /**
     * 获取游乐园占地面积
     * @return 游乐园占地面积
     */
    public double getArea(){
        return area;
    }

    /**
     * 获取游乐园建园时间
     * @return 建园时间
     */
    public Date getCreatedTime(){
        return createdTime;
    }

    /**
     * 获取游乐园创始人
     * @return 创始人姓名
     */
    public String getCreatorName(){
        return creatorName;
    }
}
