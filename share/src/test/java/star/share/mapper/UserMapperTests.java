package star.share.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import star.share.domain.User;
import star.share.dto.UserDTO;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {
    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void convertToDTO() {
        User user = new User();
        user.setId(1l);
        user.setUsername("John");
        user.setPassword("xxxx");
        user.setType("TEACHER");
        user.setStatus(1);
        user.setIsadmin(true);
        user.setIsonline(true);

        UserDTO userDTO = modelMapper.map(user, UserDTO.class);

        assertThat(user.getId()).isEqualTo(userDTO.getId());
        assertThat(user.getUsername()).isEqualTo(userDTO.getUsername());
        assertThat(user.getPassword()).isEqualTo(userDTO.getPassword());
        assertThat(user.getType()).isEqualTo(userDTO.getType());
        assertThat(user.getStatus()).isEqualTo(userDTO.getStatus());
        assertThat(user.getStatus()).isEqualTo(userDTO.getStatus());
        assertThat(user.getIsadmin()).isEqualTo(userDTO.getIsadmin());
        assertThat(user.getIsonline()).isEqualTo(userDTO.getIsonline());


    }

    @Test
    public void convertToEntity() {
        UserDTO dto = new UserDTO();
        dto.setId(1l);
//        dto.setUsername("Name");
//        dto.setType("STUDENT");
//        dto.setIsadmin(true);
//        dto.setIsonline(false);
//        dto.setStatus(1);
//        dto.setPassword("ABC");

        User user = modelMapper.map(dto, User.class);

        assertThat(user.getId()).isEqualTo(dto.getId());
        assertThat(user.getUsername()).isEqualTo(dto.getUsername());
        assertThat(user.getPassword()).isEqualTo(dto.getPassword());
        assertThat(user.getType()).isEqualTo(dto.getType());
        assertThat(user.getIsonline()).isEqualTo(dto.getIsonline());
        assertThat(user.getIsadmin()).isEqualTo(dto.getIsadmin());
        assertThat(user.getStatus()).isEqualTo(dto.getStatus());

    }
}
