package com.goncharoff.spring5webapp.repositories;

import com.goncharoff.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Id> {
}
