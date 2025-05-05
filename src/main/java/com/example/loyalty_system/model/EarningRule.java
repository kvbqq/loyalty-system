package com.example.loyalty_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class EarningRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private EarningEventType eventType;
    private Integer points;
    @Embedded
    private Period validityPeriod;
    @ManyToOne
    private LoyaltyProgram program;
}
