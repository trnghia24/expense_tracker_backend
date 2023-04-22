package com.expense_tracker.expense_tracker_backend.types.expense;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddExpenseRequest {
    private long date;
    private String expenseName;
    private Double amount;
}
