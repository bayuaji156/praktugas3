/**
 * Kelas untuk menghitung volume tabung.
 */
class VolumeTabung {
    private double radius;
    private double height;

    /**
     * Konstruktor untuk inisialisasi objek CylinderVolumeCalculator dengan jari-jari dan tinggi tertentu.
     * @param radius jari-jari tabung
     * @param height tinggi tabung
     */
    public VolumeTabung(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Menghitung volume tabung berdasarkan jari-jari dan tinggi.
     * @return volume tabung
     */
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    // Metode lainnya bisa ditambahkan di sini sesuai kebutuhan.

    public static void main(String[] args) {
        // Contoh penggunaan kelas untuk menghitung volume tabung
        double radius = 3.0;
        double height = 5.0;
        VolumeTabung cylinder = new VolumeTabung(radius, height);
        double volume = cylinder.calculateVolume();
        System.out.println("Volume tabung dengan jari-jari " + radius + " dan tinggi " + height + " adalah " + volume);
  }
}