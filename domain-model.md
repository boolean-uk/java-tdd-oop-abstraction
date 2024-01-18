
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

| Class       | Fields           | Methods                                   | Situation                                                                   | Output / Response                                                     |
|-------------|------------------|-------------------------------------------|-----------------------------------------------------------------------------|-----------------------------------------------------------------------|
| UserAccount | String password  |                                           |                                                                             |                                                                       |
|             | String email     |                                           |                                                                             |                                                                       |
|             | boolean enabled  |                                           |                                                                             |                                                                       |
|             | boolean loggedIn |                                           |                                                                             |                                                                       |
|             |                  | void enableAccount()                      | The system administrator wants to enable an account                         | The field enabled is set to true                                      |
|             |                  | void disableAccount()                     | The system administrator wants to disable an account                        | The field enabled is set to false                                     |
|             |                  | boolean getEnabled()                      | See if an account is enabled                                                | returns enabled                                                       |
|             |                  | void logIn(String email, String password) | The user wishes to log into their account with correct password and email   | Set field LoggedIn to true                                            |
|             |                  |                                           | The user wishes to log into their account with incorrect password or email  | Set field LoggedIn to false                                           |
|             |                  |                                           | The user wishes to log into their account without the account being enabled | Set field loggedIn to false regardless of password and email provided |
|             |                  | boolean isLoggedIn()                      | Check if user is logged in                                                  | Returns true if user is logged into account                           |
|             |                  | setEmail(String email)                    | email lacks @ symbol                                                        | the user is shown a message "Invalid Email"                           |
|             |                  |                                           | email has @ symbol                                                          | new email is set                                                      |
|             |                  | String getEmail()                         |                                                                             |                                                                       |
|             |                  | void setPassword(String password)         | password is given with less than 8 characters                               | Don't set new password                                                |
|             |                  |                                           | password is given with 8 or more characters                                 | Set new this.password to password                                     |
|             |                  | String getPassword()                      |                                                                             |                                                                       |
