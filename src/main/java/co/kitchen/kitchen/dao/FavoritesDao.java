package co.kitchen.kitchen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.kitchen.kitchen.entity.Favorite;
import co.kitchen.kitchen.model.Recipe;

@Repository
@Transactional
public class FavoritesDao {

	@PersistenceContext
	private EntityManager em;

	public List<Favorite> findAll() {
		return em.createQuery("FROM Favorite", Favorite.class).getResultList();
	}

	public void create(Favorite aFavorite) {
		em.persist(aFavorite);
	}

	public Recipe findById(Long id) {
		return em.find(Recipe.class, id);
	}

	public void update(Favorite aFavorite) {
		em.merge(aFavorite);
	}

	public void delete(Long id) {
		Favorite aFavorite = em.getReference(Favorite.class, id);
		em.remove(aFavorite);
	}
	
	public void delete(Favorite aFavorite) {
		em.remove(em.contains(aFavorite) ? aFavorite : em.merge(aFavorite));
	}

	public boolean contains(Favorite aFavorite) {
		return em.contains(aFavorite);
	}
	
}
