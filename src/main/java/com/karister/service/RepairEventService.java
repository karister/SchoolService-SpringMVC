package com.karister.service;

import com.karister.pojo.RepairEvent;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author karister
 * @create 2021-07-31 10:55
 */
public interface RepairEventService {
    //增加事件
    void addRepairEvent(RepairEvent repairEvent);
    //查询所有事件
    List<RepairEvent> queryEvents();
    //根据id查询事件
    RepairEvent queryEventByID(int id);
    //根据学号查询所有事件
    List<RepairEvent> queryEventsBySid(int sid);
    //插入更新时间
    void setUpdateTime(@Param("updateTime") Timestamp updateTime, @Param("eventID") int eventID);
}
