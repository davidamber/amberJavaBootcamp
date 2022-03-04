package com.amberJavaBootcamp.LibraryUsers;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kiduser = new KidUser();
        kiduser.registerAccount(10);
        kiduser.registerAccount(18);
        kiduser.requestBook("Kids");
        kiduser.requestBook("Fiction");

        AdultUsers adultusers = new AdultUsers();
        adultusers.registerAccount(5);
        adultusers.registerAccount(23);
        adultusers.requestBook("Kids");
        adultusers.requestBook("Fiction");
    }
}



