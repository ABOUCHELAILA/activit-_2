package org.sid.bank_account_service.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bank_account_service.enums.AccountType;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BankAccountResponseDTO {
    private String id;
    private Double balance;
    private Date createdAt;
    private String currency;

    private AccountType type;




    }



