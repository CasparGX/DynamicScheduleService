package ssm.service;

import ssm.model.Schedule;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
public interface ScheduleService {

    int insert(Schedule schedule);

    void delete(int id);

    Schedule findById(Integer id);

    List<Schedule> findBySharecode(String sharecode);

    List<Schedule> findAll();

    void update(Schedule user);
}
