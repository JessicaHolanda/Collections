import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteStringCollections {

    public static void main(String[] args) {

        testeArrayList();

        testeLinkedList();

    }


    public static void testeArrayList() {

        long startTime = System.currentTimeMillis();

        List<String> teste = new ArrayList<>();

        for(int i = 0; i<50000; i++){
            teste.add("String"+i);
        }

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("ArrayList: " + elapsedTime);
    }


    public static void testeLinkedList() {

        long startTime = System.currentTimeMillis();

        List<String> teste = new LinkedList<>();

        for(int i = 0; i<50000; i++){
            teste.add("String"+i);
        }

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("LinkedList: " + elapsedTime);
    }
}
