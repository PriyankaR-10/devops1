package com.thbs.repository;

import com.thbs.model.restaurants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Priyanka_Ramesh
 *
 */

@Repository
public interface RestaurantRepo extends JpaRepository<restaurants, Integer> {
}
