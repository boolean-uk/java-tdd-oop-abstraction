# Domain model

| Class                | Attributes        | Methods                                  | Scenario                              | Outputs        |
|----------------------|-------------------|------------------------------------------|---------------------------------------|----------------|
| abstract User        | String email      | boolean isPasswordValid(String password) | if length>=8                          | true           |
|                      | String password   |                                          | if length<8                           | false          |
|                      |                   | boolean isEmailValid(String email)       | if email contains "@"                 | true           |
|                      | boolean isEnabled |                                          | if email doesn't contain "@"          | false          |
|                      |                   | String isAbleToLogIn()                   | if isEnabled is false returns message | String message |
| Administrator : User |                   | void activateAccount(User user)          | activates user s account              | void           |
|                      |                   |                                          |                                       |                |
| basicUser : User     |                   |                                          |                                       |                |
|                      |                   |                                          |                                       |                |
