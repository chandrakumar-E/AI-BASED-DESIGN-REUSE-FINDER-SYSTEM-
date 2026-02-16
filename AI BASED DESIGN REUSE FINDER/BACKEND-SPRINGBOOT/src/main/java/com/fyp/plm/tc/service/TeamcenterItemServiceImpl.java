package com.fyp.plm.tc.service;

import com.fyp.plm.tc.dto.TeamcenterItemDTO;
import org.springframework.stereotype.Service;

@Service
public class TeamcenterItemServiceImpl implements TeamcenterItemService {

    @Override
    public TeamcenterItemDTO createItem(TeamcenterItemDTO dto) {
        dto.setTcItemId("TC_" + System.currentTimeMillis());
        return dto;
    }
}
