package com.fatecararas.f290_dsm_tp2_suggestionbox_ht.controllers;

import com.fatecararas.f290_dsm_tp2_suggestionbox_ht.model.Category;
import com.fatecararas.f290_dsm_tp2_suggestionbox_ht.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryResource {

    private final CategoryService service;

    public CategoryResource(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/new")
    public ResponseEntity<Void> save(@RequestBody Category category) {
        category.setId(null);
        service.salvar(category);
        return ResponseEntity.ok().build();
    }
}