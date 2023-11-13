package Model;

import Node.NodeBuku;

import java.util.ArrayList;

public class ModelBuku {
    public ArrayList<NodeBuku> books;
    private int kode_update = -1;
    public ModelBuku(){
        this.books = new ArrayList<>();
    }

    public void insertBook(String judul, String pengarang){
        this.kode_update++;
        this.books.add(new NodeBuku(this.kode_update, judul, pengarang));
    }

    public ArrayList<NodeBuku> viewBooks(){
        return books;
    }
}
