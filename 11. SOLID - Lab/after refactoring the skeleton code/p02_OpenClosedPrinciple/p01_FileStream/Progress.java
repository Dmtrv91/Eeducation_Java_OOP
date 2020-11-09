package p02_OpenClosedPrinciple.p01_FileStream;

public class Progress {

    public Progress() {

    }

    public static int getCurrentPercent(StreambleObject streambleObject)
    {
        return streambleObject.getSent() * 100 / streambleObject.getLength();
    }
}
