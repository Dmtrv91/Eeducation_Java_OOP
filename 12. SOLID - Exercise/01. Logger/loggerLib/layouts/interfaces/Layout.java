package loggerLib.layouts.interfaces;

import loggerLib.enumerations.ReportLevel;

public interface Layout {

    String format(String date, ReportLevel reportLevel, String message);


}
