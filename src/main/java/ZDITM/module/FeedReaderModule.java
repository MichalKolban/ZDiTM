package ZDITM.module;

import ZDITM.core.Reader.AgencyFeedReader;
import ZDITM.core.Reader.FeedReader;
import ZDITM.core.Reader.RouteFeedReader;
import ZDITM.core.Reader.TripFeedReader;
import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Agency;
import ZDITM.core.model.Route;
import ZDITM.core.model.Trip;
import ZDITM.core.parser.FeedParser;

public class FeedReaderModule {

    private static FeedReader<Agency> agencyFileReader;
    private static FeedReader<Route> routeFileReader;
    private static FeedReader<Trip> tripFilerReader;

    public static  FeedReader<Agency> provideAgrncyFileReader(FeedParser<Agency> parser, FeedRepository<Agency> repository){
        if(agencyFileReader == null){
            agencyFileReader = new AgencyFeedReader(parser, repository);
        }
        return agencyFileReader;
    }

    public static  FeedReader<Route> provideRouteFileReader(FeedParser<Route> parser, FeedRepository<Route> repository){
        if(routeFileReader == null){
            routeFileReader = new RouteFeedReader(parser, repository);
        }
        return routeFileReader;
    }

    public static FeedReader<Trip> provideTripFileReader(FeedParser<Trip> parser, FeedRepository<Trip> repository){
        if(tripFilerReader == null){
            tripFilerReader = new TripFeedReader(parser, repository);
        }
        return tripFilerReader;
    }
}
