/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2026
 * File Name: ModernSystem.java
 * Description: Concrete implementation of a modern system.
 */

package edu.bu.met.cs665.modern;

import edu.bu.met.cs665.Customer;

public class ModernSystem implements CustomerDataViaHttps {
    /**
     * Print customer data via modern system.
     * @see edu.bu.met.cs665.modern.CustomerDataViaHttps#printCustomer(int)
     */
    @Override
    public void printCustomer(int customerId) {
        Customer customer = getCustomerViaHttps(customerId);
        System.out.println("Printing customer data via HTTPS...");
        System.out.println(customer);
    }

    /**
     * Get Customer object via modern system.
     * For this assignment, method creates a new Customer object with requested ID.
     * @see edu.bu.met.cs665.modern.CustomerDataViaHttps#getCustomerViaHttps(int)
     */
    @Override
    public Customer getCustomerViaHttps(int customerId) {
        System.out.println("Retrieving customer data via HTTPS...");
        return new Customer(customerId);
    }
}
