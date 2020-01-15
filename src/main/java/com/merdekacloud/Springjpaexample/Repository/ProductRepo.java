package com.merdekacloud.Springjpaexample.Repository;

import com.merdekacloud.Springjpaexample.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

//https://docs.spring.io/spring-data/jpa/docs/1.3.4.RELEASE/reference/html/jpa.repositories.html
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByProductPriceGreaterThan(BigDecimal price);
}
