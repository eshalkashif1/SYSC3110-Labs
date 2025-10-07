import javax.xml.soap.Text;

public class XMLDocument {

    private Element root;

    public XMLDocument(Element root){
        this.root = root;
    }

    public void print(){
        System.out.println(root.toString());
    }


    public static void main(String[] args) {
        Composite course = new Composite("course");

        TextElement code = new TextElement("code", "SYSC3110");
        TextElement prof = new TextElement("prof", "Wafa");

        Composite classs = new Composite("class");

        TextElement student1 = new TextElement("student", "Michael");
        TextElement student2 = new TextElement("student", "Alan");

        classs.addElement(student1);
        classs.addElement(student2);

        course.addElement(code);
        course.addElement(prof);
        course.addElement(classs);

        XMLDocument doc = new XMLDocument(course);
        doc.print();
    }
}



