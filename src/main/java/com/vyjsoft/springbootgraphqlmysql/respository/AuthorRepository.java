package com.vyjsoft.springbootgraphqlmysql.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyjsoft.springbootgraphqlmysql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
