package com.example.thikt_md4.controller;

import com.example.thikt_md4.model.Transaction;
import com.example.thikt_md4.service.CustomerService;
import com.example.thikt_md4.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/transaction")
@AllArgsConstructor
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getAllTransactions(Model model) {
        List<Transaction> transactions = transactionService.getAllTransactions();
        model.addAttribute("transactions", transactions);
        return "transactions";
    }

    @GetMapping("/{id}")
    public String getTransactionById(@PathVariable Long id, Model model) {
        Transaction transaction = transactionService.getTransactionById(id);
        model.addAttribute("transaction", transaction);
        return "transactionDetail"; // Trả về view "transactionDetail" để hiển thị chi tiết giao dịch
    }

    @PostMapping
    public String addTransaction(@ModelAttribute Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return "redirect:/transaction"; // Chuyển hướng người dùng đến trang danh sách giao dịch sau khi thêm giao dịch thành công
    }

    @GetMapping("/new")
    public String showCreateTransaction(Model model) {
        model.addAttribute("transaction", new Transaction());

        model.addAttribute("customers", customerService.getAllCustomers());
        return "addTransaction"; // Chuyển hướng người dùng đến trang danh sách giao dịch sau khi thêm giao dịch thành công
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
        return "redirect:/transaction"; // Chuyển hướng người dùng đến trang danh sách giao dịch sau khi xóa giao dịch thành công
    }
}

