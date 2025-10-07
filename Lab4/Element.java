public class Element {
    private String tag;

    public Element(String t){
        this.tag = t;
    }

    public String getTag(){
        return tag;
    }

    // Default toString
    public String toString() {
        return ("<" + tag + " />");
    }
}
