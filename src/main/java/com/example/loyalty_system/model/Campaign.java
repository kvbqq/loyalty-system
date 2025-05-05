package com.example.loyalty_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Embedded
    private Period validityPeriod;
    private Float multiplier;
    private Integer extraPoints;
    @Enumerated(EnumType.STRING)
    private EarningEventType targetEventType;
    @ManyToOne
    private LoyaltyProgram program;
}
