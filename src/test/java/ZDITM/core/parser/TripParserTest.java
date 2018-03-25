package ZDITM.core.parser;

import ZDITM.core.model.Trip;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripParserTest {

    private static final String TEST_LINE = "route_id,service_id,trip_id,trip_headsign,direction_id,block_id,shape_id,wheelchair_accessible,low_floor";
    private FeedParser<Trip> tripParser;
    private Trip trip;

    @Before
    public void setUp() throws Exception{
        tripParser = new TripParser();
        trip = new Trip("route_id","service_id","trip_id","trip_headsign","direction_id","block_id","shape_id","wheelchair_accessible","low_floor");
    }

    @Test
    public void testParseTrip(){
        // given
        Trip testTrip;

        //when
        testTrip = tripParser.parseTo(TEST_LINE);

        //then
        assertEquals(testTrip.getRouteId(),trip.getRouteId());
        assertEquals(testTrip.getServiceId(),trip.getServiceId());
        assertEquals(testTrip.getTripId(),trip.getTripId());
        assertEquals(testTrip.getTripHeadsign(),trip.getTripHeadsign());
        assertEquals(testTrip.getDirectionId(),trip.getDirectionId());
        assertEquals(testTrip.getBlockId(),trip.getBlockId());
        assertEquals(testTrip.getShapeId(),trip.getShapeId());
        assertEquals(testTrip.getWheelchairAccessible(),trip.getWheelchairAccessible());
        assertEquals(testTrip.getLowFloor(),trip.getLowFloor());
    }
}