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
public class DebitDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long debitDetId;
    private Long debitId;
    private Long totalAmount;
    private Long basicAmount;
    private Long totalInstallments;
    private Long paidInstallments;
    private Long amountPerInstallments;
    private Long remainingInstallments;
    private Long remainingAmount;

}
