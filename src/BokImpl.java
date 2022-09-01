import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BokImpl {
    public static void main(String[] args) {
        List<Book> bookList=new ArrayList<>();
        Book b1=new Book("The complete reference","Herbert Schild",1235678987L,450);
        Book b2=new Book("Programming with Java","E Balagurusamy",987654321L,900);
        Book b3=new Book("Computer science with Java","Sumita Arora",234678L,670);
        Book b4=new Book("Getting Inside Java","Prem Kumar",78654321L,400);
        Book b5=new Book("Java Programming Simplified","Eddy Romansky",54354321L,890);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);

        for (Book element :bookList){
            System.out.println(element);
        }

        for (int i = 0; i <bookList.size() ; i++) {
            for (int j = 0; j <bookList.size()-1 ; j++) {
                if(bookList.get(j).getPrice()>bookList.get(j+1).getPrice()){
                    Book temp=bookList.get(j);
                    bookList.set(j,bookList.get(j+1));
                    bookList.set(j+1,temp);
                }

            }

        }
        for (Book element:bookList) {
            System.out.println(element);

        }

    }
}
