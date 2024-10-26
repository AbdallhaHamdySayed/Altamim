package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cards_stock_transactions_freez")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CARDS_STOCK_TRANSACTIONS_FREEZ_ID"))
})
public class CardsStockTransactionsFreez extends BaseAuditEntity<Integer> {

    @Column(name = "CARD_SERIAL")
    private String cardSerial;

    @Column(name = "CARDS_NUMBER")
    private String cardsNumber;


    @Column(name = "FREEZ_DATE")
    private Date freezDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ARCHIVE_ID")
    private CompanyArchive companyArchive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_CARDS_ID")
    private CompanyCards companyCards;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_INTERNET_CARDS_ID")
    private CompanyInternetCards companyInternetCards;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "freez_transaction_parent_id")
    private FreezTransactionParent freezTransactionParent;

}
