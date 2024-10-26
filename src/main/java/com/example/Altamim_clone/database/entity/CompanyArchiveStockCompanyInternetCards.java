package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "COMPANY_ARCHIVE_STOCK_COMPANY_INTERNET_CARDS")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "COMPANY_ARCHIVE_STOCK_COMPANY_INTERNET_CARDS_ID"))
})
public class CompanyArchiveStockCompanyInternetCards extends BaseAuditEntity<Integer> {

    @Column(name = "CARD_SERIAL")
    private String cardSerial;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ARCHIVE_ID")
    private CompanyArchive companyArchive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_INTERNET_CARDS_ID")
    private CompanyInternetCards companyInternetCards;

    public CompanyArchiveStockCompanyInternetCards() {
    }

    public CompanyArchiveStockCompanyInternetCards(Company company, CompanyInternetCards companyInternetCards, CompanyArchive companyArchive, String cardNumber, String cardSerial) {
        this.company = company;
        this.companyInternetCards = companyInternetCards;
        this.companyArchive = companyArchive;
        this.cardNumber = cardNumber;
        this.cardSerial = cardSerial;
    }


}
