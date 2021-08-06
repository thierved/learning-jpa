package com.sadumatic.jpa.learningjpa.Service;

import com.sadumatic.jpa.learningjpa.Entity.Item;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ItemService {

    @PersistenceContext
    private EntityManager entityManager;

    public Long saveItem(Item item) {
        entityManager.persist(item);
        return item.getId();
    }
}
