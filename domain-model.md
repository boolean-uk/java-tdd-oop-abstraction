# Domain Model

| Class | Methods                                           | Fields            | Scenario                                      | Output                    |
|-------|---------------------------------------------------|-------------------|-----------------------------------------------|---------------------------|
| User  | register(String password, String email)<br/><br/> | isAdmin: boolean  | register an account with provided information | void                      |
|       | login(String password, String email)              |                   |                                               |                           |
|       | checkRequirements(String password)                | disabled: boolean | password is long enough                       | prints information, void  |
|       |                                                   | password: String  | password is not long enough                   | prints information, false |
|       |                                                   | email: String     | email contains @                              | prints information, true  |
|       |                                                   |                   | email does not contain @                      | prints information, false |
|       | isDisabled()                                      |                   | account is disabled                           | true                      |
|       |                                                   |                   | account is enabled                            | false                     |
|       |                                                   |                   |                                               |                           |
|       |                                                   |                   |                                               |                           |
