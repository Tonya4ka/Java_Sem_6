// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map.

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле

import java.util.*;
import java.util.function.Predicate;

public class S6_1 {

  public static void Price(Collection<Parametres> laptop) {
      while (true) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("Дороже(1), Дешевле(2), Выход(3): ");
          int choice1 = iScanner.nextInt();
          if (choice1 == 1) {
            System.out.printf("Введиде цену: ");
            int price = iScanner.nextInt();
            System.out.printf("Ноутбуки, цена которых больше либо равна: %d руб.\n", price);
            System.out.println("-----------------------------------------------");
            Predicate<Parametres> laptopMaxPrice = n -> n.getPrice() >= price;
            laptop.stream()
              .filter(laptopMaxPrice)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 2) {
            System.out.printf("Введиде цену: ");
            int price = iScanner.nextInt();
            System.out.printf("Ноутбуки, цена которых меньше либо равна: %d руб.\n", price);
            System.out.println("-----------------------------------------------");
            Predicate<Parametres> laptopMinPrice = n -> n.getPrice() <= price;
            laptop.stream()
              .filter(laptopMinPrice)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 3) {
            return;
          }
        }
    }

    public static void SSD(Collection<Parametres> laptop) {
      while (true) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("Объем SSD больше(1), Меньше(2), Выход(3): ");
          int choice1 = iScanner.nextInt();
          if (choice1 == 1) {
            System.out.printf("Введиде объем SSD: ");
            int ssd = iScanner.nextInt();
            System.out.printf("Ноутбуки, объем SSD кодорых больше либо равен: %d Gb.\n", ssd);
            System.out.println("-----------------------------------------------");
            Predicate<Parametres> laptopMaxDisk = n -> n.getDisk_size() >= ssd;
            laptop.stream()
              .filter(laptopMaxDisk)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 2) {
            System.out.printf("Введиде объем SSD: ");
            int ssd = iScanner.nextInt();
            System.out.printf("Ноутбуки, объем SSD кодорых меньше либо равен: %d Gb.\n", ssd);
            System.out.println("-----------------------------------------------");
            Predicate<Parametres> laptopMinDisk = n -> n.getDisk_size() <= ssd;
            laptop.stream()
              .filter(laptopMinDisk)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 3) {
            return;
          }
        }
    }


   public static void Collor(Collection<Parametres> laptop) {
    while (true) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Выбор цвета(1), Выход(2): ");
      int choice1 = iScanner.nextInt();
      if (choice1 == 1) {
        Scanner Scan = new Scanner(System.in);
        System.out.printf("Введиде цвет ноутбука: ");
        String name = Scan.nextLine();
        System.out.printf("Ноутбуки у которых цвет: %s\n", name);
        System.out.println("-----------------------------------------------");
        Predicate<Parametres> laptopCollor = n -> n.getColor().equals(name);
        laptop.stream()
          .filter(laptopCollor)
          .forEach(System.out::println);
        System.out.println();
      }
      else if (choice1 == 2) {
        return;
      }
    }
   }

   public static void OS(Collection<Parametres> laptop) {
    while (true) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Выбор OS(1), Выход(2): ");
      int choice1 = iScanner.nextInt();
      if (choice1 == 1) {
        Scanner Scan = new Scanner(System.in);
        System.out.printf("Введиде название OS: ");
        String name = Scan.nextLine();
        System.out.printf("Ноутбуки у которых предустановлена OS: %s\n", name);
        System.out.println("-----------------------------------------------");
        Predicate<Parametres> laptopOs = n -> n.getOs().equals(name);
        laptop.stream()
          .filter(laptopOs)
          .forEach(System.out::println);
        System.out.println();
      }
      else if (choice1 == 2) {
        return;
      }
    }
   }

  public static void main(String[] args) {  
    List<Parametres> laptop = new ArrayList<>();
    Parametres laptop1 = new Parametres(1, "Apple McBook Air 13", 80990, "Apple M2", 8, 256, "grey", "macOS");
    Parametres laptop2 = new Parametres(2, "Lenovo Legion 5", 78590, "Intel Core i5-10500H", 16, 512, "black", "No OS");
    Parametres laptop3 = new Parametres(3, "Lenovo Ideapad Gaming L340-15IRH", 52675, "Intel Core i5-9300H", 16, 512, "black", "Windows 10 Home");
    Parametres laptop4 = new Parametres(4, "Lenovo IdeaPad 5 Pro 14ACN6", 65590, "ADM Ryzen 7", 16, 512, "storm grey", "No OS");
    Parametres laptop5 = new Parametres(5, "ASUS TUF Gaming F15 FX506LH-HN042", 64000, "Intel Core i5-10300H", 16, 512, "black", "No OS");

    laptop.add(laptop1);
    laptop.add(laptop2);
    laptop.add(laptop3);
    laptop.add(laptop4);
    laptop.add(laptop5);

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
          System.out.printf("ФИЛЬТР По цене(1), По объему SSD(2), По цвету(3), По ОС(4) Выйти(5): ");
          int choice = sc.nextInt();
          sc.nextLine();
          if (choice == 1) {
              Price(laptop);
          }
          else if (choice == 2) {
            SSD(laptop);
          }
          else if (choice == 3) {
            Collor(laptop);
          }
          else if (choice == 4) {
            OS(laptop);
          }
          else if (choice == 5) {
              return;
          }
        }
    } 
  }
} 