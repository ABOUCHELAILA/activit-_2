package org.sid.bank_account_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BankAccount {

   @Id
   private String accountId;
   private double balance;
   private LocalDate createAt;
   private String currency;




}
