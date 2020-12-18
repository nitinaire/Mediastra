package com.finastra.FinastraHelp;

import com.lowagie.text.Document;

import com.lowagie.text.DocumentException;

import com.lowagie.text.pdf.PdfWriter;

import com.lowagie.text.rtf.parser.RtfParser;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

public class RtfConverter {


public static void main(String[] args) {

 String inputFile = "C://coverter/Test.rtf";

 String outputFile = "C://coverter/Test.pdf";

 // create a new document

 Document document = new Document();

 try {

     // create a PDF writer to save the new document to disk


	
     PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputFile));
     System.out.println("open the document for modifications\n");
     // open the document for modifications

     document.open();
     // create a new parser to load the RTF file
     System.out.println("create a new parser to load the RTF file\n");
     RtfParser parser = new RtfParser(null);
    
     // read the rtf file into a compatible document
     System.out.println("read the rtf file into a compatible document\n");
     System.out.println(System.getProperty("os.name").toLowerCase());
     System.setProperty("os.name",System.getProperty("os.name").toLowerCase());
     parser.convertRtfDocument(new FileInputStream(inputFile), document);
    
     // save the pdf to disk
     System.out.println(" save the pdf to disk\n");

     document.close();

     System.out.println("Finished");

 } catch (DocumentException e) {

     e.printStackTrace();

 } catch (FileNotFoundException e) {

     e.printStackTrace();

 } catch (IOException e) {

     e.printStackTrace();

 }

}

}