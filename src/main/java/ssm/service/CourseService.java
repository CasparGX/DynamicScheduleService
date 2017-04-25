package ssm.service;

import ssm.model.Course;
import ssm.model.Schedule;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
public interface CourseService {

    int insert(Course course);

    void delete(int id);

    Course findById(Integer id);

    List<Course> findAll();

    void update(Course course);
}
