package com.sadumatic.jpa.learningjpa.Repository;

import com.sadumatic.jpa.learningjpa.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
