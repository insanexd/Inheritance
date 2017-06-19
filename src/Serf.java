
public class Serf extends Peasant {
    @Override
    public int taxableIncome() {
        if(this.income <= 12) {
            return 0;
        } else if (this.income - 12 < 1) {
            return 1;
        } else {
            return (int) Math.floor(this.income -12);
        }
    }
    @Override
    public int tax() {
        if(this.income <= 120) {
            return 0;
        } else if (this.income/10 - 12 < 1) {
            return 1;
        } else {
            return (int) Math.floor(this.income/10 -12);
        }

    }
}
