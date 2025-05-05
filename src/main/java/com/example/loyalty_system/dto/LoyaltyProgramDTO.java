package com.example.loyalty_system.dto;

import com.example.loyalty_system.model.Period;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoyaltyProgramDTO {
    private String name;
    private String description;
    private Period validityPeriod;
}
