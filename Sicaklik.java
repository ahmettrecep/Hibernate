package Bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sicaklik")
public class Sicaklik{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;
    @Column(name="KABIN_NO")
    private Integer Kabin_no;
    @Column(name="DEGER")
    private Integer deger;
    @Column(name="IP_ADRESI")
    private String ipAddress;
    @Column(name="TARIH")
    private String tarih;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getKabin_no() {
        return Kabin_no;
    }

    public void setKabin_no(Integer kabin_no) {
        Kabin_no = kabin_no;
    }

    public Integer getDeger() {
        return deger;
    }

    public void setDeger(Integer deger) {
        this.deger = deger;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}
