package salaaryCalculation;

public class EmployeeSalaary {
    /*
     Adı : kemal
     Maaşı : 2000.0
     Çalışma Saati : 45
     Başlangıç Yılı : 1985
     Vergi : 60.0
     Bonus : 150.0
     Maaş Artışı : 300.0
     Vergi ve Bonuslar ile birlikte maaş : 2090.0
     Toplam Maaş : 2300.0
     */
    String name;
    int salary;
    int workHours;
    int hireYear;

    EmployeeSalaary(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax(int salary) {


        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }


    }

    int bonus(int workHours) {



        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }


    }

    double raiseSalary(int salary, int hireYear) {


        if (salary >= 2021) {


            if ((2021 - hireYear) <= 9) {

                return salary * 0.05;

            } else if (9 > 2021 - hireYear && 2021 - hireYear < 20) {

                return salary * 0.10;

            } else {

                return salary * 0.15;

            }


        } else {

            System.out.println("DAHA CALİSMAYA BASLAMAMİSSİN OROSPU COCUGU NE ZAMMI BEKLİYORSUN.");
            return 0;

        }


    }

    void infoEmployee() {

        System.out.println("ADİ:\t" + this.name);
        System.out.println("MAASİ:\t" + this.salary);
        System.out.println("CALİSMA SAATİ:\t" + this.workHours);
        System.out.println("BASLANGİC YİLİ:\t" + this.hireYear);
        System.out.println("VERGİ:\t" + tax(this.salary));
        System.out.println("BONUS:\t" + bonus(this.workHours));
        System.out.println("BASLANGİC YİLİ:\t" + this.hireYear);
        System.out.println("MAAS ARTİSİ:\t" + raiseSalary(this.salary, this.hireYear));
        System.out.println("VERG VE BONUSLAR İLE BİRLİKTE MAAS\t:" + (this.salary - tax(this.salary) + bonus(this.workHours)));
        System.out.println("TOPLAM MAAS:\t" + (this.salary + raiseSalary(this.salary, this.hireYear)));


    }

}
