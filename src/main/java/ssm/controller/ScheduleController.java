package ssm.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ssm.model.Course;
import ssm.model.CourseList;
import ssm.model.Result;
import ssm.model.Schedule;
import ssm.service.CourseService;
import ssm.service.ScheduleService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 63024 on 2017/4/25 0025.
 */
@Controller
@RequestMapping(value = "/schedule")
@Consumes("application/json")
public class ScheduleController {
    private static Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private ScheduleService scheduledService;
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/{shareCode}", method = RequestMethod.GET)
    @ResponseBody
    public Result findByShareCode(@PathVariable("shareCode") String shareCode) {
        Result result = new Result();
        List<Schedule> scheduleList = scheduledService.findBySharecode(shareCode);
        if (scheduleList.size()==0) {
            return result.error(404, "课表不存在");
        }
        CourseList courseList = new CourseList();
        courseList.setId(scheduleList.get(0).getId());
        courseList.setCity(scheduleList.get(0).getCity());
        courseList.setUid(scheduleList.get(0).getUid());
        courseList.setSharecode(scheduleList.get(0).getShareCode());
        List<Course> courses = new ArrayList<Course>();
        for (Schedule item : scheduleList) {
            Course course = courseService.findById(item.getCid());
            courses.add(course);
        }
        courseList.setCourseList(courses);
        return result.success(courseList);
    }

    @RequestMapping(value = "/city/{city}", method = RequestMethod.GET)
    @ResponseBody
    public Result findByCity(@PathVariable("city") String city) {
        Result result = new Result();
        try {
            city = new String(city.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            return result.error(500, "服务器编码错误");
        }
        List<Schedule> scheduleList = scheduledService.findByCity(city);
        if (scheduleList.size()==0) {
            return result.error(404, "课表不存在");
        }
//        CourseList courseList = new CourseList();
//        courseList.setId(scheduleList.get(0).getId());
//        courseList.setCity(scheduleList.get(0).getCity());
//        courseList.setUid(scheduleList.get(0).getUid());
//        courseList.setSharecode(scheduleList.get(0).getShareCode());
//        List<Course> courses = new ArrayList<Course>();
//        for (Schedule item : scheduleList) {
//            Course course = courseService.findById(item.getCid());
//            courses.add(course);
//        }
//        courseList.setCourseList(courses);
        return result.success(scheduleList);
    }


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(@RequestBody JSONObject course) {
        //String course = request.getParameter("course");
        Result result = new Result();
        try {
//            JSONObject jsonObject = JSONObject.parseObject(course);
            JSONObject jsonObject = course;
            jsonObject = jsonObject.getJSONObject("nameValuePairs");

            CourseList schedule = jsonObject.getObject("courseList", CourseList.class);
//            CourseList schedule = course;
            String shareCode = schedule.getUid()+""+new Date();
            for (Course item : schedule.getCourseList()) {
                courseService.insert(item);
                int id = item.getId();
                Schedule schedule1 = new Schedule();
                schedule1.setCid(id);
                schedule1.setCity(schedule.getCity());
                schedule1.setShareCode(shareCode);
                schedule1.setUid(schedule.getUid());
                scheduledService.insert(schedule1);
            }
            JSONObject data = new JSONObject();
            data.put("shareCode", shareCode);
            logger.info(data);
            return result.success(shareCode);
        } catch (Exception e) {
            e.printStackTrace();
            return result.error(500, e.getMessage());
        }
    }
}
