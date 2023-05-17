package com.epicbe.lortolano.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.epicbe.lortolano.auth.entity.ERole;
import com.epicbe.lortolano.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
