#Introduction
Sample application to demonstrate Spring Boot, ElasticSearch and Axon Framework

The application makes use of the following design patterns:
- Domain Driven Design
- CQRS
- Event Sourcing


#CQRS

* Axon Framework - http://www.axonframework.org/
* Spring Boot - http://projects.spring.io/spring-boot/
* Spring Framework - http://projects.spring.io/spring-framework/
* Spring Data ElasticSearch - https://github.com/spring-projects/spring-data-elasticsearch


#Spring Boot

From Spring docs:
* Create stand-alone Spring applications, ready to "just run"
** $ mvn spring-boot:run
* Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR file in external server)
* Simplify Maven configuration
* Automatically configure Spring whenever possible
* Provide production-ready features such as metrics, health checks and externalized configuration (using Spring Actuator)


#Maven

To install Maven on Mac, d/l from Apache site and add Maven binaries on your system by adding it to the search path.
(Add Maven installation’s bin folder to your operating system’s PATH variable)

Generate Maven project structure using $ mvn archetype:generate

Inherit spring-boot-starter-parent pom for default dependencies

org.springframework.boot.spring-boot-starter-web
* Add Spring Boot (for writing web apps)

org.axonframework.axon-core
* Add Axon framework

org.axonframework.axon-integration
* Integrate Axon with Spring

org.elasticsearch.elasticsearch
* Add Elastic Search

org.springframework.data.spring-data-elasticsearch
* Integrate ES with Spring


#Misc notes

Configure Spring MVC using XML (servlet.xml)
Alternative: use WebMvcConfigurerAdapter with Spring Boot

Use Elastic Search for datastore
Alternative: MongoDB

Use Maven for build tool
Alternative: gradle


#Git thangs

##If you clone an empty repo and try to push to it,
"No refs in common and none specified; doing nothing."
git push -u origin master

##To set up git username for a specific repo:
In root folder of your repo,
git config user.name "gitjulia"

##To set up git username for ALL repos:
git config --global user.name "gitjulia"

##To see git configurations, .git/config:
Also contains tracking configurations and username