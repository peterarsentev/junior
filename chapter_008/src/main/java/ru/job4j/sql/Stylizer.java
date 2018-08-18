package ru.job4j.servlets;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
// ...

public class Stylizer {
    // ...
    public static void main (String args[]) {
            File stylesheet = new File(argv[0]);
            File datafile = new File(argv[1]);
        TransformerFactory factory     = TransformerFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(datafile);
            // ...
            StreamSource stylesource = new StreamSource(stylesheet);
            Transformer transformer = Factory.newTransformer(stylesource);
        }
    }
}
