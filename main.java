
public class main {

    static class Employee {
        private int id;
        private String name;
        private double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void displayDetails() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }

        public double calculateBonus() {
            return 0;
        }
    }

    static class Developer extends Employee {

        Developer(int id, String name, double salary) {
            super(id, name, salary);
        }

        @Override
        public double calculateBonus() {
            return getSalary() * 0.10;
        }
    }

    static class Manager extends Employee {

        Manager(int id, String name, double salary) {
            super(id, name, salary);
        }

        @Override
        public double calculateBonus() {
            return getSalary() * 0.20;
        }
    }

    public static void main(String[] args) {

        Employee developer = new Developer(101, "Amit", 40000);

        Employee manager = new Manager(102, "Priya", 60000);

        developer.displayDetails();
        System.out.println("Bonus: " + developer.calculateBonus());

        System.out.println("----------------");

        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus());
    }
}
