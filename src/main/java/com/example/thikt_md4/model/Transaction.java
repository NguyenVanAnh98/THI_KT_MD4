package com.example.thikt_md4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction")
@Entity
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transactionId;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private LocalDate transactionDate;
    private String serviceType;
    private Double unitPrice;
    private Double area;
}
