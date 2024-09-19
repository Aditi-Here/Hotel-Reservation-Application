package com.hotelreservation.HotelReservationApplication.service;

import com.hotelreservation.HotelReservationApplication.controller.PaymentController;
import com.hotelreservation.HotelReservationApplication.entity.Payment;
import com.hotelreservation.HotelReservationApplication.repository.PaymentRepository;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    // get
    public Payment getPaymentDetails(int paymentId){
        return paymentRepository.findById(paymentId).get();
    }
    //post
    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    //put
    public Payment validatePayment(Payment payment){
        Payment dataBasePayment = paymentRepository.findById(payment.getPaymentId()).get();

        dataBasePayment.setCardNumber(payment.getCardNumber());
        dataBasePayment.setEmail(payment.getCardNumber());
        dataBasePayment.setFirstName(payment.getFirstName());
        dataBasePayment.setLastName(payment.getLastName());

        paymentRepository.save(payment);
        return payment;
    }
    //delete
    public void deletePayment(int paymentId){
        paymentRepository.deleteById(paymentId);
    }
}
