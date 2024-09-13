package com.hotelreservation.HotelReservationApplication.controller;

import com.hotelreservation.HotelReservationApplication.entity.Payment;
import com.hotelreservation.HotelReservationApplication.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //get
    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable int paymentId){
        return paymentService.getPaymentDetails(paymentId);
    }
    //post
    @PostMapping
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }
    //put
    @PutMapping("/{paymentId}")
    public Payment updatePaymentDetails(@PathVariable int paymentId, @RequestBody Payment payment) throws Exception {
        if(paymentId == payment.getPaymentId()){
            return paymentService.validatePayment(payment);
        }
        else
             throw new Exception("id not match");
    }

    //delete
    @DeleteMapping("/{paymentId}")
    public void deletePayment(@PathVariable int paymentId){
        paymentService.deletePayment(paymentId);
    }


}
