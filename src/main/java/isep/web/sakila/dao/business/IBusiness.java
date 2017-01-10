package isep.web.sakila.dao.business;

import java.util.List;

import com.google.common.collect.Lists;

import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.jpa.entities.Customer;

import isep.web.sakila.jpa.entities.Country;
import isep.web.sakila.jpa.entities.City;
import isep.web.sakila.jpa.entities.Category;
import isep.web.sakila.jpa.entities.Language;

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

	public List<Country> getAllCountries();
	public Country getCountryByID(int countryId);

	public List<City> getAllCities();
	public City getCityByID(int cityId);

	public List<Language> getAllLanguages();
	public Language getLanguageByID(int languageId);

	public List<Category> getAllCategories();
	public Category getCategoryByID(int categoryId);
	
}
