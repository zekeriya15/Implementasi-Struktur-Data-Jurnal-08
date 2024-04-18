import java.util.HashMap;

public class Mapping {
    HashMap<Mahasiswa, Double> mapMahasiswa = new HashMap<>();

    
    public void inputMahasiswa(Mahasiswa mhs) {
        mapMahasiswa.put(mhs, 0.0);
    }

    public void hapusMahasiswa(Mahasiswa mhs) {
        mapMahasiswa.remove(mhs);
    }

    public void simpanNilai(Mahasiswa mhs, double nilai) {
        // if (mapMahasiswa.containsKey(mhs)) {
        //     mapMahasiswa.replace(mhs, nilai);
        //     System.out.println("Mahasiswa dengan NIM " + mhs.getNIM() + " berhasil disimpan");
        // } else {
        //     System.out.println("Mahasiswa dengan NIM " + mhs.getNIM() + " tidak ditemukan");
        // }
        mapMahasiswa.put(mhs, nilai);
    }

    public void printNilai() {
        for (HashMap.Entry<Mahasiswa, Double> entry : mapMahasiswa.entrySet()) {
            System.out.println("NIM: " + entry.getKey().getNIM());
            System.out.println("Nama: " + entry.getKey().getNama());
            System.out.println("NIM: " + entry.getKey().getKelas());
            System.out.println("Nilai: " + entry.getValue());
            System.out.println("===========");
        }
    }

    public double rataRata() {
        double jumlahNilai = 0;
        // int banyakNilai = 0;

        for (double nilai : mapMahasiswa.values()) {
            jumlahNilai += nilai;
            // banyakNilai++;
        }

        return jumlahNilai / mapMahasiswa.size();
    }
}
