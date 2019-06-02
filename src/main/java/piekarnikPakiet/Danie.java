package piekarnikPakiet;

public class Danie {

    String nazwa;
    int temperaturaPieczenia;
    int czasPieczenia;


    public Danie() {
    }

    public Danie(String nazwa, int temperaturaPieczenia, int czasPieczenia) {
        this.temperaturaPieczenia = temperaturaPieczenia;
        this.czasPieczenia = czasPieczenia;
        this.nazwa = nazwa;
    }

    public void setTemperaturaPieczenia(int temperaturaPieczenia) {
        this.temperaturaPieczenia = temperaturaPieczenia;
    }

    public void setCzasPieczenia(int czasPieczenia) {
        this.czasPieczenia = czasPieczenia;
    }

    public int getTemperaturaPieczenia() {
        return temperaturaPieczenia;
    }

    public int getCzasPieczenia() {
        return czasPieczenia;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tadaa! danie gotowe: ");
        sb.append("nazwa = '").append(nazwa).append('\'');
        sb.append(", Temperatura pieczenia = ").append(temperaturaPieczenia);
        sb.append(", Czas pieczenia = ").append(czasPieczenia);

        return sb.toString();
    }
}
