package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "CARDS_STOCK_TRANSACTIONS")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CARDS_STOCK_TRANSACTIONS_ID"))
})
public class CardsStockTransactions extends BaseAuditEntity<Integer> {

    @Column(name = "CARD_SERIAL")
    private String cardSerial;

    @Column(name = "CARD_SERIAL_QUERYABLE")
    private String cardSerialQueryable;

    @Column(name = "CARDS_NUMBER")
    private String cardsNumber;

    @Column(name = "ENCRYPTED_FLAG")
    private Integer encryptedFlag;

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

    public CardsStockTransactions() {
    }

    public CardsStockTransactions(Integer id, String cardSerial, String cardsNumber, Company company) {
        this.cardSerial = cardSerial;
        this.cardsNumber = cardsNumber;
        this.setId(id);
        this.company = company;
    }

    public CardsStockTransactions(Integer id, String cardSerial, String cardsNumber, Company company,
                                  CompanyCards companyCards, CompanyInternetCards companyInternetCards) {
        this.cardSerial = cardSerial;
        this.cardsNumber = cardsNumber;
        this.setId(id);
        this.company = company;
        this.companyCards = companyCards;
        this.companyInternetCards = companyInternetCards;
    }
}
