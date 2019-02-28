package co.kitchen.kitchen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.kitchen.kitchen.model.Recipe;

@Repository
@Transactional
public class FavoritesDao {

	@PersistenceContext
	private EntityManager em;

	public List<Recipe> findAll() {
		return em.createQuery("FROM Recipe", Recipe.class).getResultList();
	}

	public void create(Recipe aRecipe) {
		em.persist(aRecipe);
	}

	public Recipe findById(Long id) {
		return em.find(Recipe.class, id);
	}

	public void update(Recipe aRecipe) {
		em.merge(aRecipe);
	}

	public void delete(Long id) {
		Recipe aRecipe = em.getReference(Recipe.class, id);
		em.remove(aRecipe);
	}


}
