package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.*;

/**
 * Created by ol on 18.08.2015.
 */
public class Maker {
    public static void main(String[] args) {
        // String[] args -
        Page page;
        page = new Page()
                .addHead(new Head()
                        .addCssLink(new CssLink("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")))
        .addBody(
                new Body().addClass("bg-success")
                        .addElement(new Div().addClass("container")
                                .addElement(new Div().addClass("row")
                                        .addElement(new Div().addClass("col-md-12")
                                                        .addElement(new Div().addClass("jumbotron")
                                                                .addElement(new Title().addText("Hello, world!!!"))
                                                                .addElement(new Paragraph().addText("..."))
                                                                .addElement(new Paragraph()
                                                                        .addElement(new TagA()
                                                                                        .addClass("btn btn-primary btn-lg")
                                                                                        .addHref("#")
                                                                                        .addRole("button")
                                                                                        .addText("Learn more")
                                                                        )))
                                                .addElement(new Div().addClass("panel panel-default")
                                                        .addElement(new Div().addClass("panel-heading").addText("My Panel"))
                                                        .addElement(new Div().addClass("panel-body")
                                                                .addElement(new Button()
                                                                                .addClass("btn")
                                                                                .addClass("btn-success")
                                                                                .addText("Submit")
                                                                )
                                                                .addElement(new Button()
                                                                        .addClass("btn")
                                                                        .addClass("btn-primary")
                                                                        .addText("Cancel")))))

        )));
        System.out.println(page.print());
    }
}
