package com.hanghae.coffeeshop.controller.coffee;

import com.hanghae.coffeeshop.domain.coffee.Coffee;
import com.hanghae.coffeeshop.service.coffee.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @PostMapping("/list")
    public List<Coffee> getCoffeeList() {
        return coffeeService.getCoffeeList();
    }
}
