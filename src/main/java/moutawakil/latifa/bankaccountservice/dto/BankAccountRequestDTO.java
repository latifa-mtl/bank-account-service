package moutawakil.latifa.bankaccountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import moutawakil.latifa.bankaccountservice.enums.AccountType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccountRequestDTO{
    private Double balance;
    private String currency;
    private AccountType type;
}
