package com.merdekacloud.Springjpaexample.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="category_id")
    private Long id;

    @Column(name= "category_name")
    private String Category;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="CATEGORY_ID")
    private List<Product> products;


}
