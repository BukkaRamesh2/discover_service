package com.discover.SupportOperation;

import com.discover.entity.Support;

public class SupportProcess extends SupportOperation {

    public SupportProcess(Support support) {
        super(support);
    }

    @Override
    public void checkStatus() {
        if ("Closed".equalsIgnoreCase(support.getStatus())) {
            System.out.println("Support ticket is closed.");
        } else if ("Open".equalsIgnoreCase(support.getStatus()) || support.getStatus() == null) {
            System.out.println("Support ticket is open.");
        } else {
            System.out.println("Support ticket is under process.");
        }
    }

    @Override
    public void closeSupport() {
        if ("Closed".equalsIgnoreCase(support.getStatus())) {
            System.out.println("Support ticket already closed.");
        } else {
            support.setStatus("Closed");
            System.out.println("Support ticket has been closed now.");
        }
    }

    public void displayInfo() {
        System.out.println("Support Ticket Details");
        System.out.println("Support ID: " + support.getSupportId());
        System.out.println("Customer Name: " + support.getCustomerName());
        System.out.println("Description: " + support.getDescription());
        System.out.println("Create Date: " + support.getCreateDate());
        System.out.println("Status: " + support.getStatus());
}
    @Override
    public void getByName() {
        if("Srinath".equalsIgnoreCase(support.getCustomerName())) {
            System.out.println("found the Customer with :"+ support.getCustomerName());
        }else {
            System.out.print("Not Found Customer With :" + support.getCustomerName());
        }
    }



}
