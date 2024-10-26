package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;



@Entity
@Table(name = "EMPLOYEE")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "EMPLOYEE_ID"))
})
@Data
public class Employee extends BaseAuditEntity<Integer> {

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "FULL_NAME")
    private String fullName;

}
