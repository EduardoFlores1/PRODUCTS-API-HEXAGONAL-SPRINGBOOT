package com.example.curso.domain.models;

import com.example.curso.domain.enums.StatusEnum;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private StatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Category category;
}
