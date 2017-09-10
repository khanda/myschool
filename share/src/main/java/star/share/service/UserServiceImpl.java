package star.share.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import star.share.domain.User;
import star.share.reposity.UserReposity;
import star.share.util.ResultInfo;

@Service
public class UserServiceImpl implements UserService {
    Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    UserReposity repository;

    @Override
    public ResultInfo save(User user) {
        ResultInfo result = new ResultInfo();
        try {
            if (user != null) {
                User user1 = repository.findOne(user.getId());
                if (user1 != null) {
                    result.setKey(ResultInfo.FAIL);
                    result.setMessage(ResultInfo.EXISTED);
                } else {
                    User saveUser = repository.save(user);
                    if (saveUser != null) {
                        result.setKey(ResultInfo.SUCCESS);
                    }
                }
            } else {
                result.setKey(ResultInfo.FAIL);
                result.setMessage(ResultInfo.BAD_INPUT);
            }

        } catch (Exception e) {
            result.setKey(ResultInfo.FAIL);
            logger.error(e);

        }
        return result;
    }

    @Override
    public ResultInfo deActive(User user) {
        ResultInfo result = new ResultInfo();
        try {
            if (user != null) {
                User userFound = repository.findOne(user.getId());
                if (userFound != null) {
                    userFound.setStatus(0);
                    //update
                    repository.save(userFound);
                    result.setKey(ResultInfo.SUCCESS);
                } else {
                    result.setKey(ResultInfo.FAIL);
                    result.setMessage(ResultInfo.NOT_FOUND);
                }
            } else {
                result.setKey(ResultInfo.FAIL);
                result.setMessage(ResultInfo.BAD_INPUT);
            }
        } catch (Exception e) {
            result.setKey(ResultInfo.FAIL);
            logger.error(e);
        }
        return result;
    }

    @Override
    public ResultInfo active(User user) {
        ResultInfo result = new ResultInfo();
        try {
            if (user != null) {
                User userFound = repository.findOne(user.getId());
                if (userFound != null) {
                    userFound.setStatus(1);
                    //update
                    repository.save(userFound);
                    result.setKey(ResultInfo.SUCCESS);
                } else {
                    result.setKey(ResultInfo.FAIL);
                    result.setMessage(ResultInfo.NOT_FOUND);
                }
            } else {
                result.setKey(ResultInfo.FAIL);
                result.setMessage(ResultInfo.BAD_INPUT);
            }
        } catch (Exception e) {
            result.setKey(ResultInfo.FAIL);
            logger.error(e);
        }
        return result;
    }

}
