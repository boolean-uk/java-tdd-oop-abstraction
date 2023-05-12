| Members           | Methods                                   | Scenario         | Output           |
|-------------------|-------------------------------------------|------------------|------------------|
| String email      |                                           |                  |                  |
| String password   |                                           |                  |                  |
| boolean activated |                                           |                  |                  |
|                   | createUser(String email, String password) | invalid password | false + message  |
|                   |                                           | invalid email    | false + message  |
|                   |                                           | Valid inputs     | true + message   |
|                   | activateUser(String email)                | invalid email    | false + message  |
|                   |                                           | valid email      | true + message   |
|                   | amIactivated(String email)                | invalid email    | false + message  |
|                   |                                           | valid email      | true + message   |                |                 |
