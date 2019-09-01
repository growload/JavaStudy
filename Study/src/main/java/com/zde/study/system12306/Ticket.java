package com.zde.study.system12306;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/31 17:43
 */
public class Ticket {

    private String start;
    private String end;
    private Float price;

    public Ticket(){}
    public Ticket(String start,String end,Float price){
        this.start = start;
        this.end = end;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        builder.append(this.start);
        builder.append("---->");
        builder.append(this.end);
        builder.append(":");
        builder.append(this.price);
        builder.append("]");
        return builder.toString();

    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
