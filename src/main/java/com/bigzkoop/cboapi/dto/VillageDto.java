package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VillageDto {
    private Long villageID;
    private Long societyID;
    private Long villageName;
    private Long cityID;
    private Long divisionID;

    private Long createdDate;
}
