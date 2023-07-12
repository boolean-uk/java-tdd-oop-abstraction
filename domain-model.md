# Domain Model

| Class | Methods                                    | Fields            | Scenario                    | Output                    |
|-------|--------------------------------------------|-------------------|-----------------------------|---------------------------|
| User  | User(String password, String email)        | isAdmin: boolean  | user signs up               | void                      |
|       | checkPasswordRequirements(String password) | disabled: boolean | password is long enough     | prints information, true  |
|       |                                            | password: String  | password is not long enough | prints information, false |
|       | checkEmail(String email)                   | email: String     | email contains @            | prints information, true  |
|       |                                            |                   | email does not contain @    | prints information, false |
|       | isDisabled()                               |                   | account is disabled         | true                      |
|       |                                            |                   | account is enabled          | false                     |
|       |                                            |                   |                             |                           |
|       |                                            |                   |                             |                           |
