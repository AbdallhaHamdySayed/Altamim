package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "COMPANY_ARCHIVE_STOCK_COMPANY_CARDS")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "COMPANY_ARCHIVE_STOCK_COMPANY_CARDS_ID"))
})
public class CompanyArchiveStockCompanyCards extends BaseAuditEntity<Integer> {

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
    @JoinColumn(name = "COMPANY_CARDS_ID")
    private CompanyCards companyCards;

    public CompanyArchiveStockCompanyCards() {
    }

    public CompanyArchiveStockCompanyCards(Company company, CompanyCards companyCards, CompanyArchive companyArchive, String cardNumber, String cardSerial) {
        this.company = company;
        this.companyCards = companyCards;
        this.companyArchive = companyArchive;
        this.cardNumber = cardNumber;
        this.cardSerial = cardSerial;
    }

}
