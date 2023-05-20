package com.fatecararas.f290_dsm_tp2_suggestionbox_ht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Suggestion {
    private Integer id;
    private String description;
    private LocalDate data;
}
