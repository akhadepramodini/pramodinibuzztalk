package com.cg.Buzztalk.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Buzztalk.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Long> 
{
	
	Comment save(Comment comment) ;

	Comment save(String string);
}
