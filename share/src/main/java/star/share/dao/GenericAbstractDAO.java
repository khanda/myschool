package star.share.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericAbstractDAO implements GernericDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public <T> void insert(T entity) {
		entityManager.persist(entity);
		 
	}

	@Override
	public <T> T update(T entity) {
		return null;
	}

	@Override
	public <T> T findOne(long id) {
		return null;
	}

	@Override
	public <T> List<T> findAll() {
		return null;
	}
	
}
