package com.appteste.appteste.controller;

import com.appteste.appteste.controller.dto.CategoryDto;
import com.appteste.appteste.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PutMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public void newCategory(@RequestBody CategoryDto categoryDto){
        categoryService.save(categoryDto);
    }

    @PostMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public void editCategory(@RequestBody CategoryDto categoryDto){
        categoryService.save(categoryDto);
    }

    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> listCategory() {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategory(@PathVariable Long id){
        categoryService.delete(id);
    }



}
