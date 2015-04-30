#CQRS



#Spring Boot

From Spring docs:
* Create stand-alone Spring applications, ready to "just run"
** $ mvn spring-boot:run
* Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR file in external server)
* Simplify Maven configuration
** Inherit spring-boot-starter-parent pom; include spring-boot-starter-web
* Automatically configure Spring whenever possible
* Provide production-ready features such as metrics, health checks and externalized configuration (using Spring Actuator)

#Misc notes
##If you clone an empty repo and try to push to it,
"No refs in common and none specified; doing nothing."
Fix: git push -u origin master

##To check tracking of git, see .git/config