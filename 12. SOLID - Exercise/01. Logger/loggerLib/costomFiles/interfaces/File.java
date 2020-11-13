package loggerLib.costomFiles.interfaces;

public interface File {

    void write();
    int getSize();
    void appendBuffer(String text);
}
