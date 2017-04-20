package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ssm.dao.UserMapper;
import ssm.model.User;
import ssm.model.UserExample;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user) {
        userMapper.insert(user);
    }

    public void deleteUser(int id) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(id);
        userMapper.deleteByExample(userExample);
    }

    public User findUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findAllUsers() {
        return userMapper.selectByExample(null);
    }

    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

}
