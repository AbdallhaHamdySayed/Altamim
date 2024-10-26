package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;



@Entity
@Table(name = "company")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "COMPANY_ID"))
})
public class Company extends BaseAuditEntity<Integer> {

    @Column(name = "NAME_AR")
    private String nameAr;

    @Column(name = "NAME_EN")
    private String nameEn;

    @Column(name = "LOGO_PATH")
    private String logoPath;

    @Column(name = "ACTIVE")
    private Integer active;

    @Column(name = "RECHARGE_CARD")
    private String rechargeCard;

    @Column(name = "RECEIPT_PRINT_LOGO")
    private String receiptPrintLogo;

    @Column(name = "INTERNET_COMPANY_FLAG")
    private Integer internetCompanyFlag;

    @Column(name = "RECHARGE_KEY")
    private String rechargeKey;

    @Column(name = "CARD_SERIAL_KEY")
    private String CardSerialKey;

    @Column(name = "CARD_NUMBER_KEY")
    private String cardNumberKey;

    @Column(name = "CALL_CENTRE")
    private String CallCentre;

    @Column(name = "ENABLE_FLAG")
    private Integer enabled;

}
