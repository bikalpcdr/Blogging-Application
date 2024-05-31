package com.bikalp.blog.services;


import com.bikalp.blog.PostResponse.PostResponse;
import com.bikalp.blog.payloads.PostDto;
import java.util.List;


public interface PostService {

    // create post
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    // update post
    PostDto updatePost(PostDto postDto, Integer postId);

    // delete post
    void deletePost(Integer postId);

    // get all post
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    // get a single post
    PostDto getPostById(Integer postId);

    // get all post by category
    List<PostDto> getPostsByCategory(Integer categoryId);

    // get all post by user
    List<PostDto> getPostsByUser(Integer userId);

    // to search post
    List<PostDto> searchPost(String keyword);
}
