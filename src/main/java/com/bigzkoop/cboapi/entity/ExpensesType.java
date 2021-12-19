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
public class ExpensesType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expTypeId;
    private Long name;
    private Long description;
    private Long createdDate;
}
