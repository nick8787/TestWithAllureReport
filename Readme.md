<h1 align="center"> Simple test with Allure report </h1>

## 💬Summary:
* Test that performs site login + authorization + a couple of page clicks.



## 📢I've applied:

- Selenide, Maven, TestNG, assertJ, Lombok.
- Pattern - Page Object (breaking down into `pages` and `locators`).
- Properties to identify user data.

## 💡Creating process:

- 1.In BaseTest create BeforeMethod "setUp", where we customize the environment (browser), make it full screen and specify the URL.
- 2.Create Pages class in package "pages", where create methods for test.
- 3.Create Locators class in package "locators" for every page.
- 6.In package "utils", in class "Constants" create user data constants.
- 7.In package "utils", in class "UtilsMethod" create method that reads values from the configuration file. 
- 8.Create configuration file "config.properties" in package "resources".
- 9.Make pop-up separated in package "components".

## 📌How to connect Allure report:

1. Add following lines into your `pom.xml` **build** section:
```
<plugin>
	<groupId>io.qameta.allure</groupId>
	<artifactId>allure-maven</artifactId>
	<version>2.10.0</version>
	<configuration>
		<reportVersion>2.14.0</reportVersion>
	</configuration>
</plugin>
```

2. Add following lines into your `pom.xml` **dependency** section:
```
<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-testng</artifactId>
    <version>2.25.0</version>
</dependency>

```

3. In package "resources" - create `allure.properties` to specify a folder for the results.
* Add `allure.results.directory=target/allure-results`
4. In package "target" -> create directory `allure-results`
5. In right menu Maven "m" need to install Allure: Plugins - allure - allure:install - allure:report

## 🚀Getting started:

* `mvn clean test` - to start the test

* `mvn allure:serve` - to generate a report using one of the following command

## 🔗Additional:

- My GitHub - [`👉click`](https://github.com/nick8787)
- Мy Telegram - [`👉click`](https://t.me/nick8787)
