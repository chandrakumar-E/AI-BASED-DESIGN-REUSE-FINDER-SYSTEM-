package com.fyp.plm.tc.adapter;

import com.fyp.plm.plm.entity.DesignItem;
import com.fyp.plm.tc.dto.TeamcenterItemDTO;
import com.fyp.plm.tc.service.TeamcenterItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class TeamcenterAdapter {

    private final TeamcenterItemService tcService;

    public TeamcenterAdapter(TeamcenterItemService tcService) {
        this.tcService = tcService;
    }

    public String syncItem(DesignItem item) {
        TeamcenterItemDTO dto = new TeamcenterItemDTO();
        dto.setItemName(item.getName());
        return tcService.createItem(dto).getTcItemId();
    }
}
