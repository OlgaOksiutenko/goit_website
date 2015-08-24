package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 18.08.2015.
 */
public class Body extends AbstractElement<Body> implements Element { // <Body> что бы знать что мы возвращаем!!! это вместо Т

    private List<Element> elements = new ArrayList<Element>();

    public Body addElement(Element el) {
        this.elements.add(el);
        return this;
    }
    @Override
    public String print(){
        StringBuilder html = new StringBuilder()
            .append("<body")
            .append(getCssClass())
            .append(">")
            .append(getText());

        for (Element el: elements){
            html.append(el.print());
        }
        return html.append("</body>").toString();
       // String buttonString = (buttons == null) ? "" : buttons.toString(); // like "if"
       // return String.format("<body>%s</body>", buttonString);
    }

}
