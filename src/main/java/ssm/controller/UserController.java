package ssm.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ssm.model.Result;
import ssm.model.User;
import ssm.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Caspar on 2017/3/23.
 */
@Controller
@RequestMapping(value = "/user")
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
    public Result register(HttpServletRequest request, @ModelAttribute("username") String username, @ModelAttribute("password") String password) {

        Result result = new Result();
        try {
            User user1 = new User();
            user1.setUsername(username);
            user1.setPassword(password);
            user1.setNickname("nickname");
            int id = userService.insertUser(user1);
            user1.setId(id);
            logger.info(user1+"");
            return result.success(user1);
        } catch (Exception e) {
            return result.error(100, "数据库出错");
        }
    }
}
