package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 24.08.2015.
 */
public class Paragraph extends AbstractElement<Paragraph> implements Element {

    private List<Element> elements = new ArrayList<Element>();

    public Paragraph addElement(Element el) {
        this.elements.add(el);
        return this;
    }

    @Override
    public String print(){
        StringBuilder html = new StringBuilder()
                .append("<p")
                .append(getCssClass())
                .append(">")
                .append(getText());

        for (Element el: elements){
            html.append(el.print());
        }
        return html.append("</p>").toString();

    }

}

