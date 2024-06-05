package com.SpringBoot.EcommerceSite.Product.Service;


import com.SpringBoot.EcommerceSite.Model.Category;
import com.SpringBoot.EcommerceSite.Product.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    public void createCategory(Category category){
        category.save(category);
    }
}
