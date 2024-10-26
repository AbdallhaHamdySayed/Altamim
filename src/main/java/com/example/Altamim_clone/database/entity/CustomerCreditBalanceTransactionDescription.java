package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;


@Entity
@Table(name = "CUSTOMER_CREDIT_BALANCE_TRANSACTION_DESCRIPTION")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_CREDIT_BALANCE_DESCRIPTION_ID"))
})
public class CustomerCreditBalanceTransactionDescription extends BaseAuditEntity<Integer> {

    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;

    @NotNull
    @Column(name = "UUID_DEVICE")
    private String uuidDevice;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_CREDIT_BALANCE_TRANSACTIONS_ID")
    private CustomerCreditBalanceTransactions customerCreditBalanceTransactions;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARDS_STOCK_TRANSACTIONS_ARCHIVE_ID")
    private CardsStockTransactionsArchive cardsStockTransactionsArchive;

    public CustomerCreditBalanceTransactionDescription() {
    }

    public CustomerCreditBalanceTransactionDescription(CustomerCreditBalanceTransactions customerCreditBalanceTransactions, CardsStockTransactionsArchive cardsStockTransactionsArchive,
                                                       String uuidDevice, Date transactionDate) {
        this.cardsStockTransactionsArchive = cardsStockTransactionsArchive;
        this.customerCreditBalanceTransactions = customerCreditBalanceTransactions;
        this.uuidDevice = uuidDevice;
        this.transactionDate = transactionDate;
    }

}
