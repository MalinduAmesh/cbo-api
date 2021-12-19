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
public class UserPermissionDto {
    private Long roleID;
    private Long roleName;
    private boolean addNewProject;
    private boolean viewReport;
    private boolean reading;
    private boolean permissionToMainAccount;
    private boolean changeAccountBalance;
    private boolean transactionPasswordChange;
    private boolean passwordChangeOwn;
    private boolean setNewPannel;
    private boolean addNewConsumer;
    private boolean addCustomerBulk;
    private boolean addProductBulk;
    private boolean categoryAddDelete;
    private boolean adjustBillMargins;
    private boolean reverseTransaction;
    private boolean userCrud;
    private boolean addLedgerAccount;
    private boolean passwordChangeOthers;
    private boolean viewAssignerReports;
    private boolean editUser;
    private boolean createNewAccount;
    private boolean transactionsFromCategoryAccounts;
}
