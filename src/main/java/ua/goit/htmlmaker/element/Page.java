package ua.goit.htmlmaker.element;

/**
 * Created by ol on 18.08.2015.
 */
public class Page implements Element {
//SOLID
    private Element body, head;

    @Override
    public String print() {
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        if (head != null){
            html.append(head.print());
        }
        if (body != null) {
            html.append(body.print());
        }
        html.append("</html>");
        return html.toString();
    }
    public Page addBody(Element body){
        Element e = new Body();
        this.body = body;
        return this;
    }

    public Page addHead(Element head) {
        this.head = head;
        return this;
    }
}
