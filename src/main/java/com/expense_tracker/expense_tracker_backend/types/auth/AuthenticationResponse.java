package com.expense_tracker.expense_tracker_backend.types.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class AuthenticationResponse {
    private String firstName;
    private String lastName;
    private String token;
}
