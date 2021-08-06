package com.sadumatic.jpa.learningjpa.Service;

import com.sadumatic.jpa.learningjpa.Entity.Item;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemSeviceCommandLineRunner implements CommandLineRunner {
    @Autowired
    ItemService itemService;
    private static final Logger log = LoggerFactory.getLogger(ItemSeviceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        Item phone = new Item("iPhone x", 450);
        long item = itemService.saveItem(phone);
        log.info("item added: " + item);
    }
}
