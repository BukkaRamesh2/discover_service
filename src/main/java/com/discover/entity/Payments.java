package com.discover.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payments implements Comparable<Payments> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentid;
    private String paymentmode;
    private String status;
    private Date paymentdate;

    
    public Payments(Long paymentid, String paymentmode, String status, Date paymentdate) {
        this.paymentid = paymentid;
        this.paymentmode = paymentmode;
        this.status = status;
        this.paymentdate = paymentdate;
    }

    
    public void setPaymentid(Long paymentid) {
        this.paymentid = paymentid;
    }

    public Long getPaymentid() {
        return this.paymentid;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public String getPaymentmode() {
        return this.paymentmode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Date getPaymentdate() {
        return this.paymentdate;
    }

 
    @Override
    public String toString() {
        return "Payments{" +
                "Payment ID=" + paymentid +
                ", Payment Mode='" + paymentmode + '\'' +
                ", Status='" + status + '\'' +
                ", Payment Date=" + paymentdate +
                '}';
    }

   
    @Override
    public int compareTo(Payments other) {
        return this.paymentid.compareTo(other.paymentid);
    }
}