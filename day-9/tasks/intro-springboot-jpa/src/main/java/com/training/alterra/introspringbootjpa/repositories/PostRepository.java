package com.training.alterra.introspringbootjpa.repositories;

import com.training.alterra.introspringbootjpa.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
