package com.pluralsight;

public class Book {
    private int id = 0;
    private String isbn = "";
    private String title = "";
    private boolean isCheckedOut = false; // True if checked out
    private String checkedOutTo = ""; // Set to name provided

    public  void Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
        this.id = id;
        this.isbn = isbn;

    }

    public int getId(int id) {
        return this.id;
    }
    public void setId() {
        this.id = id;
    }

    public String getIsbn(String isbn) {
        return this.isbn;
    }
    public void setIsbn() {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsCheckedOut(boolean isCheckedOut) {
        return this.isCheckedOut;
    }

    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // set checkedOutTo and isCheckedOut
    public void checkOut(String name) {

    }

    // reset checkedOutTo and isCheckedOut
    public void checkIn() {

    }
}
