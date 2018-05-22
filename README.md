# MavenProductGenerator
Web app that creates &amp; finds by products by id, built with Maven &amp; Eclipse, utilizes Java servlets

## Tools Needed
1. Maven
2. Spring Framework
3. Eclipse (highly recommended, but IntelliJ works too)
4. Tomcat to run a local server

## Launch the App
1. If building from command line, you will need your own .m2/settings.xml
2. cmd: "mvn clean install" on both the productservices and productweb sub-folders
3. If running within Eclipse, setup a Tomcat instance, and run products.html file on it.
4. Add your product on the form.
5. Verify your product is persisted in hash table, by running DisplayProductDetailsServlet.java on Tomcat.
6. WARNING: You will get an initial error. It just needs a HTTP parameter. Just add "?id=" (followed by the id # you entered earlier).
7. You should see your previously added product details.
