package com.example.loyalty_system.repository;

import com.example.loyalty_system.model.EarningRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarningRuleRepository extends JpaRepository<EarningRule, Long> {
}
