package com.example.thikt_md4.repo;

import com.example.thikt_md4.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
