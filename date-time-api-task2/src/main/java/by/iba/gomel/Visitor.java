/**
 *
 */
package by.iba.gomel;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * This class is a realization of a visitor.
 */
public final class Visitor {
    /**
     * Home location of a visitor.
     */
    private final String home;
    /**
     * Location to trip.
     */
    private String       arrival;
    /**
     * Home UTC.
     */
    private final String homeUtc;
    /**
     * Arrival UTC.
     */
    private String       arrivalUtc;
    /**
     * Duration of a trip.
     */
    private Duration     durToTrip;

    /**
     * Custom constructor.
     *
     * @param homeLocation
     *            - home location of a visitor.
     * @param homeUtc
     *            - home time zone.
     */
    public Visitor(final String home, final String homeUtc) {
        this.durToTrip = Duration.of(0, ChronoUnit.SECONDS);
        this.home = home;
        this.homeUtc = homeUtc;
    }

    /**
     * This method counts arrival time according to duration of a trip and time zones.
     *
     * @param departure
     *            - date and time of departure.
     * @return arrival time.
     */
    public ZonedDateTime countArrivalTime(final LocalDateTime departure) {
        final ZonedDateTime departureZone = ZonedDateTime.of(departure, ZoneId.of(this.homeUtc));

        return departureZone.withZoneSameInstant(ZoneId.of(this.arrivalUtc))
                .plusSeconds(this.durToTrip.getSeconds());
    }

    /**
     * This method counts common duration of a trip: i.e. flight + road from an airport + etc.
     *
     * @param durations
     *            - steps of a trip.
     */
    public void countTimeToTrip(final Duration[] durations) {
        for (final Duration durStep : durations) {
            this.durToTrip = this.durToTrip.plus(durStep);
        }
    }

    /**
     * This methods sets destination point of a trip.
     *
     * @param arraval
     *            - destination point.
     * @param arrivalUtc
     *            - time zone of a destination point.
     */
    public void setArrival(final String arrival, final String arrivalUtc) {
        this.arrival = arrival;
        this.arrivalUtc = arrivalUtc;
    }

    /**
     * This method overrides the default toString method.
     *
     * @return the state of an instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String destination = "";

        if (!"".equals(this.arrival)) {
            destination = "has a trip to: " + this.arrival + "/" + this.arrivalUtc;
        }

        return "Visitor [home: " + this.home + "/" + this.homeUtc + "] " + destination;
    }
}
