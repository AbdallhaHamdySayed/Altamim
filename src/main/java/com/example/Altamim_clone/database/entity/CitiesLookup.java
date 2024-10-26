package com.example.Altamim_clone.database.entity;

import com.example.Altamim_clone.database.entity.base.BaseAuditEntity;
import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "cities_lookup")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "cities_lookup_id"))
})
@Data
public class CitiesLookup extends BaseAuditEntity<Integer> {

    @Column(name = "city_name_ar")
    private String cityNameAr;

    @Column(name = "city_name_en")
    private String cityNameEn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "governorate_lookup_id")
    private GovernorateLookup governorateLookup;

}
