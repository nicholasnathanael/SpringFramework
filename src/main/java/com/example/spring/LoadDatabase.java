package com.example.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(InventoryRepository repository) {
        return args -> {
            repository.deleteAll();
            
            log.info("Loading " + repository.save(new Inventory("canvas", 100, new Size(28, 35, "cm"), "A")));
            log.info("Loading " + repository.save(new Inventory("journal", 25, new Size(14, 21, "cm"), "A")));
            log.info("Loading " + repository.save(new Inventory("mat", 85, new Size(27, 35, "cm"), "A")));
            log.info("Loading " + repository.save(new Inventory("mousepad", 25, new Size(19, 22, "cm"), "P")));
            log.info("Loading " + repository.save(new Inventory("notebook", 50, new Size(8, 11, "in"), "P")));
            log.info("Loading " + repository.save(new Inventory("paper", 100, new Size(8, 11, "in"), "D")));
            log.info("Loading " + repository.save(new Inventory("planner", 75, new Size(22, 30, "cm"), "D")));
            log.info("Loading " + repository.save(new Inventory("postcard", 45, new Size(10, 15, "cm"), "A")));
            log.info("Loading " + repository.save(new Inventory("sketchbook", 80, new Size(14, 21, "cm"), "A")));
            log.info("Loading " + repository.save(new Inventory("sketch pad", 95, new Size(22, 30, "cm"), "A")));
        };
    }
}