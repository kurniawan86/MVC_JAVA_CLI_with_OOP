import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM PERPUSATAKAAN SEDERHANA");
        System.out.println();

        int pil_menuUtama = 0;
        while (pil_menuUtama != 6){
            System.out.println("Menu Utama ");
            System.out.println("1. Manajemen Buku");
            System.out.println("2. Manajemen Pegawai");
            System.out.println("3. Manajemen Anggota");
            System.out.println("4. Transkasi Peminjaman");
            System.out.println("5. Transaksi Pengembalian");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("masukkan pilihan anda : ");
            pil_menuUtama = input.nextInt();
            switch (pil_menuUtama){
                case 1:
                    int pil_menuBuku = 0;
                    while (pil_menuBuku != 7)
                    {
                        System.out.println("anda masuk pilihan menu Manajemen Buku");
                        System.out.println("");
                        System.out.println("1. Cetak semua daftar buku ");
                        System.out.println("2. Tambah buku");
                        System.out.println("3. Update stok buku");
                        System.out.println("4. Update data buku");
                        System.out.println("5. Delete Buku");
                        System.out.println("6. Pencarian Buku");
                        System.out.println("7. Kembali ke Menu Utama");
                        System.out.print("masukkan pilihan : ");
                        pil_menuBuku = input.nextInt();
                        switch (pil_menuBuku){
                            case 1:
                                System.out.println(" daftar buku ");
                                break;
                            case 2:
                                System.out.println(" tambah buku ");
                                break;
                            case 3:
                                System.out.println(" update stok buku ");
                                break;
                            case 4:
                                System.out.println(" update data buku ");
                                break;
                            case 5:
                                System.out.println(" delete buku ");
                                break;
                            case 6:
                                System.out.println(" pencarian buku ");
                                break;
                            case 7:
                                System.out.println(" kembali ke menu utama ");
                                break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("anda masuk pilihan menu Manajemen Pegawai");
                    break;
                case 3:
                    System.out.println("anda masuk pilihan menu Menajemen Anggota");
                    break;
                case 4:
                    System.out.println("anda masuk pilihan menu Transaksi Peminjaman");
                    break;
                case 5:
                    System.out.println("anda masuk pilihan menu Transaksi Pengembalian");
                    break;
                case 6:
                    System.out.println("- EXIT -");
                    break;
                default:
                    System.out.println("pilihan tidak ada, silahkan masukkan pilihan lagi");
            }
        }
    }
}