package com.karister.service;

import com.karister.dao.RepairEventDao;
import com.karister.pojo.RepairEvent;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author karister
 * @create 2021-07-31 11:13
 */
public class RepairEventServiceImpl implements RepairEventService{
    private RepairEventDao repairEventDao;

    public void setRepairEventDao(RepairEventDao repairEventDao) {
        this.repairEventDao = repairEventDao;
    }

    @Override
    public void addRepairEvent(RepairEvent repairEvent) {
        repairEventDao.addRepairEvent(repairEvent);
    }

    @Override
    public List<RepairEvent> queryEvents() {
        return repairEventDao.queryEvents();
    }

    @Override
    public RepairEvent queryEventByID(int id) {
        return repairEventDao.queryEventByID(id);
    }

    public List<RepairEvent> queryEventsBySid(int sid) {
        return repairEventDao.queryEventsBySid(sid);
    }

    @Override
    public void setUpdateTime(Timestamp updateTime,int eventID) {
        repairEventDao.setUpdateTime(updateTime,eventID);
    }
}
