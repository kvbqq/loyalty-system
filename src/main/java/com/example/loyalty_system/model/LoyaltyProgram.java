package com.example.loyalty_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class LoyaltyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @Embedded
    private Period validityPeriod;
    @OneToMany(mappedBy = "program")
    private List<Membership> members;
    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
    private List<EarningRule> earningRules;
    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
    private List<Reward> rewards;
}
