package com.bikalp.blog.services.implementation;

import com.bikalp.blog.entities.Comment;
import com.bikalp.blog.entities.Post;
import com.bikalp.blog.exceptions.ResourceNotFoundException;
import com.bikalp.blog.payloads.CommentDto;
import com.bikalp.blog.repositories.CommentRepo;
import com.bikalp.blog.repositories.PostRepo;
import com.bikalp.blog.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    private CommentService commentService;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CommentRepo commentRepo;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {

        Post post = this.postRepo.findById(postId).
                orElseThrow(()-> new ResourceNotFoundException("Post", "postId", postId));

        Comment comment = this.modelMapper.map(commentDto, Comment.class);

        comment.setPost(post);

        Comment savedComment = this.commentRepo.save(comment);

        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {

        Comment comment = this.commentRepo.findById(commentId)
                .orElseThrow(()->new ResourceNotFoundException("Comment", "commentId", commentId));

        this.commentRepo.delete(comment);
    }
}
