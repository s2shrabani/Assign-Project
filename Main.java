
public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.work(260);
        System.out.println("Hourly Employee Vacation Days: " + hourlyEmployee.getVacationDaysAccumulated());
        hourlyEmployee.takeVacation(5);
        System.out.println("Hourly Employee Vacation Days after taking vacation: " + hourlyEmployee.getVacationDaysAccumulated());

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.work(260);
        System.out.println("Salaried Employee Vacation Days: " + salariedEmployee.getVacationDaysAccumulated());
        salariedEmployee.takeVacation(10);
        System.out.println("Salaried Employee Vacation Days after taking vacation: " + salariedEmployee.getVacationDaysAccumulated());

        Manager manager = new Manager();
        manager.work(260);
        System.out.println("Manager Vacation Days: " + manager.getVacationDaysAccumulated());
        manager.takeVacation(20);
        System.out.println("Manager Vacation Days after taking vacation: " + manager.getVacationDaysAccumulated());
    }
}
