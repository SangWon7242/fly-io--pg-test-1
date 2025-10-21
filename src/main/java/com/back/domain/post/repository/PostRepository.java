package com.back.domain.post.repository;

import com.back.domain.post.entiy.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
