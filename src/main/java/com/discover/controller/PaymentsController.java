package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Payments;
import com.discover.service.PaymentsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/payment")
@Tag(name = "Payments API", description = "Operations related to payments")
public class PaymentsController {

    @Autowired
    private PaymentsService paymentService;

    @PostMapping("/addPayment")
    @Operation(summary = "Add new payment")
    public ResponseEntity<Payments> addPayment(@RequestBody Payments payment){
        Payments saved = paymentService.addPayments(payment);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/getPayment/{paymentid}")
    @Operation(summary = "Get payment by ID")
    public ResponseEntity<Payments> getPayment(@PathVariable("paymentid") Long paymentid){
        Payments payment = paymentService.getPayments(paymentid);
        return ResponseEntity.ok(payment);
    }

    @GetMapping("/getAllPayments")
    @Operation(summary = "Get all payments")
    public ResponseEntity<List<Payments>> getAllPayments(){
        return ResponseEntity.ok(paymentService.getAllPayments());
    }

    @PutMapping("/updatePayments")
    @Operation(summary = "Update payment")
    public ResponseEntity<Payments> updatePayments(@RequestBody Payments payment){
        return ResponseEntity.ok(paymentService.updatePayments(payment));
    }

    @DeleteMapping("/deletePayments/{paymentid}")
    @Operation(summary = "Delete payment by ID")
    public ResponseEntity<Void> deletePayments(@PathVariable("paymentid") Long paymentid){
        paymentService.deletePayments(paymentid);
        return ResponseEntity.noContent().build();
    }
	


}
