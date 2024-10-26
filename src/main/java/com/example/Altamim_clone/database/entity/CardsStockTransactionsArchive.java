package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "CARDS_STOCK_TRANSACTIONS_ARCHIVE")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CARDS_STOCK_TRANSACTIONS_ARCHIVE_ID"))
})
public class CardsStockTransactionsArchive extends BaseAuditEntity<Integer> {

    private static final long serialVersionUID = -7616453696164233457L;

    @Column(name = "CARD_STATUS")
    private Integer cardStatus;

    @Column(name = "CARD_CASHED")
    private Integer cardCashed;

    @Column(name = "CARDS_STOCK_TRANSACTIONS_ID_REF")
    private Integer cardsStockTransactionsRef;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "+02:00")
    @Column(name = "TRANSACTIONS_DATE")
    private Date transactionsDate;

    @Column(name = "CARD_SERIAL")
    private String cardSerial;

    @Column(name = "CARDS_NUMBER")
    private String cardsNumber;

    @Column(name = "TERMINAL_ID")
    private Integer terminalId;

    @Column(name = "UUID_DEVICE")
    private String uuidDevice;

    @Column(name = "PRINT_COPY_COUNT")
    private Integer printCopyCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMERS_ID")
    private Customers customers;

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

}
