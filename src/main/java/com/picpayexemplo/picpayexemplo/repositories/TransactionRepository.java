package com.picpayexemplo.picpayexemplo.repositories;

import com.picpayexemplo.picpayexemplo.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}