package com.example.spring;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    private InventoryRepository repository;

    public InventoryController(InventoryRepository repository) {
        this.repository = repository;
    };

    @GetMapping("/inventory")
    public List<Inventory> getAllInventory() {
        return repository.findAll();
    }

    @GetMapping("/inventory/{item}")
    public Inventory getInventoryByItem(@PathVariable("item") String item) {
        return repository.findByItem(item);
    }
}