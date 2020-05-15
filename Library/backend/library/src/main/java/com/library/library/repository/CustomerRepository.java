package com.library.library.repository;

import com.library.library.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer getCustomerById(Integer id);
}

