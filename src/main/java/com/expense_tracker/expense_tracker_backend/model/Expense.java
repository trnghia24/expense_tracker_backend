package com.expense_tracker.expense_tracker_backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="expenses")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    @NonNull
    private LocalDate date;
    @NonNull
    private String expenseName;
    @NonNull
    private Double amount;
    @NonNull
    @ManyToOne(optional = false)
    private User user;

//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public String getExpenseName() {
//        return expenseName;
//    }
//
//    public void setExpenseName(String expenseName) {
//        this.expenseName = expenseName;
//    }
//
//    public Double getAmount() {
//        return amount;
//    }
//
//    public void setAmount(Double amount) {
//        this.amount = amount;
//    }
}
