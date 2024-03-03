package com.aasjunior.educandoweb.course.services;

import com.aasjunior.educandoweb.course.entities.Category;
import com.aasjunior.educandoweb.course.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepositoryRepository;

    public List<Category> findAll(){
        return categoryRepositoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepositoryRepository.findById(id);
        return obj.get();
    }
}
