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
public class ConsumerDto {

    private Long consumerId;
    private Long societyId;
    private String nic;
    private Long initials;
    private String firstName;
    private String lastName;
    private String dob;

    private String profileImages;
    private String nicFront;
    private String nicBack;
    private String signature;

    private String createdDate;

}
