# User Stories
(1) As a system administrator,
I want my users to have to create a user account with an email address and a password.

(2) I want them to receive an "invalid password" message if they provide a
password less than 8 characters in length.

(3) I want them to receive an "invalid email" message if they provide an email
address without an @ symbol in it.

(4) I want new accounts to be disabled by default until I manually set them as enabled.

(5) I want users to know if they are able to log in or not based on whether their
account is enabled or disabled.

# Domain Model
## UserAccount

| Members                             | Methods                                             | Scenarios                                         | Outcome                                                     | User Story |
|-------------------------------------|-----------------------------------------------------|---------------------------------------------------|-------------------------------------------------------------|------------|
| `private String email`              |                                                     |                                                   |                                                             |            |
| `private String password`           |                                                     |                                                   |                                                             |            |
| `private boolean enabledOrDisabled` |                                                     |                                                   |                                                             | 4          |
|                                     | `public UserAccount(String email, String password)` |                                                   |                                                             | 1          |
|                                     | `public setPassword(String password)`               | Password is greater than or equal to 8 characters | sets password                                               | 2          |
|                                     |                                                     | Password is less than 8 characters                | does not set password and prints invalid password message   | 2          |
|                                     | `public setEmail(String email)`                     | Email contains @                                  | sets email address                                          | 3          |
|                                     |                                                     | Email does not contain @                          | does not set email address and prints invalid email message | 3          |
|                                     | `public boolean getEnabledOrDisabled()`             | Account is enabled                                | print message that account can be used and return true      | 5          |
|                                     |                                                     | Account is disabled                               | print message that account cannot be used and return false  | 5          |
