package entity;

public class Set {
    public String name;
    public String iso;
    public String time;
    public String clone;


    public Set() {
    }

    public Set(String name, String iso, String time, String clone) {
        this.name = name;
        this.iso = iso;
        this.time = time;
        this.clone = clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClone() {
        return clone;
    }

    public void setClone(String clone) {
        this.clone = clone;
    }


}
