package moutawakil.latifa.bankaccountservice.repositories;

import moutawakil.latifa.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
