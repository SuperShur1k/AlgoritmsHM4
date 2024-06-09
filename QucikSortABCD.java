package org.example.lesson4;
// TAsk2
//Решите задачу: Расставьте в алфавитном порядке буквы.
// Разрешается использование техники Разделяй и властвуй.
// Полученные данные напечатайте.
//👉👉👉  На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
//На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)

public class QucikSortABCD {
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void sort(char[] arr) {
        int n = arr.length;
        quickSort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";

        char[] arr = input.toUpperCase().toCharArray();

        sort(arr);

        String sorted = new String(arr);

        System.out.println(sorted);
    }
}
