package com.example.UserAuthProject.auth;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationRespone> register(@RequestBody RegisterRequest register){
        return ResponseEntity.ok(service.register(register));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationRespone> authenticate(@RequestBody AuthenticationRequest register){
        return ResponseEntity.ok(service.authenticate(register));
    }

}
