package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "CUSTOMER_TRANSACTIONS")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_TRANSACTIONS_ID"))
})
public class CustomerTransactions extends BaseAuditEntity<Integer> {

    @Column(name = "TRANSACTION_DATE")
    private Date transactionsDate;

    @Column(name = "TERMINAL_ID")
    private Integer terminalId;

    @Column(name = "UUID_DEVICE")
    private String uuidDevice;

    @Column(name = "SECURITY_USER_ID")
    private String userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMERS_ID")
    private Customers customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARDS_STOCK_TRANSACTIONS_ARCHIVE_ID")
    private CardsStockTransactionsArchive cardsStockTransactionsArchive;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRANSACTION_TYPE_ID")
    private TransactionTypeLu transactionType;

}
