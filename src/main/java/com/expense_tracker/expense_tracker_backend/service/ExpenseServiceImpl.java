package com.expense_tracker.expense_tracker_backend.service;

import com.expense_tracker.expense_tracker_backend.model.Expense;
import com.expense_tracker.expense_tracker_backend.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{
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
    public void deleteExpenseById(int id) {
        expenseRepository.deleteById(id);
    }
}
