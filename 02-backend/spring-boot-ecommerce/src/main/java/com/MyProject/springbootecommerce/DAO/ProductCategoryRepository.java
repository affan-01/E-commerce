package com.MyProject.springbootecommerce.DAO;

import com.MyProject.springbootecommerce.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
