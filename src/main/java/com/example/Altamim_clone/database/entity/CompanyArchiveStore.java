package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPANY_ARCHIVE_STORE")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "COMPANY_ARCHIVE_STORE_ID"))
})
public class CompanyArchiveStore extends BaseAuditEntity<Integer> {

    @Column(name = "CARD_SERIAL")
    private String cardSerial;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "CARD_NUMBER_BEFORE_ENCRYPT")
    private String cardNumberBeforeEncrypt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ARCHIVE_ID")
    private CompanyArchive companyArchive;

    public CompanyArchiveStore() {
    }

    public CompanyArchiveStore(String cardNumber, String cardSerial) {
        this.cardNumber = cardNumber;
        this.cardSerial = cardSerial;
    }

}
