package sem2.hw.task_7;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new OffsetHashTable(13);

        System.out.println("""
                Offset_hash_1.
                Размер таблицы n = 13. Хэш-функция - остаток от деления.
                Опишите хэш-таблицу со смещениями, которая будет получаться\s
                в ходе выполнения следующих операций над изначально пустой таблицей:
                \tinsert 20
                \tinsert 91
                \tinsert 51
                \tinsert 80
                \tinsert 72
                \tinsert 82
                \tinsert 67
                \tinsert 76
                \tinsert 87
                \tinsert 6
                \tinsert 37
                \tinsert 83""");

        System.out.println();
        hashTable.insert(20);
        hashTable.print();
        System.out.println();

        hashTable.insert(91);
        hashTable.print();
        System.out.println();

        hashTable.insert(51);
        hashTable.print();
        System.out.println();

        hashTable.insert(80);
        hashTable.print();
        System.out.println();

        hashTable.insert(72);
        hashTable.print();
        System.out.println();

        hashTable.insert(82);
        hashTable.print();
        System.out.println();

        hashTable.insert(67);
        hashTable.print();
        System.out.println();

        hashTable.insert(76);
        hashTable.print();
        System.out.println();

        hashTable.insert(87);
        hashTable.print();
        System.out.println();

        hashTable.insert(6);
        hashTable.print();
        System.out.println();

        hashTable.insert(37);
        hashTable.print();
        System.out.println();

        hashTable.insert(83);
        hashTable.print();
        System.out.println("\n");

        System.out.println("""
                Offset_hash_2.
                Размер таблицы n = 19. Хэш-функция - остаток от деления.
                Опишите хэш-таблицу со смещениями, которая будет получаться\s
                в ходе выполнения следующих операций над изначально пустой таблицей:
                \tinsert 84
                \tinsert 42
                \tinsert 98
                \tinsert 3
                \tinsert 32
                \tinsert 77
                \tinsert 37
                \tinsert 4
                \tinsert 72
                \tinsert 37
                \tinsert 5
                \tinsert 14
                \tinsert 31
                \tinsert 24
                \tinsert 28
                \tdelete 28
                \tdelete 24
                \tdelete 31
                \tdelete 14
                \tdelete 42""");

        hashTable = new OffsetHashTable(19);

        System.out.println();
        hashTable.insert(84);
        hashTable.print();
        System.out.println();

        hashTable.insert(42);
        hashTable.print();
        System.out.println();

        hashTable.insert(98);
        hashTable.print();
        System.out.println();

        hashTable.insert(3);
        hashTable.print();
        System.out.println();

        hashTable.insert(32);
        hashTable.print();
        System.out.println();

        hashTable.insert(77);
        hashTable.print();
        System.out.println();

        hashTable.insert(37);
        hashTable.print();
        System.out.println();

        hashTable.insert(4);
        hashTable.print();
        System.out.println();

        hashTable.insert(72);
        hashTable.print();
        System.out.println();

        hashTable.insert(37);
        hashTable.print();
        System.out.println();

        hashTable.insert(5);
        hashTable.print();
        System.out.println();

        hashTable.insert(14);
        hashTable.print();
        System.out.println();

        hashTable.insert(31);
        hashTable.print();
        System.out.println();

        hashTable.insert(24);
        hashTable.print();
        System.out.println();

        hashTable.insert(28);
        hashTable.print();
        System.out.println();

        hashTable.remove(28);
        hashTable.print();
        System.out.println();


        hashTable.remove(24);
        hashTable.print();
        System.out.println();

        hashTable.remove(31);
        hashTable.print();
        System.out.println();

        hashTable.remove(14);
        hashTable.print();
        System.out.println();

        hashTable.remove(42);
        hashTable.print();
        System.out.println("\n");

        System.out.println("""
                Offset_hash_3.
                Размер таблицы n = 19. Хэш-функция - остаток от деления.
                Опишите хэш-таблицу со смещениями, которая будет получаться\s
                в ходе выполнения следующих операций над изначально пустой таблицей:insert 43
                \tinsert 85
                \tinsert 8
                \tinsert 71
                \tinsert 70
                \tinsert 99
                \tinsert 6
                \tinsert 29
                \tinsert 21
                \tinsert 74
                \tinsert 94
                \tinsert 65
                \tdelete 8
                \tdelete 21
                \tdelete 65
                \tinsert 88
                \tinsert 95
                \tinsert 38
                \tdelete 74
                \tdelete 71
                \tinsert 59
                \tinsert 60
                \tinsert 11
                \tdelete 60
                \tdelete 85
                \tdelete 6
                \tdelete 94
                \tdelete 43""");

        hashTable = new OffsetHashTable(19);

        System.out.println();
        hashTable.insert(43);
        hashTable.print();
        System.out.println();

        hashTable.insert(85);
        hashTable.print();
        System.out.println();

        hashTable.insert(8);
        hashTable.print();
        System.out.println();

        hashTable.insert(71);
        hashTable.print();
        System.out.println();

        hashTable.insert(70);
        hashTable.print();
        System.out.println();

        hashTable.insert(99);
        hashTable.print();
        System.out.println();

        hashTable.insert(6);
        hashTable.print();
        System.out.println();

        hashTable.insert(29);
        hashTable.print();
        System.out.println();

        hashTable.insert(21);
        hashTable.print();
        System.out.println();

        hashTable.insert(74);
        hashTable.print();
        System.out.println();

        hashTable.insert(94);
        hashTable.print();
        System.out.println();

        hashTable.insert(65);
        hashTable.print();
        System.out.println();

        hashTable.remove(8);
        hashTable.print();
        System.out.println();

        hashTable.remove(21);
        hashTable.print();
        System.out.println();

        hashTable.remove(65);
        hashTable.print();
        System.out.println();

        hashTable.insert(88);
        hashTable.print();
        System.out.println();

        hashTable.insert(95);
        hashTable.print();
        System.out.println();

        hashTable.insert(38);
        hashTable.print();
        System.out.println();

        hashTable.remove(74);
        hashTable.print();
        System.out.println();

        hashTable.remove(71);
        hashTable.print();
        System.out.println();

        hashTable.insert(59);
        hashTable.print();
        System.out.println();

        hashTable.insert(60);
        hashTable.print();
        System.out.println();

        hashTable.insert(11);
        hashTable.print();
        System.out.println();

        hashTable.remove(60);
        hashTable.print();
        System.out.println();

        hashTable.remove(85);
        hashTable.print();
        System.out.println();

        hashTable.remove(6);
        hashTable.print();
        System.out.println();

        hashTable.remove(94);
        hashTable.print();
        System.out.println();

        hashTable.remove(43);
        hashTable.print();
        System.out.println("\n");

        System.out.println("""
                List_hash_1.
                Размер таблицы n = 13. Хэш-функция - остаток от деления.
                Опишите хэш-таблицу на списках, которая будет получаться\s
                в ходе выполнения следующих операций над изначально пустой таблицей:
                \tinsert 68
                \tinsert 61
                \tinsert 34
                \tinsert 4
                \tinsert 7
                \tinsert 19
                \tinsert 17
                \tinsert 60
                \tinsert 13
                \tinsert 44
                \tinsert 16
                \tinsert 70""");

        hashTable = new ListHashTable(13);

        hashTable.insert(68);
        hashTable.print();
        System.out.println();

        hashTable.insert(61);
        hashTable.print();
        System.out.println();

        hashTable.insert(34);
        hashTable.print();
        System.out.println();

        hashTable.insert(4);
        hashTable.print();
        System.out.println();

        hashTable.insert(7);
        hashTable.print();
        System.out.println();

        hashTable.insert(19);
        hashTable.print();
        System.out.println();

        hashTable.insert(17);
        hashTable.print();
        System.out.println();

        hashTable.insert(60);
        hashTable.print();
        System.out.println();

        hashTable.insert(13);
        hashTable.print();
        System.out.println();

        hashTable.insert(44);
        hashTable.print();
        System.out.println();

        hashTable.insert(16);
        hashTable.print();
        System.out.println();

        hashTable.insert(70);
        hashTable.print();
        System.out.println();

        System.out.println("""
                List_hash_2.
                Размер таблицы n = 19. Хэш-функция - остаток от деления.
                Опишите хэш-таблицу на списках, которая будет получаться\s
                в ходе выполнения следующих операций над изначально пустой таблицей:
                \tinsert 56
                \tinsert 16
                \tinsert 45
                \tinsert 98
                \tinsert 68
                \tinsert 5
                \tinsert 7
                \tinsert 21
                \tinsert 71
                \tinsert 62
                \tinsert 13
                \tinsert 7
                \tinsert 60
                \tinsert 98
                \tinsert 69
                \tdelete 98
                \tdelete 21
                \tdelete 69
                \tdelete 45
                \tdelete 7
                """);

        hashTable = new ListHashTable(19);

        hashTable.insert(56);
        hashTable.print();
        System.out.println();

        hashTable.insert(16);
        hashTable.print();
        System.out.println();

        hashTable.insert(45);
        hashTable.print();
        System.out.println();

        hashTable.insert(98);
        hashTable.print();
        System.out.println();

        hashTable.insert(68);
        hashTable.print();
        System.out.println();

        hashTable.insert(5);
        hashTable.print();
        System.out.println();

        hashTable.insert(7);
        hashTable.print();
        System.out.println();

        hashTable.insert(21);
        hashTable.print();
        System.out.println();

        hashTable.insert(71);
        hashTable.print();
        System.out.println();

        hashTable.insert(62);
        hashTable.print();
        System.out.println();

        hashTable.insert(13);
        hashTable.print();
        System.out.println();

        hashTable.insert(7);
        hashTable.print();
        System.out.println();

        hashTable.insert(60);
        hashTable.print();
        System.out.println();

        hashTable.insert(98);
        hashTable.print();
        System.out.println();

        hashTable.insert(69);
        hashTable.print();
        System.out.println();

        hashTable.remove(98);
        hashTable.print();
        System.out.println();

        hashTable.remove(21);
        hashTable.print();
        System.out.println();

        hashTable.remove(69);
        hashTable.print();
        System.out.println();

        hashTable.remove(45);
        hashTable.print();
        System.out.println();

        hashTable.remove(7);
        hashTable.print();
        System.out.println();

        System.out.println("""
                List_hash_3.
                Размер таблицы n = 19. Хэш-функция - остаток от деления.
                Опишите хэш-таблицу на списках, которая будет получаться\s
                в ходе выполнения следующих операций над изначально пустой таблицей:
                \tinsert 30
                \tinsert 78
                \tinsert 5
                \tinsert 9
                \tinsert 46
                \tinsert 8
                \tinsert 2
                \tinsert 2
                \tinsert 27
                \tinsert 87
                \tinsert 67
                \tinsert 99
                \tdelete 5
                \tdelete 78
                \tdelete 46
                \tinsert 50
                \tinsert 14
                \tinsert 38
                \tdelete 50
                \tdelete 87
                \tinsert 51
                \tinsert 34
                \tinsert 10
                \tdelete 99
                \tdelete 51
                \tdelete 9
                \tdelete 14
                \tdelete 8""");

        System.out.println();

        hashTable = new ListHashTable(19);

        hashTable.insert(30);
        hashTable.print();
        System.out.println();

        hashTable.insert(78);
        hashTable.print();
        System.out.println();

        hashTable.insert(5);
        hashTable.print();
        System.out.println();

        hashTable.insert(9);
        hashTable.print();
        System.out.println();

        hashTable.insert(46);
        hashTable.print();
        System.out.println();

        hashTable.insert(8);
        hashTable.print();
        System.out.println();

        hashTable.insert(2);
        hashTable.print();
        System.out.println();

        hashTable.insert(2);
        hashTable.print();
        System.out.println();

        hashTable.insert(27);
        hashTable.print();
        System.out.println();

        hashTable.insert(87);
        hashTable.print();
        System.out.println();

        hashTable.insert(67);
        hashTable.print();
        System.out.println();

        hashTable.insert(99);
        hashTable.print();
        System.out.println();

        hashTable.remove(5);
        hashTable.print();
        System.out.println();

        hashTable.remove(78);
        hashTable.print();
        System.out.println();

        hashTable.remove(46);
        hashTable.print();
        System.out.println();

        hashTable.insert(50);
        hashTable.print();
        System.out.println();

        hashTable.insert(14);
        hashTable.print();
        System.out.println();

        hashTable.insert(38);
        hashTable.print();
        System.out.println();

        hashTable.remove(50);
        hashTable.print();
        System.out.println();

        hashTable.remove(87);
        hashTable.print();
        System.out.println();

        hashTable.insert(51);
        hashTable.print();
        System.out.println();

        hashTable.insert(34);
        hashTable.print();
        System.out.println();

        hashTable.insert(10);
        hashTable.print();
        System.out.println();

        hashTable.remove(99);
        hashTable.print();
        System.out.println();

        hashTable.remove(51);
        hashTable.print();
        System.out.println();

        hashTable.remove(9);
        hashTable.print();
        System.out.println();

        hashTable.remove(14);
        hashTable.print();
        System.out.println();

        hashTable.remove(8);
        hashTable.print();
        System.out.println();
    }

}
