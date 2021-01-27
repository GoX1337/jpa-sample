package org.gox.jpa.form;

import java.util.Date;

public class EventForm {

    private Date date;
    private String payload;

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
