package cajaregistradora;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author randa
 */
public class CrearPDF {


    NewJFrame ticket = new NewJFrame();

    public void Crear_PDF() {

        //vamos a crea un archivo pdf
        //creamos un documento PDF especifica el tamaño
        Document documento = new Document(PageSize.LETTER);

        try {

            //Creamos el OutPutStream co la ruta donde vamos a guaradar el fichero
            FileOutputStream fichero = new FileOutputStream("/Users/randa/OneDrive/Documentos/NetBeansProjects/CajaRegistradora/src/cajaregistradora");

            PdfWriter writer = PdfWriter.getInstance(documento, fichero);

            documento.open();

            //una vez abierto el documento vamos a gregar el texto y las imagenes
            

//******************************************************************************
            //Añadimos Titulo del Documento
            PdfContentByte texto = writer.getDirectContent();

            BaseFont bf1 = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.EMBEDDED);
            texto.setFontAndSize(bf1, 18);
            //Empiezo a escribir/home/maryse/NetBeansProjects/Calaverita/src/calaverita/CrearPDF.java:23
            texto.beginText();

            //Titulo del reporte
            texto.setTextMatrix(200, 300);
            texto.showText("Ingeniería en Computación");
            texto.showText("Ticket de compra");
            texto.setColorFill(BaseColor.CYAN);

            texto.endText();

//******************************************************************************
 //Añadimos Titulo del Documento
            PdfContentByte texto2 = writer.getDirectContent();

            BaseFont bf2 = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.EMBEDDED);
            texto.setFontAndSize(bf1, 18);
            //Empiezo a escribir/home/maryse/NetBeansProjects/Calaverita/src/calaverita/CrearPDF.java:23
            texto.beginText();

            //Titulo del reporte
            texto.setTextMatrix(200, 300);
            texto.showText(ticket.textArea8.getText());
            texto.showText("Ticket de compra");
            texto.setColorFill(BaseColor.CYAN);

            texto.endText();

//******************************************************************************
            //Añade la imagen, para la el contenido
            Image jLabel1 = Image.getInstance("C:/Users/randa/OneDrive/Documentos/NetBeansProjects/CajaRegistradora/src/cajaregistradora/codigo de barras.jpg");
            jLabel1.setAlignment(Element.PARAGRAPH);
            jLabel1.scaleAbsolute(324, 77);

           
            

//******************************************************************************

            documento.add(jLabel1);                                    
            //documento.add(imagen3);
            documento.close();

        } catch (DocumentException | FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (MalformedURLException ex) {
            java.util.logging.Logger.getLogger(CrearPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CrearPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        ticket.setVisible(false);
    }

    public static void main(String args[]){
       CrearPDF crear= new CrearPDF();
       crear.Crear_PDF();
   }
}
