package org.gox.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private Date date;

    @Column
    private String payload;

    public Event() {
    }

    public Event(Date date, String payload) {
        this.date = date;
        this.payload = payload;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
