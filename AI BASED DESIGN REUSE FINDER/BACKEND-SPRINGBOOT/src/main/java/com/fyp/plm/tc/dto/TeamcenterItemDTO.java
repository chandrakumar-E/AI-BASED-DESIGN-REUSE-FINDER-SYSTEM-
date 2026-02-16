package com.fyp.plm.tc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class TeamcenterItemDTO {
    private String tcItemId;
    private String itemName;


    public String getTcItemId() {
        return tcItemId;
    }

    public void setTcItemId(String tcItemId) {
        this.tcItemId = tcItemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
