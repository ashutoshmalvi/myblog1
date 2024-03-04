package com.myblog1.service;

import com.myblog1.payload.PostDto;
import com.myblog1.payload.PostResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
  PostDto createPost(PostDto postDto);


  PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

  PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

  void deletePostById(long id);
}