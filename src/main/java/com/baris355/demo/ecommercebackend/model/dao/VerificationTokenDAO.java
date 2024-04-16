package com.baris355.demo.ecommercebackend.model.dao;

import com.baris355.demo.ecommercebackend.model.LocalUser;
import com.baris355.demo.ecommercebackend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);

    void deleteByUser(LocalUser user);

}
