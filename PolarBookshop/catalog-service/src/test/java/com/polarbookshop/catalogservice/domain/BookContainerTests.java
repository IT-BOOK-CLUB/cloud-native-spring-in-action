//package com.polarbookshop.catalogservice.domain;
//
//import com.polarbookshop.catalogservice.jpa.BookEntity;
//import com.polarbookshop.catalogservice.jpa.BookJPARepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@Testcontainers
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class BookContainerTests {
//    @Autowired
//    BookJPARepository bookJPARepository;
//    BookEntity saveBookData = new BookEntity("123456", "이방인", "까뮈", 12000.0);
//
//    @Test
//    void setSaveBookData() {
//        bookJPARepository.save(saveBookData);
//        BookEntity book = bookJPARepository.getReferenceById("123456");
//
//        assertThat(book).isNotNull();
//    }
//
//
////    @Container
////    public GenericContainer<?> container = new GenericContainer<>(DockerImageName.parse("mariadb:10.5.5"))
////            .withExposedPorts(3306);
////    @Container
////    MariaDBContainer<?> container = new MariaDBContainer<>(DockerImageName.parse("mariadb:10.5.5"));
////    @Test
////    void getProperty() {
////        container.start();
////        var jdbcUrl = "jdbc:mariadb://" + container.getHost() + ":" + container.getMappedPort(3306) + "/test";
////        var username = "root";
////        var password = "root";
////
////        System.out.println("mariaDB containerID: " + container.getContainerId() + ", getHost: " + container.getHost() + ", getPort: " + container.getMappedPort(3306));
////        try (Connection conn = DriverManager.getConnection(
////                jdbcUrl,
////                username,
////                password)
////        ) {
////            System.out.println("connection is Success!");
////            // 코드
////        } catch (SQLException ex) {
////            System.out.println("connection is Failure..");
////        }
////        container.stop();
////    }
//}
