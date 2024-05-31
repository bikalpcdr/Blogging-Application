package com.bikalp.blog.services;

import com.bikalp.blog.payloads.CommentDto;


public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);
}
