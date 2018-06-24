package com.okanmenevseoglu.airportinfomanager.repository;

import com.okanmenevseoglu.airportinfomanager.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
interface BaseJpaRepository<E extends BaseEntity> extends JpaRepository<E, Long> {
}