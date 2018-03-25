package ZDITM;

import ZDITM.Controller.TripController;
import ZDITM.View.SystemOTripView;
import ZDITM.View.TripView;
import ZDITM.core.Reader.FeedReader;
import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Trip;
import ZDITM.core.parser.FeedParser;
import ZDITM.core.service.TripAPI;
import ZDITM.module.FeedReaderModule;
import ZDITM.module.ParserModule;
import ZDITM.module.RepositoryModule;
import ZDITM.module.ServiceModule;


public class App 
{
    public static void main( String[] args ){
        FeedParser<Trip> tripParser = ParserModule.provideTripParser();
        FeedRepository<Trip> tripRepository = RepositoryModule.provideTripRepository();
        FeedReader<Trip> tripFeedReader = FeedReaderModule.provideTripFileReader(tripParser, tripRepository);
        TripAPI tripService = ServiceModule.provideTripService(tripRepository, tripFeedReader);
        TripView tripView = new SystemOTripView();
        TripController tripController = new TripController(tripService, tripView);
        tripView.setController(tripController);
        tripView.loadPage();
    }

}
