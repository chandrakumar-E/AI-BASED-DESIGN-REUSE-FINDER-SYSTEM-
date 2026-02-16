package com.fyp.plm.plm.service.Impl;

import com.fyp.plm.plm.entity.DesignItem;
import com.fyp.plm.plm.repository.DesignItemRepository;
import com.fyp.plm.plm.service.DesignItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class DesignItemServiceImpl implements DesignItemService {

    private final DesignItemRepository repo;

    public DesignItemServiceImpl(DesignItemRepository repo) {
        this.repo = repo;
    }

    @Override
    public DesignItem createDesignItem(DesignItem item) {
        return repo.save(item);
    }

    @Override
    public DesignItem getDesignItem(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("DesignItem not found"));
    }
}
