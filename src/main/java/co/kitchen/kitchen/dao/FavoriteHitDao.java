package co.kitchen.kitchen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.kitchen.kitchen.entity.User;
import co.kitchen.kitchen.model.Hit;

@Repository
@Transactional
public class FavoriteHitDao {

	@PersistenceContext
	private EntityManager em;

	public List<Hit> findAll() {
		return em.createQuery("FROM Hit", Hit.class).getResultList();
	}
	
	public List<Hit> findByUser(User user) {
		return em.createQuery("from Hit where user = :user order by name", Hit.class)
				.setParameter("user", user)
				.getResultList();
	}
	
//	public List<Hit> findByUserId(Long userId) {
//		return em.createQuery("from Hit where user_id = :userId", Hit.class)
//				.setParameter("userId", userId)
//				.getResultList();
//	}
	
	public List<Hit> findByUserId(Long userId) {
		try {
			return em.createQuery("FROM Hit WHERE user_id = :userId", Hit.class)
					.setParameter("userId", userId)
					.getResultList();
		} catch (NoResultException ex) {
			return null;
		}
	}

	public void create(Hit hit) {
		em.persist(hit);
	}

	public Hit findById(Long id) {
		return em.find(Hit.class, id);
	}

	public void update(Hit hit) {
		em.merge(hit);
	}

	public void delete(Long id) {
		Hit hit = em.getReference(Hit.class, id);
		em.remove(hit);
	}
	
	public void delete(Hit hit) {
		em.remove(em.contains(hit) ? hit : em.merge(hit));
	}

	public boolean contains(Hit hit) {
		return em.contains(hit);
	}
	
}
