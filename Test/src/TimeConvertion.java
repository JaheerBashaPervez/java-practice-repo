import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeConvertion {

	String getOffSetOfTimeZone(String zoneID) {
		ZoneId zone = ZoneId.of(zoneID);
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = localDateTime.atZone(zone);
		ZoneOffset zoneOffset = zonedDateTime.getOffset();
		return zoneOffset.getId().replaceAll("Z", "+00:00");

	}

}
