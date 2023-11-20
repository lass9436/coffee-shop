package com.hanghae.coffeeshop.controller.menu;

import com.hanghae.coffeeshop.domain.menu.Menu;
import com.hanghae.coffeeshop.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/list")
    public List<Menu> getMenuList() { return menuService.getMenuList(); }
}
