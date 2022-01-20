import java.util.*;

public class TesteObjectCollections {

    public static void main(String[] args) {

        testeArrayList();
        testeLinkedList();
        testeSet();
        testeMap();

    }


    public static void testeArrayList() {

        long startTime = System.currentTimeMillis();

        List<Pessoa> teste = new ArrayList<>();

        for (int i = 0; i < 50000; i++) {
            Pessoa pessoa = new Pessoa
                    .Builder()
                    .nome("pessoa" + i)
                    .idade(25)
                    .build();

            teste.add(pessoa);
        }

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("ArrayList: " + elapsedTime);
    }


    public static void testeLinkedList() {

        long startTime = System.currentTimeMillis();

        List<Pessoa> teste = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {

            Pessoa pessoa = new Pessoa
                    .Builder()
                    .nome("pessoa" + i)
                    .idade(25)
                    .build();

            teste.add(pessoa);
        }

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("LinkedList: " + elapsedTime);
    }

    public static void testeSet() {

        long startTime = System.currentTimeMillis();

        Set<Pessoa> teste = new HashSet<>();

        for (int i = 0; i < 50000; i++) {
            Pessoa pessoa = new Pessoa
                    .Builder()
                    .nome("pessoa" + i)
                    .idade(25)
                    .build();

            teste.add(pessoa);
        }

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("SET: " + elapsedTime);
    }

    public static void testeMap() {

        long startTime = System.currentTimeMillis();

        Map<String, Pessoa> teste = new HashMap();

        for (int i = 0; i < 50000; i++) {

            String chave = "pessoa"+i;
            Pessoa pessoa = new Pessoa
                    .Builder()
                    .nome(chave)
                    .idade(25)
                    .build();

            teste.put(chave, pessoa);
        }

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("Map: " + elapsedTime);
    }
}
