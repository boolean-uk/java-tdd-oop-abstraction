# Domain Model

## User Stories
```
As a system administrator,
I want my users to have to create a user account with an email address and a password.

I want them to receive an "invalid password" message if they provide a
password less than 8 characters in length.

I want them to receive an "invalid email" message if they provide an email
address without an @ symbol in it.

I want new accounts to be disabled by default until I manually set them as enabled.

I want users to know if they are able to log in or not based on whether their
account is enabled or disabled.
```

| Method                            | Member                                         | Scenario            | Return                |
|-----------------------------------|------------------------------------------------|---------------------|-----------------------|
| Account(email, password, enabled) | String email, String password, Boolean enabled |                     |                       |
| getEmail()                        |                                                |                     |                       |
| getPassword()                     |                                                |                     |                       |
| setEmail()                        |                                                |                     |                       |
| setPassword()                     |                                                |                     |                       |
| getStatus()                       |                                                |                     |                       |
| setStatus()                       |                                                |                     |                       |
| validatePassword()                | String password                                | valid password      | "valid password"      |
|                                   |                                                | invalid password    | "invalid password"    |
| validateEmail()                   | String email                                   | valid email         | "valid email"         |
|                                   |                                                | invalid email       | "invalid email"       |
| activeAccount()                   | Boolean enabled                                | account is disabled | "Account is disabled" |
|                                   |                                                | Account is enabled  | "account is enabled"  |
