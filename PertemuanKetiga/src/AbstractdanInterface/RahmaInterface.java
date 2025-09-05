/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractdanInterface;

/**
 *
 * @author VIVOBOOK 14
 */
public class RahmaInterface implements Kerja, Pengamat, BeriPerintah {

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }
    private String Nama;
    public RahmaInterface(String Nama){
        this.Nama = Nama;
    }
    public void mengerjakan(){
        System.out.println(getNama() + " Mengerjakan Laporan");
    }
    public void Mengamati(){
        System.out.println(getNama() + " Mengamati karyawan");
    }
    public void memerintah(){
        System.out.println(getNama() + " Memerintah karyawan");
    }
    
    public static void main(String []args){
        RahmaInterface rahma = new RahmaInterface("Rahma");
        
        rahma.mengerjakan();
        rahma.memerintah();
        rahma.Mengamati();
    }
}
