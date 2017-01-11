package isep.web.sakila.dao.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import isep.web.sakila.dao.repositories.ActorRepository;
import isep.web.sakila.dao.repositories.FilmRepository;
import isep.web.sakila.dao.repositories.CustomerRepository;
import isep.web.sakila.dao.repositories.CountryRepository;
import isep.web.sakila.dao.repositories.CityRepository;
import isep.web.sakila.dao.repositories.CategoryRepository;
import isep.web.sakila.dao.repositories.LanguageRepository;
import isep.web.sakila.dao.repositories.StoreRepository;
import isep.web.sakila.dao.repositories.StaffRepository;
import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.jpa.entities.Customer;
import isep.web.sakila.jpa.entities.Country;
import isep.web.sakila.jpa.entities.City;
import isep.web.sakila.jpa.entities.Category;
import isep.web.sakila.jpa.entities.Language;
import isep.web.sakila.jpa.entities.Store;
import isep.web.sakila.jpa.entities.Staff;
@Service("business")
public class Business implements IBusiness
{
	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	private CustomerRepository customerRepository;
	private CountryRepository countryRepository;
	private CityRepository cityRepository;
	private CategoryRepository categoryRepository;
	private LanguageRepository languageRepository;
	private StoreRepository storeRepository;
	private StaffRepository staffRepository;


	@Override
	public List<Category> getAllCategories()
	{
		return Lists.newArrayList(categoryRepository.findAll());
	}

	public Category getCategoryByID(int categoryId)
	{
		return categoryRepository.findOne(categoryId);
	}

	@Override
	public List<Language> getAllLanguages() {
		return Lists.newArrayList(languageRepository.findAll());
		}

	@Override
	public Language getLanguageByID(int languageId) {
		return languageRepository.findOne(languageId);
	}
	@Override
	public List<Country> getAllCountries()
	{
		return Lists.newArrayList(countryRepository.findAll());
	}

	public Country getCountryByID(int countryId)
	{
		return countryRepository.findOne(countryId);
	}

	@Override
	public List<City> getAllCities() {
		return Lists.newArrayList(cityRepository.findAll());
		}

	@Override
	public City getCityByID(int cityId) {
		return cityRepository.findOne(cityId);
	}

	@Override
	public List<Actor> getAllActors()
	{
		return Lists.newArrayList(actorRepository.findAll());
	}

	public Actor getActorByID(int actorId)
	{
		return actorRepository.findOne(actorId);
	}

	@Override
	public List<Film> getAllFilms() {
		return Lists.newArrayList(filmRepository.findAll());
		}

	@Override
	public Film getFilmByID(int filmId) {
		return filmRepository.findOne(filmId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return Lists.newArrayList(customerRepository.findAll());
		}

	@Override
	public Customer getCustomerByID(int customerId) {
		return customerRepository.findOne(customerId);
	}

}
