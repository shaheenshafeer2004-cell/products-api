package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Customers")

public class CustomerController {
    @GetMapping("/{id}")
    public Customer getById(@PathVariable long id){
        Address address = new Address("115 New Cavendish Street", "London", "WIW 6UW");
        return new Customer(id, "Ada LoveLace", "ada@example.com",address);

    }
}
