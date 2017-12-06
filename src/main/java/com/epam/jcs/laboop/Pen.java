package com.epam.jcs.laboop;

public class Pen {

    private int price;
    private String producerName;
    private String color;
    private int lineWidth;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Pen() {
    }

    public Pen(int price, String producerName) {
        this.price = price;
        this.producerName = producerName;
    }

    public Pen(int price, String producerName, String color, int lineWidth) {
        this(price, producerName);
        this.color = color;
        this.lineWidth = lineWidth;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Pen pen = (Pen) object;

        if (price != pen.price) return false;
        if (lineWidth != pen.lineWidth) return false;
        if (producerName != null ? !producerName.equals(pen.producerName) : pen.producerName != null) return false;
        return color != null ? color.equals(pen.color) : pen.color == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (producerName != null ? producerName.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + lineWidth;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + " . The price is: " + price + ". The producer name is " + producerName +
                ". It's color is " + color + " and it's lineWidth is " + lineWidth + "." +
                System.getProperty("line.separator");
    }
}
