package pl.training.shopping.paymentservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.training.shopping.paymentservice.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
