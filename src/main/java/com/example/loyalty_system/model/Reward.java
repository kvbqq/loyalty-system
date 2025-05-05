package com.example.loyalty_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer pointsCost;
    @Embedded
    private Period availabilityPeriod;
    @ManyToOne
    private LoyaltyProgram program;
}
