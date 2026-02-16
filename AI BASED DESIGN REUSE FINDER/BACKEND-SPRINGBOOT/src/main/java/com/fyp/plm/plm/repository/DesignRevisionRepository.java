package com.fyp.plm.plm.repository;

import com.fyp.plm.plm.entity.DesignRevision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DesignRevisionRepository extends JpaRepository<DesignRevision, Long> {
    List<DesignRevision> findByDesignItem_Id(Long itemId);
}
