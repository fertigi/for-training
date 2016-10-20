package by.gsu.epamlab;

public class BusinessTrip {
    public final static int dayliAllowance = 10;//daily allowance rate in belarusian rubles (the constant),
    private String employee;//employee`s account
    private int transExpenses;//transportation expenses in belarusian rubles
    private int countDay;//number of days

    public BusinessTrip() {
    }

    public BusinessTrip(String employee, int transExpenses, int countDay) {
        this.employee = employee;
        this.transExpenses = transExpenses;
        this.countDay = countDay;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getTransExpenses() {
        return transExpenses;
    }

    public void setTransExpenses(int transExpenses) {
        this.transExpenses = transExpenses;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public int  getTotal (){
        /*
        getTotal( ) – calculating total business trip expenses
        (= transportation expenses + daily allowance rate * number of days)
        */
        int Total = transExpenses + (dayliAllowance * countDay);

        return Total;
    }

    public void show(){
        System.out.println("rate = " + dayliAllowance);
        System.out.println("account = " + employee);
        System.out.println("transport = " + transExpenses);
        System.out.println("days = " + countDay);
        System.out.println("total = " + getTotal());
    }

    @Override
    public String toString() {
        return "" + dayliAllowance + ";" + employee + ";" + transExpenses + ";" + countDay + ";" + getTotal();
    }
}
