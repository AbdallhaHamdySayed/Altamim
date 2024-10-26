package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "customers")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "CUSTOMERS_ID"))
})
public class Customers extends BaseAuditEntity<Integer> {

    @Version
    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "BALANCE")
    private Float balance;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "activate_status")
    private Integer activateStatus;

    @Column(name = "ALLOW_NEGATIVE_BALANCE")
    private Integer allowNegativeBalance;

    @Column(name = "full_address")
    private String fullAddress;

    @Column(name = "special_sign_address")
    private String specialSignAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_activities_id")
    private CustomerActivities customerActivities;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "governorate_lookup_id")
    private GovernorateLookup governorateLookup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cities_lookup_id")
    private CitiesLookup citiesLookup;

}
