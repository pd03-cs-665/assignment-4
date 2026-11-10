/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2026
 * File Name: CustomerDataAdapter.java
 * Description: Adapter class from modern to legacy system, using the Adapter Design Pattern.
 */

package edu.bu.met.cs665.modern;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.legacy.CustomerDataViaUsb;

public class CustomerDataAdapter implements CustomerDataViaHttps {
    private CustomerDataViaUsb usbCustomerData;

    /**
     * Initialize adapter with legacy system to adapt to.
     * @param usbCustomerData CustomerDataViaUsb legacy system object.
     */
    public CustomerDataAdapter(CustomerDataViaUsb usbCustomerData) {
        this.usbCustomerData = usbCustomerData;
    }

    /**
     * Print customer data via modern system API but calls legacy system under-the-hood.
     * @see edu.bu.met.cs665.modern.CustomerDataViaHttps#printCustomer(int)
     */
    @Override
    public void printCustomer(int customerId) {
        usbCustomerData.printCustomer(customerId);
    }

    /**
     * Get customer data via modern system API but calls legacy system under-the-hood.
     * @see edu.bu.met.cs665.modern.CustomerDataViaHttps#getCustomerViaHttps(int)
     */
    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return usbCustomerData.getCustomerViaUsb(customerId);
    }
}
