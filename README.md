## Checking this out again locally on another computer ##
- Copy `src/main/resources/application.yanl.example` to `src/main/resources/application.yanl`
- Grab your clientId and clientSecret from Google Cloud

### Learning Spring Boot 3.0 - OAuth ###
Using Google's OAuth
- First off rename `src/main/resources/application.properties` to `application.yaml`. See the file itself for the contents
- See `SecurityConfig` for how we define security policies with OAuth
- See `YouTube` for how we use `GetExchange` and `PostExchange` annotations to alter outgoing request URLs or request bodies accordingly
- This commit also shows how we use `records` to describe the shape of the data coming back from the API
  - See `PageInfo` for example
- This chapter was also recorded and put up on YouTube - https://www.youtube.com/watch?v=73JCrReqv8Y
- For the lulz I committed my own channel instead