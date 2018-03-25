package ZDITM.module;

import ZDITM.core.model.Agency;
import ZDITM.core.model.Route;
import ZDITM.core.model.Trip;
import ZDITM.core.parser.AgencyParser;
import ZDITM.core.parser.FeedParser;
import ZDITM.core.parser.RouteParser;
import ZDITM.core.parser.TripParser;

public class ParserModule {

    private static AgencyParser agencyParser;

    public static FeedParser<Agency> provideAgencyParser(){
        if (agencyParser == null){
            agencyParser = new AgencyParser();
        }
        return null;
    }
    private static RouteParser routeParser;

    public static FeedParser<Route> provideRouteParser(){
        if (routeParser == null){
            routeParser = new RouteParser();
        }
        return null;
    }

    private static TripParser tripParser;

    public static FeedParser<Trip> provideTripParser() {
        if (tripParser == null) {
            tripParser = new TripParser();
        }
        return tripParser;
    }
}
