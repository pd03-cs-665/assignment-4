/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2026
 * File Name: LegacySystem.java
 * Description: Concrete implementation of a legacy system.
 */

package edu.bu.met.cs665.legacy;

import edu.bu.met.cs665.Customer;

public class LegacySystem implements CustomerDataViaUsb {

    private int printCallCount = 0;

    /**
     * Get number of times system has printed so far.
     * This is really just for testing purposes.
     * @return Number of times printCustomer was called.
     */
    public int getPrintCallCount() {
        return printCallCount;
    }

    /**
     * Print customer data via legacy system.
     * @see edu.bu.met.cs665.legacy.CustomerDataViaUsb#printCustomer(int)
     */
    @Override
    public void printCustomer(int customerId) {
        printCallCount++;
        Customer customer = getCustomerViaUsb(customerId);
        System.out.println("Printing customer data via USB...");
        System.out.println(customer);
    }

    /**
     * Get Customer object via legacy system.
     * For this assignment, method creates a new Customer object with requested ID.
     * @see edu.bu.met.cs665.legacy.CustomerDataViaUsb#getCustomerViaUsb(int)
     */
    @Override
    public Customer getCustomerViaUsb(int customerId) {
        System.out.println("Retrieving customer data via USB...");
        return new Customer(customerId);
    }
}
