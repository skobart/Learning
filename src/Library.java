class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.4";

        Book book1 = new Book("W pustyni i w puszczy","Henryk Sienkiewicz", 2010,296, "Greg", "9788373271890" );
        Book book2 = new Book("Java.Efektywne programowanie WydanieII", "Joshua Bloch",2009, 352,
                "Helion", "9788321258214" );
        Book book3 = new Book("SCJP, Sun Certified Programmer for Java 6 Study Guide", "Bert Bates",2008, 851,
                "McGraw-Hill Osborne Media", "9780071591065" );


        System.out.println(appName);
        System.out.println("Książki dostępne w blibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();


    }
}
