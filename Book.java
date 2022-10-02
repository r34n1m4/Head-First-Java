package com.reanima;

public class Book {
    private int noOfCopies;

    //constructor
    Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    void increaseNOC (int howMuch) {
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    void decreaseNOC (int howMuch) {
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}
