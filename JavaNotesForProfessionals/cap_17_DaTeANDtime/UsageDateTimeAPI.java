package JavaNotesForProfessionals.cap_17_DaTeANDtime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class UsageDateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date time using static now() method ::: >>> " + localDateTime);

        LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("AET")));
        System.out.println("LOCAL TIME USING now(ZoneID zoneId) method ::: >>>> " + ldt1);

        LocalDateTime ldt2 = LocalDateTime.now(Clock.system(ZoneId.of(ZoneId.SHORT_IDS.get("PST"))));
        System.out.println("LOCAL TIME USING now(Clock.system(ZoneId.of())) ::: >>>> " + ldt2);
        System.out.println("Following is a static map in ZoneId class which has mapping of short timezone names to their actual timezone names");
        System.out.println(ZoneId.SHORT_IDS);
    }
}
