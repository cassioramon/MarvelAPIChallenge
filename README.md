# MarvelAPIChallenge

## Introduction

This project is a simplified reproduction of [Marvel's API](https://developer.marvel.com/docs#!/public) using [Spring Data Rest](https://www.baeldung.com/spring-data-rest-intro) concepts. This POC demonstrate that is possible write a complete API without using boilerplate code; taking advantage of massive abstraction provided by SDR.

For test purposes, H2 database is configured to run on memory and there is a script to insert some initial data in DB while the app is starting.


## Running the Application

1. Clone this repo

2. In a terminal window, browse into the project root directory and run the following command:

```
./mvnw spring-boot:run
```

This script will compile the project, download all necessary dependecies and start the application.


## Testing

After the steps above the app is able to listen for requests. Using any REST client, call for http://localhost:8080/v1/public.
