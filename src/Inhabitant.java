
public class Inhabitant {
    /*
    * The protected access modifier is accessible within package and outside the package but through inheritance only.
    * The protected access modifier can be applied on the data member, method and constructor.
    * It can't be applied on the class.
    * */
    //Attributes
    protected int income;

    //Operations
    public int taxableIncome() {
        return this.income;
    }
    public int tax() {
        if(this.income/10 < 1) {
            return 1;
        } else {
            return (int) Math.floor(this.taxableIncome()/10);
        }

    }
    public void setIncome(int income) {
        this.income = income;
    }

}
