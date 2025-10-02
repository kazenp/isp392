package com.isp392.repository;

import com.isp392.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {
    boolean existsByUsername(String username);
    Optional<Staff> findByUsername(String username);
}
