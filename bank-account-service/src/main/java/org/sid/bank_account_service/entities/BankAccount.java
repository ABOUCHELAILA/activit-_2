package org.sid.bank_account_service.entities;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jdk.jshell.Snippet;
import lombok.Builder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.sid.bank_account_service.enums.AccountType;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BankAccount {

   @Id
   private String id;
   private double balance;
   private Date createdAt;
   private String currency;
   @Enumerated(EnumType.STRING)
   private AccountType type;



}
