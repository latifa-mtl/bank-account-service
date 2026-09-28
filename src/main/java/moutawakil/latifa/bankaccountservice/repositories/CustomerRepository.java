package moutawakil.latifa.bankaccountservice.repositories;

import moutawakil.latifa.bankaccountservice.entities.BankAccount;
import moutawakil.latifa.bankaccountservice.entities.Customer;
import moutawakil.latifa.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
