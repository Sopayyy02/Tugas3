package AbstractdanInterface;



abstract class Pegawai {

    /**
     * @return the nama
     */
    protected String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    protected void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the id
     */
    protected String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    protected void setId(String id) {
        this.id = id;
    }
    private String nama;
    private String id;

    public Pegawai(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
}
