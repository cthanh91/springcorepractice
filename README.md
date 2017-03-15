SUMMARY: Repository contains java project to practice knowledge while reading the book Spring in Action

Spring day 1 keynote: DI & AOP
- POJO oriented development
- DI
- Aspect
  - Point-cut
  - Advice (5 types of advice)
  - AspectJ’s point cut expression language (AOP more in chapter 4)
- Templates
  - Eliminating boilerplate code
  - JBDC templates
- Spring container
  - BeanFactory
  - ApplicationContext
    - FileSystemXmlApplicationContext
    - ClassPathXmlApplicationContext
    - AnnotationConfigApplicationContext
- Bean’s life

Spring day 3 keynote: Wiring
- Spring container configuration
  - Explicit XML
  - Explicit Java
  - Implicit automatic wiring
- Automatic wiring
  - Component scanning
  - Autowiring
  - JUnit test with spring context
    - @Runwith(SpringJUnit4ClassRunner.class)
  - Package scanning
    - basePackages
    - basePackageClasses
- Java based configuration
  - @Configuration
- XML based configuration
  - <constructor-arg /> versus c-namespace
      - Wiring collection
  - <property /> versus p-name space
  - list, set, map, properties
  - util-namespace
- Mixing Configuration
  - Java to XML and reverse.

Spring day 7 keynote: Conditional beans
- Environment and profile
  - Get DataSource example (talk more on chapter 10)
  - @Profile annotated to Class (Spring 3.1)
  - @Profile annotated to Method (Spring 3.2)
  - profile attribute in XML
  - Activate profile properties
    - spring.profiles.active
    - spring.profiles.default
  - Several ways to set active profiles
    - @ActiveProfiles

Spring day 8 keynote: @Qualifier
- Ambiguity wiring
- Qualifying bean
  - Primary bean: @Primary
  - @Qualifier for bean definition and bean injection
  - Custom custom annotation annotated by @Qualifier

Spring day 9 keynote: Property place holder
- Bean’s scope
  - Singleton
  - Prototype
  - Session (come with web application)
  - Request (come with web application)
- Proxy Mode for session and request bean
  - Inject session scoped bean into singleton scoped bean
    - ScopedProxyMode.INTERFACES
    - ScopedProxyMode.TARGET_CLASS
    - aop:proxy-mode for xml based
- Property external source
- PlaceHolders value
  - ${…}
  - @Value for auto wiring
    - Define PropertySourcesPlaceholderConfigurer bean
    - <context:property-placeholder>
- Spring expression language (since Spring 3)
  - #{1}
  - #{T(System).currentTimeMilis()}
  - #{beanId.property}
  - #{systemProperties[‘propertyName’]}
  - Type-safe operator
  - T() for class scoped methods
  - Ternary and Elvis operator ?:
  - Pattern matches
  - Collection’s selection operator .?[condition] .^[condition] .$[condition] 
  - Collection’s projection operator .|[property]

Spring day 14 keynote: Cross-cutting concern
- Aspects
  - Advice
  - Point cut
  - Joint points
  - Introduction
  - Weaving
- aop-namespace
- Runtime proxy
- AOP implementation
  - Spring
  - AspectJ
  - JBoss
- AspectJ’s pointcut expression language
  - AspectJ designators
  - @Pointcut
- @Aspect
  - @EnableAspectJAutoProxy
  - @Before
  - @After
  - @AfterReturning
  - @AfterThrowing
  - @Around
- Around advice
  - ProceedingJoinPoint
- Handling parameter to advice
- Annotating Introduction

Spring day 15: Pointcut expression 
- http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html#aop-pointcuts-examples
- http://www.eclipse.org/aspectj/doc/released/progguide/semantics-pointcuts.html
- AspectJ creates aspect object

Spring day 17 keynote: request’s life
- Front controller
  - DispatcherServlet
- Apache Tiles
  - Templates
- Thymeleaf

Chapter 7
- @ExceptionHandler
- Flash attribute
