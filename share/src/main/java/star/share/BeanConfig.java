package star.share;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


 /* *
 * config to use hibernate
 *
 */

@Configuration
public class BeanConfig {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Bean
	public SessionFactory getSessionFactory() {
	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
	        throw new NullPointerException("factory is not a hibernate factory");
	    }
	    return entityManagerFactory.unwrap(SessionFactory.class);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
