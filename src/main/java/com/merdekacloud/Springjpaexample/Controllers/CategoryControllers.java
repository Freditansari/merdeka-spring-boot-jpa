package com.merdekacloud.Springjpaexample.Controllers;

import com.merdekacloud.Springjpaexample.Entity.Category;
import com.merdekacloud.Springjpaexample.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryControllers {
    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/category")
    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    };

    @GetMapping("/category/{id}")
    public Optional<Category> getCategory(@PathVariable("id") Long id){
        Optional<Category> category = categoryRepo.findById(id);
        return category;
    }

    @PostMapping("/category")
    public Category saveACategory(@RequestBody Category category){ return categoryRepo.save(category);}

    @PutMapping("/category")
    public Category updateCategory(@RequestBody Category category){
        return categoryRepo.save(category);
    }

    @DeleteMapping("/category")
    public ResponseEntity delete(@RequestParam("id") Long id){
        if(!categoryRepo.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        categoryRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
