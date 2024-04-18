import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Mapping listMahasiswa = new Mapping();

        while (true) {
            System.out.println("Pilih operasi: \n1. Tambah data mahasiswa \n2. Hapus data mahasiswa \n3. Simpan nilai mahasiswa \n4. Tampilkan nilai mahasiswa \n5. Keluar");
            
            int pilihan = s.nextInt();
            s.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String NIM = s.next(); s.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = s.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelas = s.nextLine();

                    listMahasiswa.inputMahasiswa(new Mahasiswa(NIM, nama, kelas));
                    System.out.println("Data berhasil ditambahkan");
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    NIM = s.next(); s.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama = s.nextLine();
                    System.out.print("Masukkan kelas: ");
                    kelas = s.nextLine();

                    listMahasiswa.hapusMahasiswa(new Mahasiswa(NIM, nama, kelas));
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    NIM = s.next(); s.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama = s.nextLine();
                    System.out.print("Masukkan kelas: ");
                    kelas = s.nextLine();
                    System.out.print("Masukkan nilai: ");
                    double nilai = s.nextDouble();

                    listMahasiswa.simpanNilai(new Mahasiswa(NIM, nama, kelas), nilai);
                    System.out.println("Nilai berhasil ditambahkan");
                    break;
                case 4:
                    listMahasiswa.printNilai();
                    System.out.println("Rata rata nilai: " + listMahasiswa.rataRata()); 
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }


    }
}
