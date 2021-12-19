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
public class CategoryDto {
    private Long catId;
    private Long societyId;
    private String name;
    private Long ConnectionFee;
    private String description;

    private String createdDate;



}
