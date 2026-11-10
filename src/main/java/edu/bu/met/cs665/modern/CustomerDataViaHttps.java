/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2026
 * File Name: CustomerDataViaHttps.java
 * Description: Interface for modern system.
 */

package edu.bu.met.cs665.modern;

import edu.bu.met.cs665.Customer;

public interface CustomerDataViaHttps {
    /**
     * Method to print customer ID.
     * @param customerId Customer ID to print.
     */
    void printCustomer(int customerId);

    /**
     * Method to get customer object via modern system.
     * @param customerId Customer ID to retrieve.
     * @return Retrieved Customer object.
     */
    Customer getCustomerViaHttps(int customerId);
}
