package com.vyjsoft.springbootgraphqlmysql.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.vyjsoft.springbootgraphqlmysql.model.Author;
import com.vyjsoft.springbootgraphqlmysql.model.Tutorial;
import com.vyjsoft.springbootgraphqlmysql.respository.AuthorRepository;
import com.vyjsoft.springbootgraphqlmysql.respository.TutorialRepository;

import javassist.NotFoundException;


@Component
public class Mutation implements GraphQLMutationResolver {

	private AuthorRepository authorRepo;
	private TutorialRepository tutorialRepo;
	
	
	@Autowired
	public Mutation(AuthorRepository author, TutorialRepository tuto) {
		
		this.authorRepo = author;
		this.tutorialRepo = tuto;
	}
	
	public Author createAuthor(String name, Integer age) {
		
		Author autor = new Author();
		autor.setName(name);
		autor.setAge(age);
		
		authorRepo.save(autor);
		
		return autor;
	}
	
	public Tutorial createTutorial(String titulo, String descripcion, Long autorID) {
		
		Tutorial libro = new Tutorial();
		
		libro.setAuthor(new Author(autorID));
		libro.setTitle(titulo);
		libro.setDescription(descripcion);
		tutorialRepo.save(libro);
		return libro;
		
	}
	
	public boolean deleteTutorial(Long id) {
		
		tutorialRepo.deleteById(id);
		return true;
	}
	
	public Tutorial updateTutorial(Long id, String title, String description) throws NotFoundException {
		Optional<Tutorial> optTutorial = tutorialRepo.findById(id);

		if (optTutorial.isPresent()) {
			Tutorial tutorial = optTutorial.get();

			if (title != null)
				tutorial.setTitle(title);
			if (description != null)
				tutorial.setDescription(description);

			tutorialRepo.save(tutorial);
			return tutorial;
		}

		throw new NotFoundException("Not found Tutorial to update!");
	}
}
