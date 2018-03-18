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
    public void testParseTrip
    // given
    Trip trip;

    //when
    testTrip = tripParser.parseTo(TEST_LINE);

    //then
    assertEquals(testAgency.)
}