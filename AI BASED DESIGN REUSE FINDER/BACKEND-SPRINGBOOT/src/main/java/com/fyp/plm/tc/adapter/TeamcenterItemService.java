package com.fyp.plm.tc.adapter;

import com.fyp.plm.plm.entity.DesignItem;
import com.fyp.plm.plm.entity.DesignRevision;

public interface TeamcenterItemService {

    DesignItem createItem(DesignItem item);

    DesignRevision createRevision(Long itemId, DesignRevision revision);

    DesignItem getItemByItemId(String itemId);
}
