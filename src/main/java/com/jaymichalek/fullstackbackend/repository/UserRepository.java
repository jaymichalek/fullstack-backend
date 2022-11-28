package com.jaymichalek.fullstackbackend.repository;

import com.jaymichalek.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
