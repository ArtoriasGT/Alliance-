package javatalks.GUI;

import java.util.Date;

public class Table {
    private String name;
    private Date createDate;

    public Table(String name, Date createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Object getElement(int i) {
        switch (i) {
            case 0: return getName();
            case 1: return getCreateDate();
            default: return null;
        }
    }
}


