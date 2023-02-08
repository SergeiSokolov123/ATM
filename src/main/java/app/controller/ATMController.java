package app.controller;

import app.model.ATM;
import app.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atms")
public class ATMController {
    @Autowired
    private final ATMService atmService;

    public ATMController(ATMService atmService) {
        this.atmService = atmService;
    }

    @GetMapping("/{atmId}")
    public ATM getATM(@PathVariable int atmId) {
        return atmService.getATM(atmId);
    }

    @GetMapping
    public List<ATM> getAllATMs() {
        return atmService.getAllATMs();
    }

    @PostMapping
    public void createATM(ATM atm) {
        atmService.createATM(atm);
    }

    @PutMapping("/{atmId}")
    public void updateATM(@PathVariable int atmId, @RequestBody ATM atm) {
        atm.setId(atmId);
        atmService.updateATM(atm);
    }

    @DeleteMapping("/{atmId}")
    public void deleteATM(@PathVariable int atmId) {
        atmService.deleteATM(atmId);
    }

    @DeleteMapping
    public void deleteATMAll(ATM atm) {
        atmService.deleteATMAll();
    }
}