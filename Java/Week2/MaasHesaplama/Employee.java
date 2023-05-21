package MaasHesaplama;

public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    // constructor
    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
        if (workHours >= 0) {
            this.workHours = workHours;
        } else {
            this.workHours = 0;
        }
        this.hireYear = hireYear;
    }

    private double tax() {
        double _tax = 0;
        _tax = (salary > 1000) ? _tax + (salary * 0.03) : 0;
        return _tax;
    }

    private double bonus() {
        double _bonus;
        _bonus = (workHours > 40) ? (workHours - 40) * 30 : 0;
        return _bonus;
    }

    private double raiseSalary() {
        double increasedSalary = 0.0;
        if ((2023 - hireYear) < 10) {
            increasedSalary += (salary * 0.5);
        }
        if (((2021 - hireYear) > 9) && ((2021 - hireYear) < 20)) {
            increasedSalary += (salary * 0.1);
        }
        if ((2021 - hireYear) > 19) {
            increasedSalary += (salary * 0.15);
        }
        return increasedSalary;
    }

    @Override
    public String toString() {
        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş : " + (this.salary + raiseSalary()) + "\n";
    }

}
