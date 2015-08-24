package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 24.08.2015.
 */
public class TagA extends AbstractElement<TagA> implements Element {

    private String text;
    private String href;
    private String role;
    private List<Element> elements = new ArrayList<Element>();

    public TagA addElement(Element el) {
        this.elements.add(el);
        return this;
    }

    public TagA(){
        this.href = "";
        this.role = "";
    }

    public TagA addHref(String href){
        this.href = href;
        return this;
    }

    public TagA addRole(String role){
       this.role = role;
        return this;
    }

    public String print(){
        StringBuilder html = new StringBuilder()
                .append("<a")
                .append(getCssClass())
                .append(getHref())
                .append(getRole())
                .append(">")
                .append(getText());

        for (Element el: elements){
            html.append(el.print());
        }
        return html.append("</a>").toString();

    }

    public String getHref() {
        if(!href.isEmpty()) {
            return String.format("href=\"%s\"", href);
        } else {
            return "";
        }
    }

    public String getRole() {
        if(!role.isEmpty()) {
            return String.format("role=\"%s\"", role);
        } else {
            return "";
        }
    }
}
