package ssm.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.model.Result;
import ssm.model.User;
import ssm.service.UserService;

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

        result.code = "200";
        result.msg = "OK";
        result.data = user!=null ? user : new Object();
        logger.info(user+"");
        return result.success(user);
    }
}
