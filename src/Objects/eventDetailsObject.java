package Objects;

import java.sql.Date;
import java.sql.Time;



public class eventDetailsObject {

    String eventID;
    String eventName;
    String eventType;
    Date date;
    Time time;
    float eventPrice;

    public eventDetailsObject(String eventID, String eventName, String eventType, Date date, Time time, float eventPrice) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventType = eventType;
        this.date = date;
        this.time = time;
        this.eventPrice = eventPrice;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public float getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(float eventPrice) {
        this.eventPrice = eventPrice;
    }

}
