package edu.bu.met.cs665.ModernSystem;

import edu.bu.met.cs665.Customer;

public class ModernSystem implements CustomerDataViaHttps {
    @Override
    public void printCustomer(int customerId) {
        Customer customer = getCustomerViaHttps(customerId);
        System.out.println("Printing customer data via HTTPS...");
        System.out.println(customer);
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        System.out.println("Retrieving customer data via HTTPS...");
        return new Customer(customerId);
    }
}
