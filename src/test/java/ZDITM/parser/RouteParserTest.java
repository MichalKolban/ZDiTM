package ZDITM.parser;

import ZDITM.model.Route;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RouteParserTest {

    private static final String TEST_LINE = "route_id,route_short_name,route_long_name,route_desc,route_type,route_url,route_color,route_text_color";
    private FeedParser<Route> routeParser;
    private Route route;

    @Before
    public void setUp() throws Exception{
        routeParser = new RouteParser();
        route = new Route("route_id","route_short_name","route_long_name","route_desc","route_type","route_url","route_color","route_text_color");
    }

    @Test
    public  void testParseRoute(){
        //given
        Route testRoute;

        //when
        testRoute = routeParser.parseTo(TEST_LINE);

        //then
        assertEquals(testRoute.getRouteId(),route.getRouteId());
        assertEquals(testRoute.getRouteShortName(),route.getRouteShortName());
        assertEquals(testRoute.getRouteLongName(),route.getRouteLongName());
        assertEquals(testRoute.getRouteDesc(),route.getRouteDesc());
        assertEquals(testRoute.getRouteType(),route.getRouteType());
        assertEquals(testRoute.getRouteUrl(),route.getRouteUrl());
        assertEquals(testRoute.getRouteColor(),route.getRouteColor());
        assertEquals(testRoute.getRouteTextColor(),route.getRouteTextColor());
    }

}