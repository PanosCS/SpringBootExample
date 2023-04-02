package com.panagiotistsiavos.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
