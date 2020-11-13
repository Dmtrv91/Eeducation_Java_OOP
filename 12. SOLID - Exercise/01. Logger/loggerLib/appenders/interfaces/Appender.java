package loggerLib.appenders.interfaces;

import loggerLib.enumerations.ReportLevel;

public interface Appender {

    void append(String date, ReportLevel reportLevel, String message);
    void setReportLevel(ReportLevel reportLevel);
    ReportLevel getReportLevel();
}
