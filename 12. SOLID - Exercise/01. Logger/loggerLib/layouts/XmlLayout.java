package loggerLib.layouts;

import loggerLib.enumerations.ReportLevel;
import loggerLib.layouts.interfaces.Layout;

public class XmlLayout implements Layout {

    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("<log>\r\n" +
                "   <date>%s</date>\r\n" +
                "   <level>%s</level>\r\n" +
                "   <message>%s</message>\r\n" +
                "</log>", date, reportLevel.toString(), message);
    }
}
