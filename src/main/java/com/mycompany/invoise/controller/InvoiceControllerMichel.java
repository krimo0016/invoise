package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

public class InvoiceControllerMichel {

    public void createInvoiceUsingWebForm(){
        String customerName="Tesla";
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceServiceMichel invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }
}
