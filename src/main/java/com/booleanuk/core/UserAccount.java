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

   public String checkEmail(String email){
      if (email.contains("@")){
         return "valid email";
      }
      return "invalid email";
   }

   public String checkPassword(String password){
      if (password.length() >= 8){
      return "valid password";
      }
      return "invalid password";


   }
}
