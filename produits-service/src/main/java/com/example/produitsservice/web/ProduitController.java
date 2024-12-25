package com.example.produitsservice.web;

import com.example.produitsservice.ProduitsServiceApplication;
import com.example.produitsservice.entity.Produit;
import com.example.produitsservice.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProduitController {

      @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private ProduitsServiceApplication produitsServiceApplication;

    @GetMapping("/all")
    public List<Produit> allProduit() {
        return produitRepository.findAll();
    }
    @GetMapping("/{id}")
    public Produit aProduit(@PathVariable Long id){
        return  produitRepository.findById(id).get();

    }
    @PostMapping("/add")
     public Produit addproduit(@RequestBody Produit produit){

       Produit p =new Produit();
       p.setName(produit.getName());
       p.setDescription(produit.getDescription());
        p.setCatalogue(produit.getCatalogue());
       p.setPrice(produit.getPrice());
       Produit.setStock_quantity(Produit.getStock_quantity()+1);
       produitRepository.save(p);
       return p;
    }





}


