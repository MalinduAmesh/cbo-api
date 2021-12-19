package com.bigzkoop.cboapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long streetID;
    private Long societyID;
    private String streetName;
    private Long cityID;
    private Long divisionID;

    private Long CreatedDate;
}
