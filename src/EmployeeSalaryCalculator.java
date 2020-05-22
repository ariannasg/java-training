public class EmployeeSalaryCalculator {
    public static void calculateEmployeeSalary(
            double hoursEmployeeWorksPerWeek,
            double amountEarnedPerHour,
            int daysTakenAsVacation
    ) {
        if (hoursEmployeeWorksPerWeek <= 0 || hoursEmployeeWorksPerWeek >= 84) {
            System.out.println("Invalid input. The employee can only work between 1 and 84h (12x7) per week.");
            return;
        }

        if (amountEarnedPerHour <= 0) {
            System.out.println("Invalid input. The amount earned per hour should be more than 0.");
            return;
        }

        if (daysTakenAsVacation < 0 || daysTakenAsVacation > 365) {
            System.out.println("Invalid input. The employee can only take between 1 and 365 days holiday per year.");
            return;
        }

        int weeksInAYear = 365 / 7;
        double hoursTakenAsVacation = daysTakenAsVacation * 8;
        double totalHoursWorkedInAYear = (hoursEmployeeWorksPerWeek * weeksInAYear) - hoursTakenAsVacation;

        double result = totalHoursWorkedInAYear * amountEarnedPerHour;

        System.out.println("The employee's yearly gross salary is: $" + result);
    }

    public static void main(String[] args) {
        calculateEmployeeSalary(0, 30, 25);
        calculateEmployeeSalary(40, 0, 25);
        calculateEmployeeSalary(40, 30, 400);
        calculateEmployeeSalary(40, 30, 25);
    }
}

//CONSOLE OUTPUT:
//Invalid input. The employee can only work between 1 and 84h (12x7) per week.
//Invalid input. The amount earned per hour should be more than 0.
//Invalid input. The employee can only take between 1 and 365 days holiday per year.
//The employee's yearly gross salary is: $56400.0
