public abstract class Employee {
    protected float vacationDaysAccumulated;

    public Employee() {
        this.vacationDaysAccumulated = 0;
    }

    public float getVacationDaysAccumulated() {
        return vacationDaysAccumulated;
    }

    public void work(int daysWorked) {
        if (daysWorked < 0 || daysWorked > 260) {
            throw new IllegalArgumentException("Days worked must be between 0 and 260");
        }
        accumulateVacationDays(daysWorked);
    }

    public void takeVacation(float daysUsed) {
        if (daysUsed < 0) {
            throw new IllegalArgumentException("Vacation days used cannot be negative");
        }
        vacationDaysAccumulated -= daysUsed;
        if (vacationDaysAccumulated < 0) {
            vacationDaysAccumulated = 0;
        }
    }

    protected abstract void accumulateVacationDays(int daysWorked);
}
