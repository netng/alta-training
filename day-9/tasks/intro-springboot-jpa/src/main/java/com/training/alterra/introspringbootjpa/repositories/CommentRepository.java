package com.training.alterra.introspringbootjpa.repositories;

import com.training.alterra.introspringbootjpa.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
