package com.okanmenevseoglu.airportinfomanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @Column(name = "ID")
    private Long id;
}