//package com.polarbookshop.catalogservice.jpa;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Positive;
//
//@Entity
//@Table(name = "book")
//public class BookEntity {
//    @Id
//    @Pattern(regexp = "^([0-9]{10}|[0-9]{13})$", message = "The ISBN format must be valid.")
//    String isbn;
//
//    @NotBlank(message = "The book title must be defined.")
//    String title;
//
//    @NotBlank(message = "The book author must be defined.")
//    String author;
//
//    @NotNull(message = "The book price must be defined.")
//    @Positive(message = "The book price must be greater than zero.")
//    Double price;
//
//    public BookEntity(String isbn, String title, String author, Double price) {
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    public BookEntity() {
//    }
//}
