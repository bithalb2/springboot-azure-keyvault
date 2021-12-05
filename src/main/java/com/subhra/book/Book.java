package com.subhra.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_ID", nullable = false, updatable = false)
    private Long bookId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @Column(name = "PRICE", nullable = false)
    private Double price;

    @Column(name = "NUMBER_OF_COPIES", nullable = false)
    private Integer numberOfCopies;

    public Book() {
    }

    public Book(String name, String author, Double price, Integer numberOfCopies) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return bookId.equals(book.bookId);
    }

    @Override
    public int hashCode() {
        return bookId.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
