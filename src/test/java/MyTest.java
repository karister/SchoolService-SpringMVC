import com.karister.dao.RepairEventDao;
import com.karister.dao.StudentDao;
import com.karister.pojo.RepairEvent;
import com.karister.pojo.Student;
import com.karister.service.RepairEventService;
import com.karister.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author karister
 * @create 2021-07-29 3:28
 */
public class MyTest {

    @Test
    public void eventInsert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RepairEventService eventService = context.getBean("repairEventServiceImpl", RepairEventService.class);
        RepairEvent repairEvent = new RepairEvent();
        repairEvent.setCategory("水电");
        repairEvent.setDetail("水管破裂");
        repairEvent.setSid("201810241117");
        repairEvent.setPlace("水电");
        System.out.println(repairEvent);
        eventService.addRepairEvent(repairEvent);
        eventService.setUpdateTime(new Timestamp(new Date().getTime()),repairEvent.getId());
    }
    @Test
    public void TimeStampChange(){
        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(timestamp);
        System.out.println(sdf.format(date.getTime()));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RepairEventService eventService = context.getBean("repairEventServiceImpl", RepairEventService.class);
        eventService.setUpdateTime(timestamp,20200004);
    }
}
