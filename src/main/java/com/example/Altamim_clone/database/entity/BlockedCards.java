package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "blocked_cards")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "BLOCKED_CARDS_ID"))
})
public class BlockedCards extends BaseAuditEntity<Integer> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMERS_ID")
    private Customers customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_CARDS_ID")
    private CompanyCards companyCards;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_INTERNET_CARDS_ID")
    private CompanyInternetCards companyInternetCards;

}
