package com.bikalp.blog.services;

import com.bikalp.blog.payloads.CategoryDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    void deleteCategory(Integer categoryId);

    CategoryDto getCategory(Integer categoryId);

    List<CategoryDto> getCategories();
}
