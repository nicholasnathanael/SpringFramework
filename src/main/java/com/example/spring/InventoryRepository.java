package com.example.spring;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
    Inventory findByItem(String item);
}