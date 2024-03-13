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
@Table(name = "pegawai")
@NamedQueries({
    @NamedQuery(name = "Pegawai.findAll", query = "SELECT p FROM Pegawai p"),
    @NamedQuery(name = "Pegawai.findByIdPegawai", query = "SELECT p FROM Pegawai p WHERE p.idPegawai = :idPegawai"),
    @NamedQuery(name = "Pegawai.findByNamaPegawai", query = "SELECT p FROM Pegawai p WHERE p.namaPegawai = :namaPegawai"),
    @NamedQuery(name = "Pegawai.findByJabatanPegawai", query = "SELECT p FROM Pegawai p WHERE p.jabatanPegawai = :jabatanPegawai"),
    @NamedQuery(name = "Pegawai.findByAlamatPegawai", query = "SELECT p FROM Pegawai p WHERE p.alamatPegawai = :alamatPegawai"),
    @NamedQuery(name = "Pegawai.findByTelpPegawai", query = "SELECT p FROM Pegawai p WHERE p.telpPegawai = :telpPegawai")})
public class Pegawai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pegawai")
    private String idPegawai;
    @Basic(optional = false)
    @Column(name = "nama_pegawai")
    private String namaPegawai;
    @Basic(optional = false)
    @Column(name = "jabatan_pegawai")
    private String jabatanPegawai;
    @Basic(optional = false)
    @Column(name = "alamat_pegawai")
    private String alamatPegawai;
    @Basic(optional = false)
    @Column(name = "telp_pegawai")
    private String telpPegawai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPegawai")
    private Collection<Penyewaan> penyewaanCollection;

    public Pegawai() {
    }

    public Pegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public Pegawai(String idPegawai, String namaPegawai, String jabatanPegawai, String alamatPegawai, String telpPegawai) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.jabatanPegawai = jabatanPegawai;
        this.alamatPegawai = alamatPegawai;
        this.telpPegawai = telpPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getJabatanPegawai() {
        return jabatanPegawai;
    }

    public void setJabatanPegawai(String jabatanPegawai) {
        this.jabatanPegawai = jabatanPegawai;
    }

    public String getAlamatPegawai() {
        return alamatPegawai;
    }

    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }

    public String getTelpPegawai() {
        return telpPegawai;
    }

    public void setTelpPegawai(String telpPegawai) {
        this.telpPegawai = telpPegawai;
    }

    public Collection<Penyewaan> getPenyewaanCollection() {
        return penyewaanCollection;
    }

    public void setPenyewaanCollection(Collection<Penyewaan> penyewaanCollection) {
        this.penyewaanCollection = penyewaanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPegawai != null ? idPegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pegawai)) {
            return false;
        }
        Pegawai other = (Pegawai) object;
        if ((this.idPegawai == null && other.idPegawai != null) || (this.idPegawai != null && !this.idPegawai.equals(other.idPegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Pegawai[ idPegawai=" + idPegawai + " ]";
    }
    
}
