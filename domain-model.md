# User account

| Class       | Fileds          | Methods                      | Scenario                      | Outcome                    |
|-------------|-----------------|------------------------------|-------------------------------|----------------------------|
| UserAccount |                 |                              |                               |                            |
|             | email:String    |                              |                               |                            |
|             |                 | setEmail(String email)       | if email address is without @ | return "invalid email";    |
|             | password:String |                              |                               |                            |
|             |                 | setPassword(String password) | if less then 8 characters     | return "invalid password"; |
|             | status:boolean  |                              |                               |                            |
|             |                 | enable()                     |                               |                            |
|             |                 | getStatus()                  | can see their status          | return this.status;        |
