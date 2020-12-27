package com.main.percobaan10;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessRevisi {

    public static void main(String[] args){

        String bookList[] = {
                "satu","dua","tiga"
        };
        int yearList[] = {
                1920,1230,1940
        };

        try {
            RandomAccessFile books = new RandomAccessFile("books.txt","rw");

            for (int i = 0; i<3; i++){
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
        }catch (IOException e){
            System.out.println("indeks melebihi batas");
        }
        System.out.println("Test");
    }
}
