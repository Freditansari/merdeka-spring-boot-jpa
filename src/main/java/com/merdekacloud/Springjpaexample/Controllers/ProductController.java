package com.merdekacloud.Springjpaexample.Controllers;

import com.merdekacloud.Springjpaexample.Entity.Product;
import com.merdekacloud.Springjpaexample.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("/")
    public List<Product> getAll(){ return productRepo.findAll();}

    @GetMapping("/price")
    public List<Product> findGreaterThanPrice(@RequestParam("price") BigDecimal price){


        return productRepo.findByProductPriceGreaterThan(price);
    }


    @PostMapping("/")
    public Product save(@RequestBody Product product){ return productRepo.save(product);}
}
