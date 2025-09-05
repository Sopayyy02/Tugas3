/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractdanInterface;

/**
 *
 * @author VIVOBOOK 14
 */
public abstract class PegawaiTetap extends Pegawai {
    private String gajiBulanan;

    public PegawaiTetap(String nama, String id, String gajiBulanan) {
        super(nama, id);
        this.gajiBulanan = gajiBulanan;
    }

    /**
     * @return the gajiBulanan
     */
    protected String getGajiBulanan() {
        return gajiBulanan;
    }

    /**
     * @param gajiBulanan the gajiBulanan to set
     */
    protected void setGajiBulanan(String gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }
}