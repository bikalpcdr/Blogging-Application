package com.bikalp.blog.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categories_seq_gen")
    @SequenceGenerator(name = "categories_seq_gen", sequenceName = "categories_seq_user", initialValue = 1, allocationSize = 1)
    private Integer categoryId;

    @Column(name = "tittle",length = 100, nullable = false)
    private String categoryTittle;

    @Column(name = "description")
    private String categoryDescription;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> posts = new ArrayList<>();

    public Category() {

    }

    public Category(Integer categoryId, String categoryDescription, String categoryTittle) {
        this.categoryId = categoryId;
        this.categoryDescription = categoryDescription;
        this.categoryTittle = categoryTittle;
    }

    public String getCategoryTittle() {
        return categoryTittle;
    }

    public void setCategoryTittle(String categoryTittle) {
        this.categoryTittle = categoryTittle;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
