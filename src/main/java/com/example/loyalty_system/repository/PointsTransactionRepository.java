package com.example.loyalty_system.repository;

import com.example.loyalty_system.model.PointsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsTransactionRepository extends JpaRepository<PointsTransaction, Long> {
}
