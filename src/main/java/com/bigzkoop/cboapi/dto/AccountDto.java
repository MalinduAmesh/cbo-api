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
public class AccountDto {
    private Long accountID;
    private Long accountNumber;
    private Long debitID;
    private Long postOfficeID;
    private Long divisionID;
    private Long villageID;
    private Long streetID;
    private Long valveID;
    private Long gaDivisionID;
    private Long billSectorID;
    private Long billingCategory;

    private String mobileNumber;
    private String lanNumber;
    private String houseNumber;
    private String houseName;

    private Long premisisNumber;
    private Long consumerID;
    private Long societyID;


}
