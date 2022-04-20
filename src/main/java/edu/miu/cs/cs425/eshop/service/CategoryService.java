package edu.miu.cs.cs425.eshop.service;

import edu.miu.cs.cs425.eshop.model.Category;
import edu.miu.cs.cs425.eshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }
    public Category findCategoryById(Long categoryId){
        return categoryRepository.findById(categoryId).orElse(null);
    }
}
