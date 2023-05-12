## User stories

1. As a system administrator,
   I want my users to have to create a user account with an email address and a password.

2. I want them to receive an "invalid password" message if they provide a
password less than 8 characters in length.

3. I want them to receive an "invalid email" message if they provide an email
address without an @ symbol in it.

4. I want new accounts to be disabled by default until I manually set them as enabled.

5. I want users to know if they are able to log in or not based on whether their
account is enabled or disabled.

## Domain model

### UserAccount class

| Members           | Methods                                 | Scenario                                           | Outcome                             |
|-------------------|-----------------------------------------|----------------------------------------------------|-------------------------------------|
| String email      | String getEmail()                       | Get email address                                  | Print email address                 |
|                   | String setEmail(String email)           | Set email address                                  | Print success message               |
|                   |                                         | Set email address fails due to invalid entry (!@)  | Print failure message               |
| String password   | String getPassword()                    | Get password                                       | Print password                      |
|                   | String setPassword(String password)     | Set the password                                   | Print successfully created password |
|                   |                                         | Set password fails due to short password (<8ch)    | Print failure message               |
| boolean isEnabled | boolean ableToLogin()                   | User is able to login when account is enabled      | Print success message               |
|                   |                                         | User is not able to login when account is disabled | Print failure message               |
|                   | boolean getIsEnabled()                  | Get status whether account is enabled or disabled  | Print status                        |
|                   | boolean setIsEnabled(boolean isEnabled) | Set account to disabled or enabled                 | Print succes message                |
