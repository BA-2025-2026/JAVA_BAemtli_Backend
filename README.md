# Ämtliplantool Backend

The Ämtliplantool is a web application developed specifically for the ICT-Campus of Swiss Post Ltd (Basic Information Technology Training). The primary goal of the project is to digitize and simplify the organization and assignment of daily chores (locally known as "Ämtli") within the ICT-Campus.

As of 2025, planning is often done manually or via decentralized lists. This tool provides a central platform for coaches and trainees to manage data and plan the monthly schedules.

## For Users: Run this application without building
If you're just here to run this application, without building it.
1. Make sure you have Docker Desktop installed and running
2. In your terminal: Clone this repo with `git clone https://github.com/BA-2025-2026/JAVA_BAemtli_Backend.git`
3. Navigate to the project folder with `cd JAVA_BAemtli_Backend`
4. Create .env-file from template `cp ./.env.example ./.env` 
5. Edit .env and choose a root password and a user password for your database
6. Run `docker compose pull` to pull the prebuilt docker images from the repo
7. Run `docker compose up -d` to start the application
8. connect to the Swagger UI API-Interface by opening http://localhost:8080/swagger-ui/index.html
9. Now you can test the API. Have fun!


## For Developers: How to build and run?
You can build and run this project
- manually in your IDE
- or as a docker compose setup.


### Build and run this project manually

1. install MySQL 8 server on your local machine
2. make a copy of `./src/main/resources/application.properties.example` and call it `application.properties`
3. in there: change the default values "pleasechange" to your database user and password
4. setup database and tables by running everything in `./db/create-database.sql`
5. run Spring Boot application
6. connect to the Swagger UI API-Interface by opening http://localhost:8080/swagger-ui/index.html
7. have fun!


### Build and run this project with docker compose

1. Create .env-file from template `cp ./.env.example ./.env`
2. Edit .env and choose a root password and a user password for your database
3. to build the gradle project run in your terminal `.\gradlew clean bootJar`
4. start Docker desktop on your local machine
5. start the containers with `docker compose up --build -d`
6. connect to the Swagger UI API-Interface by opening http://localhost:8080/swagger-ui/index.html
7. have fun!


### Re-Build image and push
If you make changes to this application that you would like to see
reflected in the container image on GitHub: Rebuild and push as follows:

1. `docker compose build`
2. `docker compose push`

If Docker can't push to your GitHub account, you're maybe not logged in yet.
To log in:

`echo "YOUR_GITHUB_PERSONAL_ACCESS_TOKEN" | docker login ghcr.io -u YOUR_GITHUB_USERNAME --password-stdin`