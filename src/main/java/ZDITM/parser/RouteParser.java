package ZDITM.parser;

import ZDITM.model.FeedModel;
import ZDITM.model.Route;

public class RouteParser extends BaseFeedParcer<Route> {

    private static final int ROUTE_ID_COLUMN = 0;
    private static final int ROUTE_SHORT_NAME_COLUMN = 1;
    private static final int ROUTE_LONG_NAME_COLUMN = 2;
    private static final int ROUTE_DESC_COLUMN = 3;
    private static final int ROUTE_TYPE_COLUMN = 4;
    private static final int ROUTE_URL_COLUMN = 5;
    private static final int ROUTE_COLOR_COLUMN = 6;
    private static final int ROUTE_TEXT_COLOR_COLUMN = 7;

    @Override
    public FeedModel parseTo(String feedInfo) {
        super.parseTo(feedInfo);
        Route route = new Route();
        route.setRouteId(splitFeedInfo[ROUTE_ID_COLUMN]);
        route.setRouteShortName(splitFeedInfo[ROUTE_SHORT_NAME_COLUMN]);
        route.setRouteLongName(splitFeedInfo[ROUTE_LONG_NAME_COLUMN]);
        route.setRouteDesc(splitFeedInfo[ROUTE_DESC_COLUMN]);
        route.setRouteType(splitFeedInfo[ROUTE_TYPE_COLUMN]);
        route.setRouteUrl(splitFeedInfo[ROUTE_URL_COLUMN]);
        route.setRouteColor(splitFeedInfo[ROUTE_COLOR_COLUMN]);
        route.setRouteTextColor(splitFeedInfo[ROUTE_TEXT_COLOR_COLUMN]);
        return route;
    }
}

