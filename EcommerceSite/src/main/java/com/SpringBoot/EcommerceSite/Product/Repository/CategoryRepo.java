package com.SpringBoot.EcommerceSite.Product.Repository;

import com.SpringBoot.EcommerceSite.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
