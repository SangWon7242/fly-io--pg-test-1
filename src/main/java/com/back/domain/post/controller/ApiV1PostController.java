package com.back.domain.post.controller;

import com.back.domain.post.entiy.Post;
import com.back.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ApiV1PostController {
  private final PostService postService;

  @GetMapping("/posts")
  public List<Post> getItems() {
    return postService.getPosts();
  }
}
