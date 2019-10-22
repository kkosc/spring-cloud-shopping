package pl.training.shopping.paymentservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.training.shopping.paymentservice.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
