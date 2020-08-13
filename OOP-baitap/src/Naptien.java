import java.util.Arrays;

public class Naptien {
    private String name;
    private int xxx;
    private String[] histories = new String[3];
    private int i = 0;
    public Naptien(String name, int xxx) {
        this.name = name;
        this.xxx = xxx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHistories() {
        return histories;
    }

    public void setHistories(String[] histories) {
        this.histories = histories;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXxx() {
        return xxx;
    }

    public void setXxx(int xxx) {
        this.xxx = xxx;
    }

    public void napTien(int xxx) {
        this.xxx =this.xxx+ xxx;
        histories[i] = "Ban da nap "+xxx;
        i++;
    }
    public void rutTien(int xxx) {
        this.xxx =this.xxx- xxx;
        histories[i] = "Ban da rut "+ xxx;
        i++;
    }

    @Override
    public String toString() {
        String history ="";
        for(int i=0; i< histories.length; i++) {
            history += histories[i] + "\n";
        }
        return history;
    }
}
