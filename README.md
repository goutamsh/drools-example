# Drools Example with Spring boot (both drl file and Decision table)

Build Project:

mvn clean install

Run command:

mvn spring-boot:run

URL to open after the above command:

http://localhost:8080/music/shop?type=string

http://localhost:8080/music/details?type=wind

# services exposed


/music/shop?type=string : returns the Product details with discount for String type Music instruments (with drl file)

/music/details?type=wind : returns the Instrument details with exact instrument for Wind type Music instruments (with decision table)

