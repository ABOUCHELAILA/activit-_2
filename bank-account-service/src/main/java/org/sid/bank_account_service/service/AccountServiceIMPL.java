package org.sid.bank_account_service.service;

import jakarta.transaction.Transactional;
import org.sid.bank_account_service.dtos.BankAccountRequestDTO;
import org.sid.bank_account_service.dtos.BankAccountResponseDTO;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountServiceIMPL  implements AccountService {
    @Override



    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        return null;
    }



}
