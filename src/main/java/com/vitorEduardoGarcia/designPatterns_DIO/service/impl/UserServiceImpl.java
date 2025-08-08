package com.vitorEduardoGarcia.designPatterns_DIO.service.impl;

import com.vitorEduardoGarcia.designPatterns_DIO.client.ZipCodeClient;
import com.vitorEduardoGarcia.designPatterns_DIO.model.Address;
import com.vitorEduardoGarcia.designPatterns_DIO.model.User;
import com.vitorEduardoGarcia.designPatterns_DIO.repository.AddressRepository;
import com.vitorEduardoGarcia.designPatterns_DIO.repository.UserRepository;
import com.vitorEduardoGarcia.designPatterns_DIO.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ZipCodeClient zipCodeClient;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public void save(User user) {
        saveUserWithZip(user);
    }

    @Override
    public void update(Long id, User user) {
        Optional<User> dbUser = userRepository.findById(id);
        if (dbUser.isPresent()) {
            saveUserWithZip(user);
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    private void saveUserWithZip(User user) {
        String zip = user.getAddress().getZipCode();

        Address address = addressRepository.findById(zip)
                .orElseGet(() -> {
                    Address newAddress = zipCodeClient.getAddressByZip(zip);
                    addressRepository.save(newAddress);
                    return newAddress;
                });

        user.setAddress(address);
        userRepository.save(user);
    }
}
