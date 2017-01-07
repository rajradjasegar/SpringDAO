package isep.web.sakila.dao.business;

import java.util.List;

import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.jpa.entities.Customer;

public interface IBusiness
{
	/*
	 * For Actors
	 */
	public List<Actor> getAllActors();
	public Actor getActorByID(int actorId);

	/*
	 * For Films
	 */
	public List<Film> getAllFilms();
	public Film getFilmByID(int filmId);
	
	/*
	 * For Customers
	 */
	public List<Customer> getAllCustomers();
	public Customer getCustomerByID(int customerId);


}
