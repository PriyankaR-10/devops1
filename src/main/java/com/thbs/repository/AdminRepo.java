package com.thbs.repository;

import com.thbs.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Priyanka_Ramesh
 *
 */

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {
}
