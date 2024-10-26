package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;
import java.sql.Blob;
import java.util.Date;



@Entity
@Table(name = "COMPANY_ARCHIVE")
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "COMPANY_ARCHIVE_ID"))
})
public class CompanyArchive extends BaseAuditEntity<Integer> {

    @Column(name = "FILE_NAME")
    private String fileName;

    @Lob
    @Column(name = "FILE")
    private Blob file;

    @Column(name = "UPLOAD_DATE")
    private Date uploadDate;

    @Column(name = "EXCEL_FILE")
    private String excelFile;

    @Column(name = "total_success_rows")
    private Integer totalSuccessRows;

    @Column(name = "operation_status")
    private Integer operationStatus;

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
