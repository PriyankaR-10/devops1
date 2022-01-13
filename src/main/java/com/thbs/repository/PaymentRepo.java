package com.thbs.repository;


import com.thbs.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Varun Pavan
 *
 */

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
