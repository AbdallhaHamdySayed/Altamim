package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "customer_activities")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "customer_activities_id"))
})
public class CustomerActivities extends BaseAuditEntity<Integer> {

    @Column(name = "customer_activities_description")
    private String customerActivitiesDescription;
}
