package com.klimov.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Извлечь элемент");
            System.out.println("3. Удалить элемент");
            System.out.println("4. Проверить наличие элемента");
            System.out.println("5. Добавить несколько элементов");
            System.out.println("6. Вывести контейнер");
            System.out.println("0. Завершить");

            System.out.print("Выберите действие --> " );
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите элемент для добавления: ");
                    int itemToAdd = scanner.nextInt();
                    container.add(itemToAdd);
                    break;
                case 2:
                    System.out.print("Введите индекс элемента для извлечения: ");
                    int indexToGet = scanner.nextInt();
                    try {
                        System.out.println("Элемент по индексу " + indexToGet + ": " + container.get(indexToGet));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Введите индекс элемента для удаления: ");
                    int indexToRemove = scanner.nextInt();
                    try {
                        container.remove(indexToRemove);
                        System.out.println("Элемент по индексу " + indexToRemove + " удален.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Введите элемент для проверки наличия: ");
                    int itemToCheck = scanner.nextInt();
                    boolean containsItem = container.contains(itemToCheck);
                    if (containsItem) {
                        System.out.println("Элемент " + itemToCheck + " найден в контейнере.");
                    } else {
                        System.out.println("Элемент " + itemToCheck + " не найден в контейнере.");
                    }
                    break;
                case 5:
                    System.out.print("Введите количество элементов для добавления: ");
                    int count = scanner.nextInt();
                    System.out.print("Введите элементы: ");
                    for (int i = 0; i < count; i++) {
                        int element = scanner.nextInt();
                        container.add(element);
                    }
                    System.out.println("Элементы добавлены в контейнер.");
                    break;
                case 6:
                    System.out.print("Содержимое контейнера: ");
                    container.print();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

}
