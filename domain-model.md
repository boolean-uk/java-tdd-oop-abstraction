## Domain Model

| Class  | Attributes                 | Methods                                            | Scenarios                         | Outcomes                                         |
|--------|----------------------------|----------------------------------------------------|-----------------------------------|--------------------------------------------------|
| User   |                            |                                                    |                                   |                                                  |
|        | String Email               |                                                    |                                   |                                                  |
|        | String Password            |                                                    |                                   |                                                  |
|        | Boolean isEnabled = false  |                                                    |                                   |                                                  |
|        |                            | String createAccount(String email,String password) | 1.Successful created account      | creates account, returns message account created |
|        |                            |                                                    | 2.Invalid password                | user gets "invalid password" message             |
|        |                            |                                                    | 3.Invalid email                   | user gets "invalid email" message                |
|        |                            | Boolean getIsEnabled()                             | 5. is user enabled by admin       | returns isEnabled value                          |
| System | Hashmap<String,User> users |                                                    |                                   |                                                  |
|        |                            | Boolean addUser(email,User)                        | User already exists               | returns false                                    |
|        |                            |                                                    | User not exist                    | returns true                                     |
|        |                            | Boolean checkPassword(String password)             | 2.password less than 8 characters | returns false                                    |
|        |                            |                                                    | 2.password at least 8 characters  | returns true                                     |
|        |                            | Boolean checkEmail(String email)                   | 3."@" not contained               | returns false                                    |
|        |                            |                                                    |                                   | returns true                                     |
| Admin  |                            | Boolean enableAccount(String email)                | User not found or already enabled | returns false                                    |
|        |                            |                                                    | User found and is disabled        | returns true                                     |
