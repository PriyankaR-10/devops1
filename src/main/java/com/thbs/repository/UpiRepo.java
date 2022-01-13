package com.thbs.repository;


import com.thbs.model.UPIcheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pavan Varun
 *
 */

@Repository
public interface UpiRepo extends JpaRepository<UPIcheck, String> {
}
