package com.example.demo.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.DocumentException;
import org.w3c.dom.Document;
import org.w3c.tidy.Tidy;
import org.xhtmlrenderer.pdf.ITextRenderer;


public class Html2Pdf {

  public static void convert(String input, OutputStream out) throws DocumentException, IOException {
    convert(new ByteArrayInputStream(input.getBytes()), out);
  }

  public static void convert(InputStream input, OutputStream out) throws DocumentException, IOException {
    Tidy tidy = new Tidy();
    Document doc = tidy.parseDOM(input, null);
    ITextRenderer renderer = new ITextRenderer();
    renderer.setDocument(doc, null);
    renderer.layout();
    renderer.createPDF(out);
  }

}