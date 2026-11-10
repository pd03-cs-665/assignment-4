package edu.bu.met.cs665.modern;

import edu.bu.met.cs665.Customer;

public interface CustomerDataViaHttps {
    void printCustomer(int customerId);

    Customer getCustomerViaHttps(int customerId);
}
