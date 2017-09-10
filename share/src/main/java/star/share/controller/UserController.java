package star.share.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import star.share.domain.User;
import star.share.dto.UserDTO;
import star.share.mapper.UserMapper;
import star.share.service.UserService;
import star.share.util.ResultInfo;

@RestController
public class UserController {
    @Autowired
    UserService service;
    UserMapper userMapper = new UserMapper();
    Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/api/saveUser", method = RequestMethod.POST)
    public @ResponseBody
    ResultInfo saveUser(@RequestBody UserDTO userDTO) {
        User user = userMapper.convertToEntity(userDTO);
        ResultInfo result = service.save(user);
        return result;
    }

    @RequestMapping(value = "/api/deleteUser", method = RequestMethod.POST)
    public @ResponseBody
    ResultInfo deActiveUser(@RequestBody UserDTO userDTO) {
        User user = userMapper.convertToEntity(userDTO);
        ResultInfo result = service.deActive(user);
        return result;
    }

    @RequestMapping(value = "/api/activeUser")
    public @ResponseBody
    ResultInfo aciveUser(@RequestBody UserDTO userDTO) {
        User user = userMapper.convertToEntity(userDTO);
        ResultInfo result = service.active(user);
        return result;
    }
}
