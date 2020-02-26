# 지인 정보 관리 시스템 만들기

## spring boot(ver. 2.1.x), java 8

#### 스프링 부트란?

- 스프링은 다양한 식재료이고, 스프링부트는 완성된 케이크라고 볼 수 있음

특징

* Starter를 통한 어플리케이션의 간편하고 자동화된 빌드 및 설정을 제공함
* Embed 서버를 제공함으로써 복잡한 배포 설절들을 간편하게 제공함
* Production에서 사용할 수 있는 추가적인 기능을 제공함(actuator)

Convention over Configuration

* 설정보다는 관습(줄여서 CoC, Coding by convention)
* 개발자가 설정해야 하는 것은 어플리케이션의 관례를 따르지 않느 점 뿐이다.

<요약>

1. Spring과 Springboot는 다른 것이다.
2. Springboot는 Java의 생산성 향상을 가져왔다.
3. 개발자가 설정해야 하는 것은 관례를 따르지 않는 점 뿐이다.





## SpingBoot 특성

* 스프링의 생산성
* Coding By Convention 활용



### 학습내용 정리

* 스프링부트 프로젝트 생성
* Gradle을 이용한 의존성 관리
* Iteration(반복주기) 개발로 2-cycle 개발 진행



#### 1-Cycle 내용정리

* JPA
  * Entity 생성
  * @OnetoOne Relation
    * Cascade Type
    * Fetch Type
    * Optional, orphanRemoval
  * QueryMethod
  * @Embedded
  * @Valid
  * @Query
  * @Where(for Soft-Delete)
  * Data.sql
* SpringMVC
  * @GetMapping
  * @PostMapping
  * @PutMapping
  * @PatchMapping
  * @DeleteMapping
  * @PathVariable
  * @RequestBody
* Lombok
  * @Getter
  * @Setter
  * @ToString
  * @Constructor
  * @EqualsAndHashCode
  * @Data
* SpringTest
* Java8
  * Stream
  * Filter
  * Map



#### 2- Cycle 내용 정리

* SpringMvc
  * CustomJsonSerializer
* SpringTest
  * MockMvc Test
  * Matcher
  * Junit5
* MockTest
  * Mockito
  * CustomArgumentMatcher
* Exception Handling
  * CustomException
  * ExceptionHandler
  * GlobalExceptionHandler
* Parameter Validator
  * @NotEmpty
  * @NotBlank
  * @Valid
* Paging
  * Pageable
  * Page<T>





### 앞으로 해 볼 것

* FrontEnd 개발
  * Web
    * VueJs, ReactJs
  * App
    * Android App
    * IOS App
* DB 연동
  * MySQL
  * MongoDB
* Spring(Boot) 의 중급활용
  * 추가적인 설정
  * Customizing 설정
* JPA 중급 활용
  * 다양한 Relation
  * QueryDSL /Jooq
* 로직의 확장
  * 추가적인 스펙

### Enjoy Bootiful Development!!

