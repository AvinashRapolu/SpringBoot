package com.avinash.DataBase.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEAL")
public class DealerEntity
{
    @Id
    @Column
    private String name;
    @Column
    private long phone;
    @Column
    private String office;

    public DealerEntity() {
    }

    public DealerEntity(String name, long phone, String office) {
        this.name = name;
        this.phone = phone;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
