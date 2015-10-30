/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dito
 */
@Entity
@Table(name = "daftar_barang", catalog = "store", schema = "")
@NamedQueries({
    @NamedQuery(name = "DaftarBarang.findAll", query = "SELECT d FROM DaftarBarang d"),
    @NamedQuery(name = "DaftarBarang.findByIdBarang", query = "SELECT d FROM DaftarBarang d WHERE d.idBarang = :idBarang"),
    @NamedQuery(name = "DaftarBarang.findByNamaBarang", query = "SELECT d FROM DaftarBarang d WHERE d.namaBarang = :namaBarang"),
    @NamedQuery(name = "DaftarBarang.findByJenisAlat", query = "SELECT d FROM DaftarBarang d WHERE d.jenisAlat = :jenisAlat"),
    @NamedQuery(name = "DaftarBarang.findByHarga", query = "SELECT d FROM DaftarBarang d WHERE d.harga = :harga")})
public class DaftarBarang implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_barang")
    private String idBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "jenis_alat")
    private String jenisAlat;
    @Basic(optional = false)
    @Column(name = "harga")
    private String harga;

    public DaftarBarang() {
    }

    public DaftarBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public DaftarBarang(String idBarang, String namaBarang, String jenisAlat, String harga) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jenisAlat = jenisAlat;
        this.harga = harga;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        String oldIdBarang = this.idBarang;
        this.idBarang = idBarang;
        changeSupport.firePropertyChange("idBarang", oldIdBarang, idBarang);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        String oldNamaBarang = this.namaBarang;
        this.namaBarang = namaBarang;
        changeSupport.firePropertyChange("namaBarang", oldNamaBarang, namaBarang);
    }

    public String getJenisAlat() {
        return jenisAlat;
    }

    public void setJenisAlat(String jenisAlat) {
        String oldJenisAlat = this.jenisAlat;
        this.jenisAlat = jenisAlat;
        changeSupport.firePropertyChange("jenisAlat", oldJenisAlat, jenisAlat);
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        String oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarang != null ? idBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DaftarBarang)) {
            return false;
        }
        DaftarBarang other = (DaftarBarang) object;
        if ((this.idBarang == null && other.idBarang != null) || (this.idBarang != null && !this.idBarang.equals(other.idBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "store.DaftarBarang[ idBarang=" + idBarang + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
