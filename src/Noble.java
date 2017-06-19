
public class Noble extends Inhabitant {
    @Override
    public int  tax() {
        if(this.income/10 <= 20) {
            return 20;
        }
        else {
            return (int) Math.floor(this.income/10);
        }
    }
}
