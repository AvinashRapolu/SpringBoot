package com.avinash.DbDemo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Operating_System")
public class EntityOs {

    @Id
    @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String osName;
    @Column
    private String BasedOn;
    @Column
    private String versionNo;


    public String getOsName() {
        return osName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getBasedOn() {
        return BasedOn;
    }

    public void setBasedOn(String basedOn) {
        BasedOn = basedOn;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }
}
