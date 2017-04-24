package ssm.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ssm.model.Result;
import ssm.model.User;
import ssm.service.UserService;
import utils.MD5Util;

import javax.ws.rs.Consumes;
import java.util.Date;
import java.util.List;


/**
 * Created by Caspar on 2017/3/23.
 */
@Controller
@RequestMapping(value = "/user")
@Consumes("application/json")
public class UserController {

    private static Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findUserById(@PathVariable("id") Integer id) {
        User user = userService.findUserById(id);
        Result result = new Result();
        logger.info(user+"");
        return result.success(user);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result register(String username, String password) {

        Result result = new Result();
        try {
            int count = userService.findUserByUsername(username).size();
            if (count>0) {
                return result.error(300, "用户名已存在");
            }
            User user1 = new User();
            user1.setUsername(username);
            password = MD5Util.getMD5(password);
            System.out.print(password);
            user1.setPassword(password);
            user1.setNickname("");
            int id = userService.insertUser(user1);
            user1.setId(id);
            logger.info(user1+"");
            return result.success(user1);
        } catch (Exception e) {
            return result.error(100, "数据库出错");
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(String username, String password) {

        Result result = new Result();
        try {
            List<User> userByUsername = userService.findUserByUsername(username);
            int count = userByUsername.size();
            if (count==0) {
                return result.error(300, "用户名不存在");
            }
            User user = userByUsername.get(0);
            if (!user.getPassword().equals(MD5Util.getMD5(password))) {
                return result.error(300, "密码错误");
            }
            user.setToken(MD5Util.getMD5(user.getUsername()+new Date()));
            userService.updateUser(user);
            return result.success(user);
        } catch (Exception e) {
            return result.error(100, "数据库出错");
        }
    }
}
