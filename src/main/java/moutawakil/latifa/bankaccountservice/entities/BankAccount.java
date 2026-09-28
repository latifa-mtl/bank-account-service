package moutawakil.latifa.bankaccountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import moutawakil.latifa.bankaccountservice.enums.AccountType;

import java.util.Date;

@Entity
@Data @Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @ManyToOne
    private Customer customer;
}
