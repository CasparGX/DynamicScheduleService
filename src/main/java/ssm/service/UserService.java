package ssm.service;

import ssm.model.User;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
public interface UserService {

    void insertUser(User user);

    void deleteUser(int id);

    User findUserById(Integer id);

    List<User> findAllUsers();

    void updateUser(User user);
}
