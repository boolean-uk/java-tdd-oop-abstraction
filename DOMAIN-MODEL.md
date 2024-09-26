##Test

| Classes   | Attributes               | Methods                        | Scenario                                     | Results                                                              |
|-----------|--------------------------|--------------------------------|----------------------------------------------|----------------------------------------------------------------------|
| `Account` |                          |                                |                                              |                                                                      |
|           | `String emailAdress`     |                                |                                              |                                                                      |
|           | `String password`        |                                |                                              |                                                                      |
|           | `boolean enable = false` |                                |                                              |                                                                      |
|           |                          | `checkPassword()`              | if the password is smaller than 8 characters | return false and print a message                                     |
|           |                          |                                | else                                         | return true                                                          |
|           |                          | `checkEmail()`                 | if the email does not have an @ symbol       | return false and print a message                                     |
|           |                          |                                | else                                         | return true                                                          |
|           |                          | `setEmail(String email)`       | if email is valid                            | return true, prints a message and sets the email to the new value    |
|           |                          |                                | else                                         | return false and print a message                                     |
|           |                          | `setPassword(String password)` | if password is valid                         | return true, prints a message and sets the password to the new value |
|           |                          |                                | else                                         | return false and print a message                                     |
|           |                          | `canLogin()`                   | if enabled is true                           | return message `can log in`                                          |
|           |                          |                                | else                                         | return message `can't log in`                                        |
|           |                          | `enable()`                     | if both email and password are valid         | return true and change enabled to true                               |
|           |                          |                                | else                                         | return false                                                         |
