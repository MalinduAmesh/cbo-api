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
public class SocietyDto {
    private Long societyID;
    private String name;
    private String address;
    private String description;

    private Long createdDate;
}
