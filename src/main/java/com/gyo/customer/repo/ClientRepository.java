package com.gyo.customer.repo;

import com.gyo.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Customer, Long> {

}
