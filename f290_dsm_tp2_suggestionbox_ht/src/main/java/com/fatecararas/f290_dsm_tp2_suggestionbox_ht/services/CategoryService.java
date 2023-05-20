package com.fatecararas.f290_dsm_tp2_suggestionbox_ht.services;

import com.fatecararas.f290_dsm_tp2_suggestionbox_ht.model.Category;
import com.fatecararas.f290_dsm_tp2_suggestionbox_ht.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void salvar(Category category) {
        repository.save(category);
    }

    public List<Category> getAll() {
       return repository.findAll();
    }
}