package com.fyp.plm.plm.service;

import com.fyp.plm.plm.entity.DesignItem;

public interface DesignItemService {
    DesignItem createDesignItem(DesignItem item);
    DesignItem getDesignItem(Long id);
}
