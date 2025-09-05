/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractdanInterface;

/**
 *
 * @author VIVOBOOK 14
 */
abstract class Manager extends PegawaiTetap{


  
    /**
     * @return the divisi
     */
    protected String getDivisi() {
        return divisi;
    }

    /**
     * @param divisi the divisi to set
     */
    protected void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    private String divisi;

    public Manager(String nama, String id, String gajiBulanan, String divisi) {
        super(nama, id, gajiBulanan);
        this.divisi = divisi;
    }

}
