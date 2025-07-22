package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Payments;
import com.discover.exception.PaymentNotFoundException;
import com.discover.repository.PaymentsRepository;

@Service
public class PaymentsServiceImpl implements PaymentsService {

    @Autowired
    private PaymentsRepository paymentsRepository;

    @Override
    public Payments addPayments(Payments payment) {
        if (payment.getPaymentid() != null) {
            throw new PaymentNotFoundException("Do not pass ID. It will be auto-generated.");
        }
        return paymentsRepository.save(payment);
    }

    @Override
    public Payments getPayments(Long paymentid) {
        return paymentsRepository.findById(paymentid)
                .orElseThrow(() -> new PaymentNotFoundException("Payment ID " + paymentid + " not found."));
    }

    @Override
    public Payments updatePayments(Payments payment) {
        if (payment.getPaymentid() == null) {
            throw new PaymentNotFoundException("You must pass PaymentID to update the payment.");
        }
        Payments existingPayment = paymentsRepository.findById(payment.getPaymentid())
                .orElseThrow(() -> new PaymentNotFoundException("Payment ID " + payment.getPaymentid() + " not found."));
        BeanUtils.copyProperties(payment, existingPayment, "paymentid");
        return paymentsRepository.save(existingPayment);
    }

    @Override
    public List<Payments> getAllPayments() {
        return paymentsRepository.findAll();
    }

    @Override
    public void deletePayments(Long paymentid) {
        if (!paymentsRepository.existsById(paymentid)) {
            throw new PaymentNotFoundException("Payment ID " + paymentid + " not found.");
        }
        paymentsRepository.deleteById(paymentid);
    }
}

