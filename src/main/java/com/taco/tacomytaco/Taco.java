package com.taco.tacomytaco;

import lombok.Data;

import javax.persistence.*;




@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
//    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
//    private Date createdAt;
//    @ManyToMany(targetEntity=Ingredient.class)
//    @Size(min=1, message="You must choose at least 1 ingredient")
//    private List<Ingredient> ingredients;
//    @PrePersist
//    void createdAt() {
//        this.createdAt = new Date();
//    }
}
