package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 20.08.2015.
 */
public abstract class AbstractElement<T> {

    protected List<String> cssClasses = new ArrayList<String>();
    protected String text = "";

    protected String getText(){
        if(!text.isEmpty()) {
            return text;
        } else {
            return "";
        }
    }

    protected String getCssClass() {
        StringBuilder html = new StringBuilder();
        if (!cssClasses.isEmpty()) {
            html.append(" class=\"");
            for (String cssClass : cssClasses) {
                html.append(cssClass).append(" ");
            }
            html.append('"');
        }
        return html.toString();
    }

    public T addClass(String... cssClasses) { // ... для создания массива значений!!!! vrags - variable arguments read!!!
        for (String cssClass : cssClasses) {
            this.cssClasses.add(cssClass);
        }
        return (T) this;
    }
    public T addText(String text){
        this.text = text;
       return (T) this;

    }
}
