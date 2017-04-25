package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.CourseMapper;
import ssm.model.Course;
import ssm.model.CourseExample;
import ssm.model.User;
import ssm.model.UserExample;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public int insert(Course course) {
        return courseMapper.insert(course);
    }

    public void delete(int id) {
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andIdEqualTo(id);
        courseMapper.deleteByExample(courseExample);
    }

    public Course findById(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    public List<Course> findAll() {
        return courseMapper.selectByExample(null);
    }

    public void update(Course course) {
        courseMapper.updateByPrimaryKey(course);
    }
}
