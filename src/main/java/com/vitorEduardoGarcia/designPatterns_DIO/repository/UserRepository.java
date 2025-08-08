package com.vitorEduardoGarcia.designPatterns_DIO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vitorEduardoGarcia.designPatterns_DIO.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // Aqui você pode criar consultas customizadas, se precisar
}
