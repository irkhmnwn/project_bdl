/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Irkhamnawan
 */
@Embeddable
public class DetailPenyewaanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_kendaraan")
    private String idKendaraan;
    @Basic(optional = false)
    @Column(name = "id_penyewaan")
    private String idPenyewaan;
    @Basic(optional = false)
    @Column(name = "id_sopir")
    private String idSopir;

    public DetailPenyewaanPK() {
    }

    public DetailPenyewaanPK(String idKendaraan, String idPenyewaan, String idSopir) {
        this.idKendaraan = idKendaraan;
        this.idPenyewaan = idPenyewaan;
        this.idSopir = idSopir;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public String getIdSopir() {
        return idSopir;
    }

    public void setIdSopir(String idSopir) {
        this.idSopir = idSopir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKendaraan != null ? idKendaraan.hashCode() : 0);
        hash += (idPenyewaan != null ? idPenyewaan.hashCode() : 0);
        hash += (idSopir != null ? idSopir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPenyewaanPK)) {
            return false;
        }
        DetailPenyewaanPK other = (DetailPenyewaanPK) object;
        if ((this.idKendaraan == null && other.idKendaraan != null) || (this.idKendaraan != null && !this.idKendaraan.equals(other.idKendaraan))) {
            return false;
        }
        if ((this.idPenyewaan == null && other.idPenyewaan != null) || (this.idPenyewaan != null && !this.idPenyewaan.equals(other.idPenyewaan))) {
            return false;
        }
        if ((this.idSopir == null && other.idSopir != null) || (this.idSopir != null && !this.idSopir.equals(other.idSopir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.DetailPenyewaanPK[ idKendaraan=" + idKendaraan + ", idPenyewaan=" + idPenyewaan + ", idSopir=" + idSopir + " ]";
    }
    
}
