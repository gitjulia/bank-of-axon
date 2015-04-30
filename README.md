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

##To see git configurations, .git/config:
Also contains tracking configurations

##To set up git username for a specific repo:
In root folder of your repo,
$ git config user.name "myUsername"

##To set up git username for ALL repos:
$ git config --global user.name "myUsername"