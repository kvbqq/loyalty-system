package com.example.loyalty_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "program_id")
    private LoyaltyProgram program;
    private LocalDateTime joinDate;
    private Integer pointsBalance;
    @OneToMany(mappedBy = "membership")
    private List<PointsTransaction> transactions;
}
