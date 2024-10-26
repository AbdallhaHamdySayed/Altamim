package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "customer_info")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_INFO_ID"))
})
public class CustomerInfo extends BaseAuditEntity<Integer> {

    @Column(name = "INFO_TYPE")
    private String infoType;

    @Column(name = "INFO_VALUE")
    private String infoValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMERS_ID")
    private Customers customers;

}
