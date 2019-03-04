package co.kitchen.kitchen.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.kitchen.kitchen.model.Hit;

@Entity(name="User")
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)	
	private List<Hit> favorites;

	// no args constructor

	public User() {

	}
	// overloaded constructor

	public User(Long id, String username, String password, String firstname, String lastname) {

		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public List<Hit> getFavorites() {
		return favorites;
	}
	
	public void setFavorites(List<Hit> favorites) {
		this.favorites = favorites;
	}
	
    public void addFavorite(Hit favorite) {
        favorites.add(favorite);
        favorite.setUser(this);
    }
 
    public void removeFavorite(Hit favorite) {
        favorites.remove(favorite);
        favorite.setUser(null);
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}

	

}
