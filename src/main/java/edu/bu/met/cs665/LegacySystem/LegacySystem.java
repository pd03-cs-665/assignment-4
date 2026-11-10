package edu.bu.met.cs665.LegacySystem;

import edu.bu.met.cs665.Customer;

public class LegacySystem implements CustomerDataViaUsb{
    @Override
    public void printCustomer(int customerId) {
        Customer customer = getCustomerViaUsb(customerId);
        System.out.println("Printing customer data via USB...");
        System.out.println(customer);
    }

    @Override
    public Customer getCustomerViaUsb(int customerId) {
        System.out.println("Retrieving customer data via USB...");
        return new Customer(customerId);
    }
}
