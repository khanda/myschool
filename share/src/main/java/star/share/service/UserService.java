package star.share.service;

import star.share.domain.User;
import star.share.util.ResultInfo;

public interface UserService {
	ResultInfo save(User user);
	ResultInfo deActive(User user);
	ResultInfo active(User user);
}
