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

| Classes | Members         | Methods                               | Scenario             | Output |
|---------|-----------------|---------------------------------------|----------------------|--------|
| Account |                 | create(String email, String password) | If email invalid     | false  |
|         |                 |                                       | If password invalid  | false  |
|         |                 |                                       | Else                 | true   |
|         |                 | emailInvalid(String email)            | If no "@"            | true   |
|         |                 |                                       | Else                 | false  |
|         |                 | passwordInvalid(String password)      | If less than 8 chars | true   |
|         |                 |                                       | Else                 | false  |
|         |                 | login(String email, String password)  | If doesn't exists    | false  |
|         |                 |                                       | If password is wrong | false  |
|         |                 |                                       | If not enabled       | false  |
|         |                 |                                       | Else                 | true   |
|         | boolean enabled | enable()                              | Set enabled to true  | void   |
