package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 24.08.2015.
 */
public class Title extends AbstractElement<Title> implements Element{
    private List<Element> elements = new ArrayList<Element>();

    public Title addElement(Element el) {
        this.elements.add(el);
        return this;
    }
    @Override
    public String print(){
        StringBuilder html = new StringBuilder()
                .append("<h1")
                .append(getCssClass())
                .append(">")
                .append(getText());

        for (Element el: elements){
            html.append(el.print());
        }
        return html.append("</h1>").toString();

    }

}

