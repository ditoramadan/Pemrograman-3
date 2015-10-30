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
@Table(name = "pelanggan", catalog = "store", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pelanggan_1.findAll", query = "SELECT p FROM Pelanggan_1 p"),
    @NamedQuery(name = "Pelanggan_1.findByIdPelanggan", query = "SELECT p FROM Pelanggan_1 p WHERE p.idPelanggan = :idPelanggan"),
    @NamedQuery(name = "Pelanggan_1.findByNama", query = "SELECT p FROM Pelanggan_1 p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pelanggan_1.findByAlamat", query = "SELECT p FROM Pelanggan_1 p WHERE p.alamat = :alamat"),
    @NamedQuery(name = "Pelanggan_1.findByTelp", query = "SELECT p FROM Pelanggan_1 p WHERE p.telp = :telp")})
public class Pelanggan_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pelanggan")
    private String idPelanggan;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "telp")
    private String telp;

    public Pelanggan_1() {
    }

    public Pelanggan_1(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public Pelanggan_1(String idPelanggan, String nama, String alamat, String telp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        String oldIdPelanggan = this.idPelanggan;
        this.idPelanggan = idPelanggan;
        changeSupport.firePropertyChange("idPelanggan", oldIdPelanggan, idPelanggan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        String oldTelp = this.telp;
        this.telp = telp;
        changeSupport.firePropertyChange("telp", oldTelp, telp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelanggan != null ? idPelanggan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelanggan_1)) {
            return false;
        }
        Pelanggan_1 other = (Pelanggan_1) object;
        if ((this.idPelanggan == null && other.idPelanggan != null) || (this.idPelanggan != null && !this.idPelanggan.equals(other.idPelanggan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "store.Pelanggan_1[ idPelanggan=" + idPelanggan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
