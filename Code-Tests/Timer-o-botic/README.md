# Title
timer-o-botic

## About
Rest API for calculating current time, application wallclock uptime(milliseconds), the function wallclock time(nanoseconds), and CPU time(nanoseconds). 


## Pre-requirements
To build this web service you need to install [Maven](http://maven.apache.org/)

To deploy the web service you need to install [Tomcat](http://tomcat.apache.org/)


## Build 
1. Change your working directory to `tidal-code-test` directory.

2. to build the program using Maven: 
   ```bash
       mvn clean install
   ```
3. Copy the `timer-o-botic.war` file from the created target folder



## Deploy
1. Start the Tomcat Server and paste the `timer-o-botic.war` file in the webapps directory.

2. In your web browser enter the below URL:

       http://localhost:8080/api/tidal/uptime

