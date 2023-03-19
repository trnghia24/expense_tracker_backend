package com.expense_tracker.expense_tracker_backend.controller;

import com.expense_tracker.expense_tracker_backend.model.Expense;
import com.expense_tracker.expense_tracker_backend.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
@CrossOrigin
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public Expense add(@RequestBody Expense expense) {
        expenseService.saveExpense(expense);
        return expense;
    }

    @GetMapping("/fetchAll")
    public List<Expense> fetchAllExpenses() {
        return expenseService.fetchAllExpenses();
    }

    @DeleteMapping("/{expenseId}")
    public void delete(@PathVariable("expenseId") int id) {
        expenseService.deleteExpenseById(id);
    }
}
