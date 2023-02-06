/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventori;

/**
 *
 * @author limit
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama, int stok) { 
        kode_barang = kode;
        nama_barang = nama; 
        this.stok = stok;
    }
    public void setStok(int stk){
        this.stok += stk;
    }
    public int getStok(){
        return this.stok;
    }
}
