package com.expense_tracker.expense_tracker_backend.types.expense;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class AddExpenseRequest {
    private LocalDate date;
    private String expenseName;
    private Double amount;
}
