/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2026
 * File Name: CustomerDataViaUsb.java
 * Description: Interface for legacy system.
 */

package edu.bu.met.cs665.legacy;

import edu.bu.met.cs665.Customer;

public interface CustomerDataViaUsb {
    /**
     * Method to print customer ID.
     * @param customerId Customer ID to print.
     */
    void printCustomer(int customerId);

    /**
     * Method to get customer object via legacy system.
     * @param customerId Customer ID to retrieve.
     * @return Retrieved Customer object.
     */
    Customer getCustomerViaUsb(int customerId);
}
