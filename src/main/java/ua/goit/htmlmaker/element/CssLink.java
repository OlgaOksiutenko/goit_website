package ua.goit.htmlmaker.element;

import ua.goit.htmlmaker.element.Element;

/**
 * Created by ol on 20.08.2015.
 */
public class CssLink implements Element{
    private String cssUrl;

    public CssLink(String cssUrl) {
        this.cssUrl = cssUrl;
    }
    @Override
    public String print() {
        return String.format("<link rel=\"stylesheet\" href=\"%s\">", cssUrl);
    }
}
