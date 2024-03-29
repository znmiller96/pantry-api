package com.znmiller96.pantryapi.controller;

import com.znmiller96.pantryapi.model.dto.CategoryDto;
import com.znmiller96.pantryapi.model.request.body.AddCategoryRequestBody;
import com.znmiller96.pantryapi.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    //TODO update and delete

    @PostMapping("/add")
    public void addCategory(@RequestBody AddCategoryRequestBody addCategoryRequestBody) {
        categoryService.addCategory(addCategoryRequestBody.getUserId(), addCategoryRequestBody.getCategoryList());
    }

    @GetMapping("/get")
    public List<CategoryDto> getCategories(@RequestParam int userId) {
        return categoryService.getCategories(userId);
    }
}
