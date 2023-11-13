package Node;

public class NodeBuku {
    public int kode_buku;
    public String judul_buku;
    public int stok_buku;
    public String pengarang;

    public NodeBuku(int kode_buku, String judul_buku, String pengarang) {
        this.kode_buku = kode_buku;
        this.judul_buku = judul_buku;
        this.pengarang = pengarang;
    }

    public void updateStok(int newStok){
        this.stok_buku = this.stok_buku + newStok;
    }
}
