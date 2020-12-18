package com.finastra.FinastraHelp;

import java.io.File;

//import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.jodconverter.OfficeDocumentConverter;
import org.jodconverter.office.DefaultOfficeManagerBuilder;
import org.jodconverter.office.OfficeException;
import org.jodconverter.office.OfficeManager;
 
public class JOdConverter {
 
    public static void main(String[] args) throws OfficeException {
 
        // 1) Start LibreOffice in headless mode.
        DefaultOfficeManagerBuilder officeManager = null;
        try {
            officeManager = (DefaultOfficeManagerBuilder) new DefaultOfficeManagerBuilder()
                    .setOfficeHome(new File("C:/Program Files (x86)/Microsoft Office")).build();
            ((OfficeManager) officeManager).start();
 
            // 2) Create JODConverter converter
            OfficeDocumentConverter converter = new OfficeDocumentConverter(
                    (OfficeManager) officeManager);
 
            // 3) Create PDF
            createPDF(converter);
            //createPDF(converter);
 
        } finally {
            // 4) Stop LibreOffice in headless mode.
            if (officeManager != null) {
                ((OfficeManager) officeManager).stop();
            }
        }
    }
 
    private static void createPDF(OfficeDocumentConverter converter) {
        try {
            long start = System.currentTimeMillis();
            converter.convert(new File("C://coverter/LLD For MAPPING PACS_007.docx"), new File(
                    "C://coverter/LLD For MAPPING PACS_007.pdf"));
            System.err.println("Generate pdf/HelloWorld.pdf with "
                    + (System.currentTimeMillis() - start) + "ms");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
