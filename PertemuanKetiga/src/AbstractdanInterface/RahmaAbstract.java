/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractdanInterface;

/**
 *
 * @author VIVOBOOK 14
 */
public class RahmaAbstract extends Manager{

    public RahmaAbstract(String nama, String id, String gajiBulanan, String divisi) {
        super(nama, id, gajiBulanan, divisi);
        System.out.println("Nama : " + getNama());
        System.out.println("Id : " + getId());
        System.out.println("Gaji Per Bulan : " + getGajiBulanan());
        System.out.println("Divisi : " + getDivisi());
    }
   public static void main(String []args){
       RahmaAbstract rahma = new RahmaAbstract("Rahma", "P0902317 ", "100 juta", "Pengembangan Teknologi");
       
   }
}
