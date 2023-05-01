package OFD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
        static Scanner scanner = new Scanner(System.in);
        static List<String> taskArrayList = new ArrayList<>();

        public static void withdrawAction () {
            System.out.println("Выберите действие:\n1. Добавить задачу\n2. Вывести список задач\n3. Удалить задачу\n0. Выход\n");
        }
        public static void createTask() {
            System.out.println("Введите задачу:");
            String task = scanner.nextLine();
            if (task.length() < 5) {
                System.out.println("Задача не может быть пустой или состоять меньше чем из 4 символов");
//                Задача всё равно добавляется, как закончить не знаю.
            }
            taskArrayList.add(task);
        }
        public static void deliteTask() {
            System.out.println("Укажите номер задачи для удаления:");
            String number = scanner.nextLine();
            taskArrayList.remove(Integer.valueOf(number) - 1);
         }
        public static void showTasks() {
            System.out.println("Задачи:");
            for (int i = 1; i <= taskArrayList.size(); i++)
                System.out.println(i + ". " + taskArrayList.get(i - 1));
        }
        public static void main(String[] args) {
            while (true) {
                withdrawAction();
                String action = scanner.nextLine();
                if (action.equals("0")) break;
                switch (action) {
                    case "1": {
                        createTask();
                        break;
                    }
                    case "2": {
                        showTasks();
                        break;
                    }
                    case "3": {
                        deliteTask();
                        break;
                    }
                }
                System.out.println();
            }

        }
}

