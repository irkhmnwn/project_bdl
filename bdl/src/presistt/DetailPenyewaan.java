/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "detail_penyewaan")
@NamedQueries({
    @NamedQuery(name = "DetailPenyewaan.findAll", query = "SELECT d FROM DetailPenyewaan d"),
    @NamedQuery(name = "DetailPenyewaan.findByIdKendaraan", query = "SELECT d FROM DetailPenyewaan d WHERE d.detailPenyewaanPK.idKendaraan = :idKendaraan"),
    @NamedQuery(name = "DetailPenyewaan.findByIdPenyewaan", query = "SELECT d FROM DetailPenyewaan d WHERE d.detailPenyewaanPK.idPenyewaan = :idPenyewaan"),
    @NamedQuery(name = "DetailPenyewaan.findByIdSopir", query = "SELECT d FROM DetailPenyewaan d WHERE d.detailPenyewaanPK.idSopir = :idSopir")})
public class DetailPenyewaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetailPenyewaanPK detailPenyewaanPK;
    @JoinColumn(name = "id_kendaraan", referencedColumnName = "id_kendaraan", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Kendaraan kendaraan;
    @JoinColumn(name = "id_penyewaan", referencedColumnName = "id_penyewaan", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Penyewaan penyewaan;
    @JoinColumn(name = "id_sopir", referencedColumnName = "id_sopir", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sopir sopir;

    public DetailPenyewaan() {
    }

    public DetailPenyewaan(DetailPenyewaanPK detailPenyewaanPK) {
        this.detailPenyewaanPK = detailPenyewaanPK;
    }

    public DetailPenyewaan(String idKendaraan, String idPenyewaan, String idSopir) {
        this.detailPenyewaanPK = new DetailPenyewaanPK(idKendaraan, idPenyewaan, idSopir);
    }

    public DetailPenyewaanPK getDetailPenyewaanPK() {
        return detailPenyewaanPK;
    }

    public void setDetailPenyewaanPK(DetailPenyewaanPK detailPenyewaanPK) {
        this.detailPenyewaanPK = detailPenyewaanPK;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Penyewaan getPenyewaan() {
        return penyewaan;
    }

    public void setPenyewaan(Penyewaan penyewaan) {
        this.penyewaan = penyewaan;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailPenyewaanPK != null ? detailPenyewaanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailPenyewaan)) {
            return false;
        }
        DetailPenyewaan other = (DetailPenyewaan) object;
        if ((this.detailPenyewaanPK == null && other.detailPenyewaanPK != null) || (this.detailPenyewaanPK != null && !this.detailPenyewaanPK.equals(other.detailPenyewaanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.DetailPenyewaan[ detailPenyewaanPK=" + detailPenyewaanPK + " ]";
    }
    
}
