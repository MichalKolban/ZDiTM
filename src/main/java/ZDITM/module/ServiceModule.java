package ZDITM.module;

import ZDITM.core.Reader.FeedReader;
import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Trip;
import ZDITM.core.service.TripAPI;
import ZDITM.core.service.TripService;

public class ServiceModule {

    private static TripAPI tripService;

    public static TripAPI provideTripService(FeedRepository<Trip> feedRepository, FeedReader<Trip> tripFeedReader) {
        if (tripService == null) {
            tripService = new TripService(feedRepository, tripFeedReader);
        }
        return tripService;
    }
}