/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlcod;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author mfrancomartinez
 */
public class EjemploJsoup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
    
    String title = doc.title();
    System.out.println("title:"+title);   
    
    
    Elements links = doc.select("a");
      for (Element link : links) {
               
        System.out.println("contenido: " + link.text());


    
    
    }
}
}

