package com.appdhome.services;
import com.appdhome.entities.Customer;
import com.appdhome.services.CrudService;

import java.util.List;

public interface ICustomerService extends CrudService<Customer> {
    public List<Customer> findByFirstName(String firstname) throws Exception;
    public List<Customer> findByLastName(String lastname) throws Exception;
    public List<Customer> findByFirstNameAndLastName(String firstname, String lastname) throws Exception;
    public Customer findByDni(String dni) throws Exception;
}