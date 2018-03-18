package ZDITM.module;

import ZDITM.core.model.Agency;
import ZDITM.core.model.Route;
import ZDITM.core.parser.AgencyParser;
import ZDITM.core.parser.FeedParser;
import ZDITM.core.parser.RouteParser;

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

}
