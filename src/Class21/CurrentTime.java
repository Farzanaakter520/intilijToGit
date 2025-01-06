package Class21;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class CurrentTime {
    public static void main(String[] args) {
        // Get the set of all available time zone IDs
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Create a DateTimeFormatter to display the date and time in a readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Iterate through all the time zone IDs and print the current time in each time zone
        for (String zoneId : allZoneIds) {
            // Get the current time in the specific time zone
            ZonedDateTime currentTimeInZone = ZonedDateTime.now(ZoneId.of(zoneId));

            // Format the current time
            String formattedTime = currentTimeInZone.format(formatter);

            // Print the time zone and its corresponding current time
            System.out.println(zoneId + " -> " + formattedTime);
        }
    }
}
