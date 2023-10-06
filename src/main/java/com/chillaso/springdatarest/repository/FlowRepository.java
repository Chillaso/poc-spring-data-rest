package com.chillaso.springdatarest.repository;

import com.chillaso.springdatarest.entity.Flow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel= "flows", path = "flows")
public interface FlowRepository extends JpaRepository<Flow, Long> {
    Flow findByName(@Param("name") String name);
}
