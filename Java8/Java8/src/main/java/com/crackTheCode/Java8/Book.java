package com.crackTheCode.Java8;


import java.time.OffsetDateTime;

public class Book {
    public String bookName;
    public OffsetDateTime publicationDate;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public OffsetDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(OffsetDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }
}


