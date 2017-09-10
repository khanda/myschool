package star.share.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import star.share.domain.User;
import star.share.dto.UserDTO;
import star.share.mapper.UserMapper;
import star.share.mapper.UserMapperTests;
import star.share.service.UserService;
import star.share.util.ResultInfo;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTests {
    UserMapper userMapper = new UserMapper();
    @Autowired
    UserService service;

    @Test
    public void saveUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(5l);
        userDTO.setUsername("John");
        userDTO.setType("STUDENT");
        userDTO.setIsadmin(true);
        userDTO.setIsonline(false);
        userDTO.setStatus(1);
        userDTO.setPassword("ABC");

        User user = userMapper.convertToEntity(userDTO);
        ResultInfo result = service.save(user);
        assertThat(result.getKey()).isEqualTo(ResultInfo.FAIL);
    }

    @Test
    public void deActiveUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(5l);
        User user = userMapper.convertToEntity(userDTO);
        ResultInfo result = service.deActive(user);
        assertThat(result.getKey()).isEqualTo(ResultInfo.SUCCESS);
    }

    @Test
    public void activeUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(5l);
        User user = userMapper.convertToEntity(userDTO);
        ResultInfo result = service.active(user);
        assertThat(result.getKey()).isEqualTo(ResultInfo.SUCCESS);
    }
}
