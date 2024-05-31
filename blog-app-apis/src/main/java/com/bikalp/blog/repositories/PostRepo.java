package com.bikalp.blog.repositories;

import com.bikalp.blog.entities.Category;
import com.bikalp.blog.entities.Post;
import com.bikalp.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    //custom finder
    List<Post> getByUser(User user);
    List<Post> getByCategory(Category category);
    List<Post> findByTittleContaining(String tittle);
}
