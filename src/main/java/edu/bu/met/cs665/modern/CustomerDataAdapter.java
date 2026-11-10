package edu.bu.met.cs665.modern;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.legacy.CustomerDataViaUsb;

public class CustomerDataAdapter implements CustomerDataViaHttps {
    private CustomerDataViaUsb usbCustomerData;

    public CustomerDataAdapter(CustomerDataViaUsb usbCustomerData) {
        this.usbCustomerData = usbCustomerData;
    }

    @Override
    public void printCustomer(int customerId) {
        usbCustomerData.printCustomer(customerId);
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return usbCustomerData.getCustomerViaUsb(customerId);
    }
}
