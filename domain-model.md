| Class | Members         | Methods                      | Scenario                                                    | Output                     |
|-------|-----------------|------------------------------|-------------------------------------------------------------|----------------------------|
| User  | String address  | setPassword(String password) | if user provides a password less than 8 char length         | String: "invalid password" |
|       | String password | setEmail(String email)       | if user provides an email address without an @ symbol in it | String: "invalid email"    |

| Class   | Members       | Methods                  | Scenario                                                             | Output |
|---------|---------------|--------------------------|----------------------------------------------------------------------|--------|
| Account | User user     | setStatus(Status status) | if admin want to change the user status between enabled and disabled | -      |
|         | Status status | isEnabled()              | if account is enabled                                                | true   |
|         |               |                          | if account is disabled                                               | false  |

| Enum   | Values            |
|--------|-------------------|
| Status | ENABLED, DISABLED |
