package activity_prototype;

public class Clausula implements Cloneable {

    private int id;
    private String text;

    public Clausula(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
