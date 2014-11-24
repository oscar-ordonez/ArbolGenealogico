
package arbolgenealogico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import static javax.print.attribute.standard.MediaPrintableArea.INCH;
import javax.swing.JPanel;

public class Print implements Printable {

    JPanel x;

    public Print() {
    }

    
    public Print(JPanel x) {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        this.x = x;
        printJob.setPrintable(this);
        if (printJob.printDialog() == true) {
            try {
                printJob.print();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            x.printAll(graphics);
            return (PAGE_EXISTS);
        } else {
            return (NO_SUCH_PAGE);
        }
    }

}
