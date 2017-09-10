package star.share.mapper;

import org.modelmapper.ModelMapper;
import star.share.domain.User;
import star.share.dto.UserDTO;

public class UserMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public UserMapper() {
        super();
    }

    public UserDTO convertToDTO(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    public User convertToEntity(UserDTO dto) {
        User user = modelMapper.map(dto, User.class);
        return user;
    }
}
