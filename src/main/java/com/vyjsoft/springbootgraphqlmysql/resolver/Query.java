package com.vyjsoft.springbootgraphqlmysql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.vyjsoft.springbootgraphqlmysql.model.Author;
import com.vyjsoft.springbootgraphqlmysql.model.Tutorial;
import com.vyjsoft.springbootgraphqlmysql.respository.AuthorRepository;
import com.vyjsoft.springbootgraphqlmysql.respository.TutorialRepository;


@Component
public class Query implements GraphQLQueryResolver {
	
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;

	@Autowired
	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public Iterable<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}

	public long countAuthors() {
		return authorRepository.count();
	}

	public long countTutorials() {
		return tutorialRepository.count();
	}
}
