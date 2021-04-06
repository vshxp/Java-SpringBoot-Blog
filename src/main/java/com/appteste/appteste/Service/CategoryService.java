package com.appteste.appteste.Service;

import com.appteste.appteste.Controller.dto.CategoryDto;
import com.appteste.appteste.Model.Category;
import com.appteste.appteste.Repository.CategoryRepository;
import com.appteste.appteste.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void save(CategoryDto c) {
        categoryRepository.save(new Category(c.getId(),c.getName()));
    }

    public List<CategoryDto> findAll() {
        return listMapper(categoryRepository.findAll());
    }

    private List<CategoryDto> listMapper(List<Category> all) {
        return all.parallelStream().map(c -> new CategoryDto(c.getId(),c.getName())).collect(Collectors.toList());
    }

    public void delete(Long id) {
        try {
            categoryRepository.deleteById(id);
        }
        catch(Exception e){
            throw new NotFoundException();
        }
    }

}
