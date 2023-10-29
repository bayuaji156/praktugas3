package p;

/**
 * Kelas p.Tabung digunakan untuk menghitung volume tabung.
 */
public class Tabung {
    private double jariJari; // Jari-jari tabung
    private double tinggi;   // Tinggi tabung

    /**
     * Konstruktor untuk kelas p.Tabung.
     *
     * @param jariJari Jari-jari tabung.
     * @param tinggi   Tinggi tabung.
     */
    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    /**
     * Menghitung volume tabung.
     *
     * @return Volume tabung.
     */
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    /**
     * Mengambil jari-jari tabung.
     *
     * @return Jari-jari tabung.
     */
    public double getJariJari() {
        return jariJari;
    }

    /**
     * Mengambil tinggi tabung.
     *
     * @return Tinggi tabung.
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * Mengatur jari-jari tabung.
     *
     * @param jariJari Jari-jari tabung yang baru.
     */
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    /**
     * Mengatur tinggi tabung.
     *
     * @param tinggi Tinggi tabung yang baru.
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        Tabung tabung = new Tabung(5.0, 10.0);

        // Menghitung volume tabung
        double volume = tabung.hitungVolume();
        System.out.println("Volume tabung: " + volume);

        // Mengubah jari-jari dan tinggi tabung
        tabung.setJariJari(7.0);
        tabung.setTinggi(15.0);

        // Menghitung volume setelah perubahan
        double newVolume = tabung.hitungVolume();
        System.out.println("Volume tabung setelah perubahan: " + newVolume);
    }
}
