package io.pramod.com.springjwt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.pramod.com.springjwt.models.EnumRole;
import io.pramod.com.springjwt.models.Roles;


@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
	Optional<Roles> findByName(EnumRole name);
}