package com.fyp.plm.plm.repository;

import com.fyp.plm.plm.entity.DesignItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DesignItemRepository extends JpaRepository<DesignItem, Long> {
    Optional<DesignItem> findByItemId(String itemId);
}
