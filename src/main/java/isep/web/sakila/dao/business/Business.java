package isep.web.sakila.dao.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import isep.web.sakila.dao.repositories.ActorRepository;
import isep.web.sakila.dao.repositories.FilmRepository;
import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;

@Service("business")
public class Business implements IBusiness
{
	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;

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
}
