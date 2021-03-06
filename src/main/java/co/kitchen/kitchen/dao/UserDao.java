package co.kitchen.kitchen.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.kitchen.kitchen.entity.User;

@Repository
@Transactional
public class UserDao {
	@PersistenceContext
	private EntityManager em;

	public User findById(Long id) {
		return em.find(User.class, id);
	}

	public void create(User aUser) {
		em.merge(aUser);

	}

	public User findByUsername(String username) {
		try {
			return em.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username)
					.getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}
	}

	
	public void update(User aUser) {
		em.merge(aUser);
	}

	
	

}
