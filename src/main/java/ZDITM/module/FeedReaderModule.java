package ZDITM.module;

import ZDITM.core.Reader.AgencyFeedReader;
import ZDITM.core.Reader.FeedReader;
import ZDITM.core.Reader.RouteFeedReader;
import ZDITM.core.model.Agency;
import ZDITM.core.model.Route;
import ZDITM.core.parser.FeedParser;

public class FeedReaderModule {

    private static FeedReader<Agency> agencyFileReader;

    public static  FeedReader<Agency> provideAgrncyFileReader(FeedParser<Agency> parser, FeedParser<Agency> repository){
        if(agencyFileReader == null){
            agencyFileReader = new AgencyFeedReader(parser, repository);
        }
        return agencyFileReader;
    }

    private static FeedReader<Route> routeFeedReader;

    public static  FeedReader<Route> provideRouteFileReader(FeedParser<Route> parser, FeedParser<Route> repository){
        if(routeFileReader == null){
            routeFileReader = new RouteFeedReader(parser, repository);
        }
        return routeFileReader;
    }
}
