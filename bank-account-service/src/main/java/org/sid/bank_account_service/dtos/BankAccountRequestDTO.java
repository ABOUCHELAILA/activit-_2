package org.sid.bank_account_service.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bank_account_service.enums.AccountType;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BankAccountRequestDTO {



    private Double balance;

    private String currency;

    private AccountType type;

}
