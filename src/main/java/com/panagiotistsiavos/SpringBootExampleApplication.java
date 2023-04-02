package com.panagiotistsiavos;

import com.panagiotistsiavos.customer.Customer;
import com.panagiotistsiavos.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBootExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            Customer alex = new Customer("Alex", "test@mail.com", 21);
            List<Customer> customers = List.of(alex);
            customerRepository.saveAll(customers);
        };
    }

}
