<div align="center">
 AmazonWebTestProject
</div>

# **Selenium WEB** //Intelij //MVN//JUNIT//TESTNG 
# AllSteps Amazon WithLogin Scenario 
**Tags:chrome**
1. [+] **Çerezler Kabul Edilir.**
2. [+] **Kullanıcı Amazon.com sitesini Ziyaret Eder.**
3. [+] **Kullanıcı Giriş İşlemi Yapılır(Gmail ile).**
4. [+] **Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır.**
5. [+] **Kullanıcı Listbox'tan Kategori araaması gerçekleştirir.**
6. [+] **Kullanıcı Ürün araması yapar.**
7. [+] **Kullanıcı Ürün seçer ve sepete ekler.**
7. [+] **Kullanıcı çıkış işlemini gerçekleştirir.**


# Demo

https://user-images.githubusercontent.com/89300182/199967124-bbdcdadf-282c-40a1-9ea7-be3f45217680.mp4




# Log4j.xml 

![image](https://user-images.githubusercontent.com/89300182/199967226-fd86084e-ebd3-4e01-bcc9-5942600f581d.png) 

# POMXML
 
 <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>virgosol-java-selenium</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <selenium.version>3.141.59</selenium.version>
        <junit.jupiter.version>5.7.0</junit.jupiter.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.10.0</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>4.4.3</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.0</version>
            </plugin>
        </plugins>
    </build>

</project>


 ```
