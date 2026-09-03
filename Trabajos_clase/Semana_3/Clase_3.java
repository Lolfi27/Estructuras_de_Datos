package Trabajos_clase.Semana_3;

public class Clase_3 {
    static class HashTable {
        int[] table;

        public HashTable(int size) {
            table = new int[size];

        }

        public int hash(int key) {
            return key % table.length;
        }

        public void put(int key) {
            int index = hash(key);
            table[index] = key;
        }

        public void display() {
            for (int i = 0; i < table.length; i++) {
                System.out.println(table[i]);
            }
        }

    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(1001);
        ht.put(1002);
        ht.put(1003);

    }

}