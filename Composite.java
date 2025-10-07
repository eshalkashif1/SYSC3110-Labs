import java.util.ArrayList;
import java.util.List;

public class Composite extends Element{

    private List<Element> elements;

    public Composite(String tag){
        super(tag);
        elements = new ArrayList<>();
    }

    public void addElement(Element e){
        elements.add(e);
    }

    public void removeElement(Element e){
        elements.remove(e);
    }

    public List<Element> getElements(){
        return elements;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.getTag()).append(">\n");
        for (Element e : elements) {
            sb.append(e.toString());
        }
        sb.append("</").append(this.getTag()).append(">\n");
        return sb.toString();
    }
}
