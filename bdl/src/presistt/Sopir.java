/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "sopir")
@NamedQueries({
    @NamedQuery(name = "Sopir.findAll", query = "SELECT s FROM Sopir s"),
    @NamedQuery(name = "Sopir.findByIdSopir", query = "SELECT s FROM Sopir s WHERE s.idSopir = :idSopir"),
    @NamedQuery(name = "Sopir.findByNamaSopir", query = "SELECT s FROM Sopir s WHERE s.namaSopir = :namaSopir"),
    @NamedQuery(name = "Sopir.findByAlamatSopir", query = "SELECT s FROM Sopir s WHERE s.alamatSopir = :alamatSopir"),
    @NamedQuery(name = "Sopir.findByTelpSopir", query = "SELECT s FROM Sopir s WHERE s.telpSopir = :telpSopir"),
    @NamedQuery(name = "Sopir.findByTarifPerhari", query = "SELECT s FROM Sopir s WHERE s.tarifPerhari = :tarifPerhari")})
public class Sopir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_sopir")
    private String idSopir;
    @Basic(optional = false)
    @Column(name = "nama_sopir")
    private String namaSopir;
    @Basic(optional = false)
    @Column(name = "alamat_sopir")
    private String alamatSopir;
    @Basic(optional = false)
    @Column(name = "telp_sopir")
    private String telpSopir;
    @Basic(optional = false)
    @Column(name = "tarif_perhari")
    private double tarifPerhari;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sopir")
    private Collection<DetailPenyewaan> detailPenyewaanCollection;

    public Sopir() {
    }

    public Sopir(String idSopir) {
        this.idSopir = idSopir;
    }

    public Sopir(String idSopir, String namaSopir, String alamatSopir, String telpSopir, double tarifPerhari) {
        this.idSopir = idSopir;
        this.namaSopir = namaSopir;
        this.alamatSopir = alamatSopir;
        this.telpSopir = telpSopir;
        this.tarifPerhari = tarifPerhari;
    }

    public String getIdSopir() {
        return idSopir;
    }

    public void setIdSopir(String idSopir) {
        this.idSopir = idSopir;
    }

    public String getNamaSopir() {
        return namaSopir;
    }

    public void setNamaSopir(String namaSopir) {
        this.namaSopir = namaSopir;
    }

    public String getAlamatSopir() {
        return alamatSopir;
    }

    public void setAlamatSopir(String alamatSopir) {
        this.alamatSopir = alamatSopir;
    }

    public String getTelpSopir() {
        return telpSopir;
    }

    public void setTelpSopir(String telpSopir) {
        this.telpSopir = telpSopir;
    }

    public double getTarifPerhari() {
        return tarifPerhari;
    }

    public void setTarifPerhari(double tarifPerhari) {
        this.tarifPerhari = tarifPerhari;
    }

    public Collection<DetailPenyewaan> getDetailPenyewaanCollection() {
        return detailPenyewaanCollection;
    }

    public void setDetailPenyewaanCollection(Collection<DetailPenyewaan> detailPenyewaanCollection) {
        this.detailPenyewaanCollection = detailPenyewaanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSopir != null ? idSopir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sopir)) {
            return false;
        }
        Sopir other = (Sopir) object;
        if ((this.idSopir == null && other.idSopir != null) || (this.idSopir != null && !this.idSopir.equals(other.idSopir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Sopir[ idSopir=" + idSopir + " ]";
    }
    
}
