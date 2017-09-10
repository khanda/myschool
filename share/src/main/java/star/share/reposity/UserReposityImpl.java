package star.share.reposity;

import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserReposityImpl implements UserReposityCustom {
    Logger logger = Logger.getLogger(UserReposityImpl.class);
    @PersistenceContext
    EntityManager entityManager;

}
