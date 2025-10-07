public class TextElement extends Element {
    private String text;

    public TextElement(String tag, String text){
        super(tag);
        this.text = text;
    }

    public String getText(){return text;}

    public void setText(String t){
        text = t;
    }

    @Override
    public String toString(){
        return ("<" + this.getTag() + ">" + text + "</" + this.getTag() + ">\n");
    }

}
