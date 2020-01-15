package com.merdekacloud.Springjpaexample.Controllers;

import com.merdekacloud.Springjpaexample.Entity.Product;
import com.merdekacloud.Springjpaexample.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("/")
    public List<Product> getAll(){ return productRepo.findAll();}

    @PostMapping("/")
    public Product save(@RequestBody Product product){ return productRepo.save(product);}
}
