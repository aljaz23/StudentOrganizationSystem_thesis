/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrgSystem;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author aljaz
 */
public class TrayIconDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, ParseException {
        String datumBaza = "03/12/2021";

        //System.out.println("Do izpitnega roka imate še: "+getDifferenceDays(date,date2)+" dni");
        if (SystemTray.isSupported()) {
            TrayIconDemo td = new TrayIconDemo();
            td.displayTray(datumBaza);
        } else {
            System.err.println("System tray not supported!");
        }
    }

    public void displayTray(String datumBaza) throws AWTException, ParseException {
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate danesDatum = LocalDate.now();
        Date danasnjiDatum = Date.from(danesDatum.atStartOfDay(defaultZoneId).toInstant());

        Date bazniDatum = new SimpleDateFormat("dd/MM/yyyy").parse(datumBaza);

        long razlikaDni;
        razlikaDni = getDifferenceDays(danasnjiDatum, bazniDatum);

        
        String sporocilo = "Izpitni rok pri predmetu INFORMATIKA BO ČEZ " + razlikaDni + " DNI";
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage("OBVESTILO O IZPITNEM ROKU", sporocilo, MessageType.INFO);
    }

    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
