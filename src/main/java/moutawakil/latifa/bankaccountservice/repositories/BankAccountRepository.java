package moutawakil.latifa.bankaccountservice.repositories;

import moutawakil.latifa.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
