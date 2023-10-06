public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("moth smoke","mohsin hamid",2000,false,LibraryItemType.Book,247);
        Book b2 = new Book("reluctant","mohsin hamid",2001,false,LibraryItemType.Book,500);
        Magazine m1= new Magazine("Dastan","History dept",2022,false,LibraryItemType.magazine,20);
        lib.addItem(b1);
        lib.addItem(b2);
        lib.addItem(m1);

        lib.borrowItem(b1);
        System.out.println("displaying available items");
        lib.displayItems();
        //System.out.println("displaying borrowed items");
        //lib.displayBorrow();

        lib.returnItem(b1);
        System.out.println("after returning moth smoke remaining items");
        lib.displayItems();
        //System.out.println("displaying borrowed items");
        //lib.displayBorrow();

    }
}