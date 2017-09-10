package star.share.reposity;

import org.springframework.data.repository.CrudRepository;

import star.share.domain.User;
import star.share.dto.UserDTO;
import star.share.util.ResultInfo;

public interface UserReposity extends CrudRepository<User, Long>, UserReposityCustom {

}
