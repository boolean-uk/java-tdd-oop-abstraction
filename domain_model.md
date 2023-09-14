| Classes   | Methods                                     | Variables                          | Scenario                                                | Results                |
|-----------|---------------------------------------------|------------------------------------|---------------------------------------------------------|------------------------|
| `User`    | `createUser(String email, String password)` | `HashMap<String, String> userlist` | 1.                                                      |                        |
|           |                                             | (key is email, value is password)  | Create user if email and password is not empty or null  | Output success message |
|           |                                             |                                    | or if user exists                                       | Update the userlist    |
|           |                                             |                                    |                                                         | Return true            |
|           |                                             |                                    | 2.                                                      |                        |
|           |                                             |                                    | If password is empty, null or invalid or if user exists | Output failure message |
|           |                                             |                                    |                                                         | Don't update userlist  |
|           |                                             |                                    |                                                         | Return false           |
|           |                                             |                                    | 3.                                                      |                        |
|           |                                             |                                    | If email is empty, null or invalid or if user exists    | Output failure message |
|           |                                             |                                    |                                                         | Don't update userlist  |
|           |                                             |                                    |                                                         | Return false           |
| `Account` | `setStatus(User user)`                      | `HashMap<User, String> accounts`   | 4.                                                      |                        |
|           |                                             | (key is user, value is status)     | Set the status of the new user if status is disabled    | Output success message |
|           |                                             |                                    |                                                         | Update the userlist    |
|           |                                             |                                    |                                                         | Return true            |
|           | `canLog(User user)`                         |                                    | 5.                                                      |                        |
|           |                                             |                                    | user can log if status is enabled                       | Output success message |
|           |                                             |                                    |                                                         | Don't update userlist  |
|           |                                             |                                    |                                                         | Return true            |
