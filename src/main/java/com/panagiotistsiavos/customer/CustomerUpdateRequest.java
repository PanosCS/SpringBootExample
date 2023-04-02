package com.panagiotistsiavos.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
