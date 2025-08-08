package com.vitorEduardoGarcia.designPatterns_DIO.client;

import com.vitorEduardoGarcia.designPatterns_DIO.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zipcode", url = "https://viacep.com.br/ws")
public interface ZipCodeClient {

    @GetMapping("/{zipCode}/json/")
    Address getAddressByZip(@PathVariable("zipCode") String zipCode);
}
