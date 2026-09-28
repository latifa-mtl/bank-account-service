package moutawakil.latifa.bankaccountservice.service;

import moutawakil.latifa.bankaccountservice.dto.BankAccountRequestDTO;
import moutawakil.latifa.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService  {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
