package sem2.hw.task_7;

public class TestClass {

    private static final HashTable hash1 = new OffsetHashTable(5);

    private static final HashTable hash2 = new ListHashTable(5);


    public static void main(String[] args) {
        hash1.insert(3);
        hash1.print();
        System.out.println();
        hash1.insert(8);
        hash1.print();
        System.out.println();
        hash1.insert(1);
        hash1.print();

        System.out.println();
        System.out.println();
        hash2.insert(3);
        hash2.print();
        System.out.println();
        hash2.insert(8);
        hash2.print();
        System.out.println();
        hash2.insert(1);
        hash2.print();
    }
}
