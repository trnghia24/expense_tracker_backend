package com.expense_tracker.expense_tracker_backend.services.expense;

import com.expense_tracker.expense_tracker_backend.model.Expense;
import com.expense_tracker.expense_tracker_backend.model.User;
import com.expense_tracker.expense_tracker_backend.repository.ExpenseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> fetchAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Optional<List<Expense>> fetchAllExpensesById(UUID id) {
        return expenseRepository.findAllByUser_Id(id);
    }

    @Override
    public Set<Expense> fetchAllExpensesByUser(User user) {
        return expenseRepository.findByUser(user);
    }

    @Override
    public void deleteExpenseById(UUID id) {
        expenseRepository.deleteById(id);
    }
}
