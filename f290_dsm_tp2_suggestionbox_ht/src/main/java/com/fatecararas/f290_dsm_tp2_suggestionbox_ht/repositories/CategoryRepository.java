package com.fatecararas.f290_dsm_tp2_suggestionbox_ht.repositories;

import com.fatecararas.f290_dsm_tp2_suggestionbox_ht.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {}