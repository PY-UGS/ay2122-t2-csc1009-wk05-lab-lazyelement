import java.util.Date;

public abstract class GeometricObject {
    private String color = "White";
    private boolean filled = false;
    private Date dateCreated;
    
    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = "White";
        this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + getDateCreated() + "\ncolor: " + color + " and filled: " + filled;
    }
}
