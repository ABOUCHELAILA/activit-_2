package org.sid.bank_account_service.service;


import org.sid.bank_account_service.dtos.BankAccountRequestDTO;
import org.sid.bank_account_service.dtos.BankAccountResponseDTO;

public interface AccountService {



        public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    }





