package com.expense_tracker.expense_tracker_backend.services.expense;

import com.expense_tracker.expense_tracker_backend.model.Expense;
import com.expense_tracker.expense_tracker_backend.model.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface ExpenseService {
    public Expense saveExpense(Expense expense);

    public List<Expense> fetchAllExpenses();

    public Optional<List<Expense>> fetchAllExpensesById(UUID id);

    public Set<Expense> fetchAllExpensesByUser(User user);

    public void deleteExpenseById(UUID id);
}
