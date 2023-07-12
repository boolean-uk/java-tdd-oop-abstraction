| Class  | Members      | Methods                                     | Scenario                                       | Outputs |
|--------|--------------|---------------------------------------------|------------------------------------------------|---------|
| `User` | `email`      | `createUser(String email, String password)` | email and password correct                     | String  |
|        | `password`   |                                             | password length less than 8                    | String  |
|        | `isDisabled` |                                             | email does not contain @                       | String  |
|        | `email`      | `login(String email, String password)`      | email and password correct and account enabled | String  |
|        |              |                                             | User account is disabled                       | String  |
|        |              |                                             | password incorrect                             | String  |
|        |              |                                             | email  incorrect                               | String  |
|        |              | `changeDisability()`                        | changing disability to opposite value          | void    |
|        |              | `showDisability()`                          | showing disability                             | boolean |
