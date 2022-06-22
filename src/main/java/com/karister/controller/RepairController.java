package com.karister.controller;

import com.karister.pojo.RepairEvent;
import com.karister.service.RepairEventService;
import com.karister.service.StudentService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author karister
 * @create 2021-07-31 14:38
 */

@Controller
@RequestMapping("/repair")
public class RepairController {
    @Resource(name = "repairEventServiceImpl")
    private RepairEventService repairEventService;

    @RequestMapping("/form")
    @ResponseBody
    String getForm(HttpServletRequest request){
        String stuid = request.getParameter("stuid");
        String category = request.getParameter("category");
        String detail = request.getParameter("detail");
        String place = request.getParameter("place");
        RepairEvent repairEvent = new RepairEvent();
        repairEvent.setSid(stuid);
        repairEvent.setCategory(category);
        repairEvent.setDetail(detail);
        repairEvent.setPlace(place);
        System.out.println(repairEvent);
        repairEventService.addRepairEvent(repairEvent);
        repairEventService.setUpdateTime(new Timestamp(new Date().getTime()),repairEvent.getId());
        return "";
    }
}
