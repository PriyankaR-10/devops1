package com.thbs.repository;

import com.thbs.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Priyanka_Ramesh
 *
 */

@Repository
public interface CustRepo extends CrudRepository<Customer, String> {
}
