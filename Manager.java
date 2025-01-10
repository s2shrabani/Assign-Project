public class Manager extends SalariedEmployee{
    @Override
    protected void accumulateVacationDays(int daysWorked) {
        float vacationDaysAccumulated = getVacationDaysAccumulated() + (daysWorked / 260.0f) * 30;
        setVacationDaysAccumulated(vacationDaysAccumulated);
    }

    private void setVacationDaysAccumulated(float vacationDaysAccumulated) {
        super.vacationDaysAccumulated = vacationDaysAccumulated;
    }
}
