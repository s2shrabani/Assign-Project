public class SalariedEmployee extends Employee{
    @Override
    protected void accumulateVacationDays(int daysWorked) {
        float vacationDaysAccumulated = getVacationDaysAccumulated() + (daysWorked / 260.0f) * 15;
        setVacationDaysAccumulated(vacationDaysAccumulated);
    }
    private void setVacationDaysAccumulated(float vacationDaysAccumulated) {
        super.vacationDaysAccumulated = vacationDaysAccumulated;
    }
}
