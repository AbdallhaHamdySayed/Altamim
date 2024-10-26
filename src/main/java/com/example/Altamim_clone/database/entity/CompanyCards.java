package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;



@Entity
@Table(name = "COMPANY_CARDS")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "COMPANY_CARDS_ID"))
})
public class CompanyCards extends BaseAuditEntity<Integer> {

    @Column(name = "SELLING_PRICE")
    private Float sellingPrice;

    @Column(name = "PURCHASING_PRICE")
    private Float PurchasingPrice;

    @Column(name = "CASHED")
    private Integer cashed;

    @Column(name = "CARD_LOGO_PATH")
    private String cardLogoPath;

    @Column(name = "CARD_SORT_PER_COMPANY")
    private Integer cardSort;

    @Column(name = "CARD_CATEGORY")
    private String cardCategory;

    @Column(name = "card_active_flag")
    private Integer cardActiveFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

}
