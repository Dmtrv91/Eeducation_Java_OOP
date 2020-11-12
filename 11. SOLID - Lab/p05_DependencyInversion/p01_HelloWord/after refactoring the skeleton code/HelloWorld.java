package p05_DependencyInversion.p01_HelloWord;

import java.time.LocalDateTime;

public class HelloWorld {
    public String greeting(String name, int hour) {
        if (hour< 12) {
            return "Good morning, " + name;
        }

        if (hour < 18) {
            return "Good afternoon, " + name;
        }

        return "Good evening, " + name;
    }
}
