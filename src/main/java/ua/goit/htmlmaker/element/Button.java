package ua.goit.htmlmaker.element;

import ua.goit.htmlmaker.element.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 18.08.2015.
 */
public class Button extends AbstractElement<Button> implements Element {
   // private String name;

   /* public Button(String name) {
        this.name = name;
    }*/
    @Override
    public String print(){
        return new StringBuilder()
                .append("<button")
                .append(getCssClass())
                .append(">")
                .append(getText())
                .append("</button>")
                .toString(); //%s - String what we set
    }

}
