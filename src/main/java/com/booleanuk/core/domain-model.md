| Classes                                  | Variables  | Methods                          | Scenario                              | Output               |
|------------------------------------------|------------|----------------------------------|---------------------------------------|----------------------|
| `Account(String email, String password)` | `email`    | `- setEmail(String email)`       | Valid email.                          | true                 |
|                                          |            |                                  | Invalid email.                        | false, error message |
|                                          | `password` | `- setPassword(String password)` | Valid password.                       | true                 |
|                                          |            |                                  | Invalid password.                     | false, error message |
|                                          | `status`   | `- setStatus(boolean status)`    | Change status to enabled or disabled. | -                    |
|                                          |            | `+ enable()`                     | Set status to enabled.                | -                    |
|                                          |            | `+ disable()`                    | Set status to enabled.                | -                    |
|                                          |            | `+ login()`                      | Account is enabled.                   | true                 |
|                                          |            |                                  | Account is enabled.                   | false                |
