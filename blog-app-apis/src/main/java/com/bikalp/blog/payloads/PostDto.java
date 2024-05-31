package com.bikalp.blog.payloads;

import com.bikalp.blog.entities.Comment;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PostDto {

    private String tittle;

    private String content;

    private String imageName;

    private Date addedDate;

    private CategoryDto categoryDto;

    private UserDto userDto;

    private Set<CommentDto> commentDtos = new HashSet<>();


    public PostDto() {

    }

    public PostDto(String tittle, String content, String imageName, Date addedDate, CategoryDto categoryDto, UserDto userDto, Set<CommentDto> commentDtos) {
        this.tittle = tittle;
        this.content = content;
        this.imageName = imageName;
        this.addedDate = addedDate;
        this.categoryDto = categoryDto;
        this.userDto = userDto;
        this.commentDtos = commentDtos;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public CategoryDto getCategory() {
        return categoryDto;
    }

    public void setCategory(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public UserDto getUser() {
        return userDto;
    }

    public void setUser(UserDto userDto) {
        this.userDto = userDto;
    }

    public Set<CommentDto> getComments() {
        return commentDtos;
    }

    public void setComments(Set<CommentDto> commentDtos) {
        this.commentDtos = commentDtos;
    }
}
