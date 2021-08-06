package com.sadumatic.jpa.learningjpa.Repository;

import com.sadumatic.jpa.learningjpa.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class RepoCmdLRunner implements CommandLineRunner {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {
        Item macbook = new Item("Macbook pro M2", 4000);
        itemRepository.save(macbook);
    }
}
