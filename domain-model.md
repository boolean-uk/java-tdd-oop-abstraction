As a system administrator,
I want my users to have to create a user account with an email address and a password.

| Class          | Method                                | Variables                                                                          | Scenario              | Outcome                         |
|----------------|---------------------------------------|------------------------------------------------------------------------------------|-----------------------|---------------------------------|
| AccountManager | addAccount(String email, String pwrd) | String account, <br/>String pwrd<br/>Boolean active <br/>ArrayList<Account> accountList | Account exists        | Print error, return false       |
|                |                                       |                                                                                    | Account doesn't exist | Add to accountList, return true |



I want them to receive an "invalid password" message if they provide a
password less than 8 characters in length.

| Class          | Method                                | Variables                                                                          | Scenario                | Outcome                         |
|----------------|---------------------------------------|------------------------------------------------------------------------------------|-------------------------|---------------------------------|
| AccountManager | addAccount(String email, String pwrd) | String account, <br/>String pwrd<br/>Boolean active<br/> ArrayList<Account> accountList | Invalid password length | Print error, return false       |
|                |                                       |                                                                                    | Valid password length   | Add to accountList, return true |




I want them to receive an "invalid email" message if they provide an email
address without an @ symbol in it.

| Class          | Method                                | Variables                                                                          | Scenario              | Outcome                         |
|----------------|---------------------------------------|------------------------------------------------------------------------------------|-----------------------|---------------------------------|
| AccountManager | addAccount(String email, String pwrd) | String account, <br/>String pwrd<br/>Boolean active <br/>ArrayList<Account> accountList | No "@" in email field | Print error, return false       |
|                |                                       |                                                                                    | Email contains a "@"  | Add to accountList, return true |



I want new accounts to be disabled by default until I manually set them as enabled.

| Class          | Method                                | Variables                                                                          | Scenario                       | Outcome                                      |
|----------------|---------------------------------------|------------------------------------------------------------------------------------|--------------------------------|----------------------------------------------|
| AccountManager | addAccount(String email, String pwrd) | String account, <br/>String pwrd<br/>Boolean active ArrayList<Account> accountList | Account is succesfully created | "Active" bool always set to false by default |



I want users to know if they are able to log in or not based on whether their
account is enabled or disabled.

| Class          | Method    | Variables                      | Scenario                               | Outcome                              |
|----------------|-----------|--------------------------------|----------------------------------------|--------------------------------------|
| AccountManager | loginUser | ArrayList<Account> accountList | Email or Password wrong                | Print error, return false            |
|                |           |                                | login correct, but account is disabled | Print account disabled, return false |
|                |           |                                | login correct, account enabled         | Print login success, return true     |



