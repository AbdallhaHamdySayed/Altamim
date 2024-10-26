package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "CUSTOMER_CREDIT_BALANCE_TRANSACTIONS")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_CREDIT_BALANCE_TRANSACTIONS_ID"))
})
public class CustomerCreditBalanceTransactions extends BaseAuditEntity<Integer> {

    @Column(name = "CURRENT_TRANSACTION_VALUE")
    private Float currentTransactionValue;

    @Column(name = "NEW_TRANSACTION_VALUE")
    private Float newTransactionValue;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;

    @Column(name = "CREDIT_BALANCE_TRANSACTIONS_SERIAL")
    private String transactionsSerial;

    @Column(name = "UUID_DEVICE" , nullable = false)
    private String uuidDevice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMERS_ID")
    private Customers customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRANSACTION_TYPE_LU_ID")
    private TransactionTypeLu transactionTypeLu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_RECIVED_ID")
    private Employee employee;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARDS_STOCK_TRANSACTIONS_ARCHIVE_ID")
    private CardsStockTransactionsArchive cardsStockTransactionsArchive;

}
