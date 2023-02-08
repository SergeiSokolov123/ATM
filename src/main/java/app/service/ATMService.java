package app.service;


import app.model.ATM;
import app.repository.ATMRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ATMService {
    @Autowired
    private final ATMRepository atmRepository;

    public ATMService(ATMRepository atmRepository) {
        this.atmRepository = atmRepository;
    }

    public ATM getATM(int id) {
        return atmRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ATM not found with id: " + id));
    }

    public List<ATM> getAllATMs() {
        return atmRepository.findAll();
    }

    public void createATM(ATM atm) {
        atmRepository.save(atm);
    }

    public void updateATM(ATM atm) {
        atmRepository.save(atm);
    }

    public void deleteATM(int id) {
        atmRepository.deleteById(id);
    }

    public void deleteATMAll() {
        atmRepository.deleteAll();
    }

    public BigDecimal getBalance(int id) {
        ATM atm = atmRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ATM not found with id: " + id));
        return atm.getBalance();
    }
}