
class Employees {

    private String number;
    private String name;

    public Employees(String num, String n) {
        this.number = num;
        this.name = n;
    }

    public void set_Name(String n) {
        this.name = n;
    }

    public String get_Number() {
        return number;
    }

    public String get_Name() {
        return name;
    }
}

class PartTimeEmployee extends Employees {

    private double hourlyPay;

    public PartTimeEmployee(String num, String n, double pay) {
        super(num, n);
        this.hourlyPay = pay;
    }

    public void set_hourlyPay(double pay) {
        this.hourlyPay = pay;
    }

    public double get_hourlyPay() {
        return hourlyPay;
    }

    public double calculateWeeklyPay(int h) {
        return hourlyPay * h;
    }
}

public class employee {
    public static void main(String[] args) {
        PartTimeEmployee emp = new PartTimeEmployee("101", "Manjeet", 200);

        System.out.println("Employee Number : " + emp.get_Number());

        System.out.println("\nEmployee Name : " + emp.get_Name());

        System.out.println("\nHourly Pay : " + emp.get_hourlyPay());

        System.out.println("\nWeekly Pay : " + emp.calculateWeeklyPay(20));

        emp.set_hourlyPay(250);

        System.out.println("\nUpdate hourly pay : " + emp.get_hourlyPay());

        System.out.println("\nWeekly PaY : " + emp.calculateWeeklyPay(20));
    }
}
