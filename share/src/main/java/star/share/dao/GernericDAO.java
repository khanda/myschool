package star.share.dao;

import java.util.List;

	
public interface GernericDAO {
	<T> void insert(T entity);
	<T> T update(T entity);
	<T> T findOne(long id);
	<T> List<T> findAll();
	
}
