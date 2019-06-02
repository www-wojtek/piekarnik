package piekarnikPakiet;

public class Sterowanie {

    Piec piec = new Piec();

    public void start() {
        try {
            piec.menuPiekarnika();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
