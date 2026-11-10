package edu.bu.met.cs665.ModernSystem;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.LegacySystem.CustomerDataViaUsb;

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
