package vehicles;

enum Vehicles {
    BMW(50000) {
        @Override
        public String toString() {
            return "BMW price: " + getPrice() +
                    ", color: " + getColor();
        }
    }, TOYOTA(45000) {
        @Override
        public String toString() {
            return "TOYOTA price: " + getPrice() +
                    ", color: " + getColor();
        }
    }, LEXUS(75000) {
        @Override
        public String toString() {
            return "LEXUS price: " + getPrice() +
                    ", color: " + getColor();
        }
    }, HYUNDAI(30000) {
        @Override
        public String toString() {
            return "HYUNDAI price: " + getPrice() +
                    ", color: " + getColor();
        }
    };
    private int price;
    private String color;

    Vehicles(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicles.BMW.setColor("black");
        Vehicles.TOYOTA.setColor("white");
        Vehicles.LEXUS.setColor("grey");
        Vehicles.HYUNDAI.setColor("red");
        System.out.println(Vehicles.BMW);
        System.out.println(Vehicles.TOYOTA);
        System.out.println(Vehicles.LEXUS);
        System.out.println(Vehicles.HYUNDAI);

    }
}
