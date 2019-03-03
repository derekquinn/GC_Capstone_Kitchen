package co.kitchen.kitchen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.kitchen.kitchen.model.Hit;

@Repository
@Transactional
public class FavoriteHitDao {

	@PersistenceContext
	private EntityManager em;

	public List<Hit> findAll() {
		return em.createQuery("FROM Hit", Hit.class).getResultList();
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
