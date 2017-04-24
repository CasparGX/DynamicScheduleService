package ssm.service;

import ssm.model.User;

import java.util.List;

/**
 * Created by Caspar on 2017/3/23.
 */
public interface UserService {

    int insertUser(User user);

    void deleteUser(int id);

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    List<User> findAllUsers();

    void updateUser(User user);
}
