package com.merdekacloud.Springjpaexample.Controllers;

import com.merdekacloud.Springjpaexample.Entity.Category;
import com.merdekacloud.Springjpaexample.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryControllers {
    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/category")
    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    };

    @PostMapping("/category")
    public Category saveACategory(@RequestBody Category category){ return categoryRepo.save(category);}
}
