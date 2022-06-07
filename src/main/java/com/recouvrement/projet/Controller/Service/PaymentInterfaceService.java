package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import com.recouvrement.projet.Model.Payment;

public interface PaymentInterfaceService {
	public Payment addOnePayment(Payment payment);
	public List<Payment> findPayments();
	public Optional<Payment> findOnePayment(String id);
	public void deletePayment(String id);

}
