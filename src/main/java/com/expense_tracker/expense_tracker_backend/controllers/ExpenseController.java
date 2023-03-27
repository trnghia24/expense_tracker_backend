package com.expense_tracker.expense_tracker_backend.controllers;

import com.expense_tracker.expense_tracker_backend.model.Expense;
import com.expense_tracker.expense_tracker_backend.model.User;
import com.expense_tracker.expense_tracker_backend.services.expense.ExpenseService;
import com.expense_tracker.expense_tracker_backend.types.expense.AddExpenseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/expense")
@CrossOrigin
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@AuthenticationPrincipal User user, @RequestBody AddExpenseRequest request) {
        Expense expense = new Expense(request.getDate(), request.getExpenseName(), request.getAmount(), user);
        return ResponseEntity.ok(expenseService.saveExpense(expense));
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<?> fetchAllExpenses(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(expenseService.fetchAllExpensesByUser(user));
    }

    @DeleteMapping("/{expenseId}")
    public void delete(@PathVariable("expenseId") UUID id) {
        expenseService.deleteExpenseById(id);
    }
}
