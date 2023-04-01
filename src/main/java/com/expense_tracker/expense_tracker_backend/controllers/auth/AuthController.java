package com.expense_tracker.expense_tracker_backend.controllers.auth;

import com.expense_tracker.expense_tracker_backend.services.auth.AuthenticationService;
import com.expense_tracker.expense_tracker_backend.types.auth.AuthenticationRequest;
import com.expense_tracker.expense_tracker_backend.types.auth.AuthenticationResponse;
import com.expense_tracker.expense_tracker_backend.types.auth.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate (
            @RequestBody AuthenticationRequest request
    ) throws Exception {
        try {
            AuthenticationResponse response = authenticationService.authenticate(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw e;
        }
    }

}
