// структура
public class Parametres {
    private int id;
    private String name;
    private int price;
    private String processor;
    private int ram;
    private int disk_size;
    private String color;
    private String os;

// конструктор
    public Parametres (int id, String name, int price, String processor, int ram, int disk_size, String color, String os) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.disk_size = disk_size;
        this.color = color;
        this.os = os;
    }
    
// Формат вывода строки
    @Override
    public String toString() {
        return String.format("%d Модель: %s Цена: %d руб. Процессор: %s ОЗУ: %d Gb Объем диска: %d Gb Цвет: %s ОС: %s", id, name, price, processor, ram, disk_size, color, os);
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk_size() {
        return disk_size;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }
}


