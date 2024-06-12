package com.example.thikt_md4.repo;

import com.example.thikt_md4.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
}
