package MaasHesaplayici;

public class Employee {
    String name; // Çalışanın adı ve soyadı
    double salary; // Çalışanın maaşı
    int workHours; // Haftalık çalışma saati
    int hireYear; // İşe başlangıç yılı

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        } else
            return 0;
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else
            return 0;

    }

    public double raiseSalary() {
        if (2021 - hireYear < 10) {
            return salary * 0.05;
        } else if (9 < 2021 - hireYear && 2021 - hireYear < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş : " + (this.salary - tax() + bonus() + raiseSalary());
    }
}
