package com.MyProject.springbootecommerce.DAO;

import com.MyProject.springbootecommerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
