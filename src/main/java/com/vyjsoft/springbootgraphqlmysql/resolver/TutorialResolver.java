package com.vyjsoft.springbootgraphqlmysql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vyjsoft.springbootgraphqlmysql.model.Author;
import com.vyjsoft.springbootgraphqlmysql.model.Tutorial;
import com.vyjsoft.springbootgraphqlmysql.respository.AuthorRepository;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
	
	@Autowired
	private AuthorRepository repo;
	
	public TutorialResolver(AuthorRepository autor) {
		this.repo = autor;
	}
	
	public Author getAuthor(Tutorial tuto) {
		return repo.findById(tuto.getAuthor().getId()).orElseThrow(null);
	}

}
