package com.expense_tracker.expense_tracker_backend.service;

import com.expense_tracker.expense_tracker_backend.model.Expense;

import java.util.List;

public interface ExpenseService {
    public Expense saveExpense(Expense expense);

    public List<Expense> fetchAllExpenses();

    void deleteExpenseById(int id);
}
