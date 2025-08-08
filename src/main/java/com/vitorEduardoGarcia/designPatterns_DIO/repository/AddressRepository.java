package com.vitorEduardoGarcia.designPatterns_DIO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vitorEduardoGarcia.designPatterns_DIO.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
    // String porque o ID (zipCode) é texto
}

