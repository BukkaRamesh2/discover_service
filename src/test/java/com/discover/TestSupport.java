package com.discover;
//import com.discover.SupportOperation.SupportProcess;
import com.discover.entity.Support;


import java.util.Date;

public class TestSupport {
    public static void main(String[] args) {
        Support support = new Support(101L, "John Doe", "Issue with login", new Date(), "Open");

//        SupportProcess process = new SupportProcess(support);

//        process.checkStatus();
//        process.displayInfo();
//        process.closeSupport();
//        process.getByName();
        }

}
