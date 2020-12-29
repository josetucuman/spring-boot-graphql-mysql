package com.vyjsoft.springbootgraphqlmysql.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyjsoft.springbootgraphqlmysql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
