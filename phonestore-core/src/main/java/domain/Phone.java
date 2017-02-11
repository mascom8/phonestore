package domain;

import sun.rmi.runtime.Log;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PHONE")
public class Phone {
    @Id
    private Long id;
    private String model;
    @Column(name="trade_mark")
    private String tradeMark;
    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;
    @OneToMany
    private List<Feature> features;
    @OneToMany
    private List<UserPhone> userPhones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<UserPhone> getUserPhones() {
        return userPhones;
    }

    public void setUserPhones(List<UserPhone> userPhones) {
        this.userPhones = userPhones;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                ", phoneType=" + phoneType +
                ", features=" + features +
                ", userPhones=" + userPhones +
                '}';
    }
}
