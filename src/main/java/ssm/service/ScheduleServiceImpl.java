package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.ScheduleMapper;
import ssm.model.Schedule;
import ssm.model.ScheduleExample;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    public int insert(Schedule schedule) {
        return scheduleMapper.insert(schedule);
    }

    public void delete(int id) {
        ScheduleExample userExample = new ScheduleExample();
        userExample.createCriteria().andIdEqualTo(id);
        scheduleMapper.deleteByExample(userExample);
    }

    public Schedule findById(Integer id) {
        return scheduleMapper.selectByPrimaryKey(id);
    }

    public List<Schedule> findBySharecode(String shareCode) {
        ScheduleExample userExample = new ScheduleExample();
        userExample.createCriteria().andShareCodeEqualTo(shareCode);
        return scheduleMapper.selectByExample(userExample);
    }

    public List<Schedule> findByCity(String city) {
        ScheduleExample userExample = new ScheduleExample();
        userExample.createCriteria().andCityLike(city);
        userExample.setOrderByClause("`share_code`");
        return scheduleMapper.selectByExample(userExample);
    }

    public List<Schedule> findAll() {
        return scheduleMapper.selectByExample(null);
    }

    public void update(Schedule user) {
        scheduleMapper.updateByPrimaryKey(user);
    }

}
