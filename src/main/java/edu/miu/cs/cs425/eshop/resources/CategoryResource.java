package edu.miu.cs.cs425.eshop.resources;

import edu.miu.cs.cs425.eshop.model.Category;
import edu.miu.cs.cs425.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/categories"})
public class CategoryResource {
    @Autowired
    private CategoryService categoryService;
    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryService.findAllCategories();

        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{categoryId}")
    public ResponseEntity<Category> findCategoryById(@PathVariable Long categoryId){
        return ResponseEntity.ok().body(categoryService.findCategoryById(categoryId));
    }
}
