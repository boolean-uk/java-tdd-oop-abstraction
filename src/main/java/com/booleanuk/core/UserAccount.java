package com.booleanuk.core;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserAccount {
   private String email;
   private boolean accountEnabled;
   private String password;
}
