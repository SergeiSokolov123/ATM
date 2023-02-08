package app.controller;

import app.model.ATM;
import app.service.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BalanceController {

    @Autowired
    private ATMService atmService;

    @GetMapping("/balance")
    public String getAllATMs(Model model) {
        List<ATM> atms = atmService.getAllATMs();
        model.addAttribute("atms", atms);
        return "index";
    }

}