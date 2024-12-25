package com.example.produitsservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  product_id ;
   private String name;
    private String description;
    private Double       price;
    private String  catalogue;
    @Getter @Setter
    private  static Long stock_quantity;

}
