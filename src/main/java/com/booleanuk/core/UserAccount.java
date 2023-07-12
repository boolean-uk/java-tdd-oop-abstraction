package com.booleanuk.core;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserAccount {
   private String email;
   private boolean accountEnabled;
   private String password;

   public boolean checkEmail(String email){
      return false;
   }

   public boolean checkPassword(String password){
      return false;
   }
}
