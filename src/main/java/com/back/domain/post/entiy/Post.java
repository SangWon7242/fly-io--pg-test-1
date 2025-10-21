package com.back.domain.post.entiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
  @Id
  private Long id;
  private String title;
  private  String content;
}
