package ZDITM.core.service;

import ZDITM.core.Reader.FeedReader;
import ZDITM.core.Repository.FeedRepository;
import ZDITM.core.model.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripService implements TripAPI{

    private final FeedRepository<Trip> tripFeedRepository;
    private final FeedReader<Trip> feedReader;

    public TripService(FeedRepository<Trip> tripFeedRepository, FeedReader<Trip> feedReader){
        this.feedReader = feedReader;
        this.tripFeedRepository = tripFeedRepository;
    }

    @Override
    public void loadTrips() {feedReader.read();

    }

    @Override
    public List<Trip> findTripByRouteId(String routeId) {
        List<Trip> routeTrips = new ArrayList<>();
        for (Trip trip : tripFeedRepository.getAll()){
            if (trip.getRouteId().equals(routeId)){
                routeTrips.add(trip);
            }
        }
        return routeTrips;
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripFeedRepository.getAll();
    }

    @Override
    public List<Trip> findTripByHeadSign(String headSign) {
        List<Trip> routeTrips = new ArrayList<>();
        for (Trip trip : tripFeedRepository.getAll()){
            if (trip.getTripHeadsign().equals(headSign)){
                routeTrips.add(trip);
            }
        }

        return routeTrips;
    }

    @Override
    public List<Trip> findTripByRouteIdAndHeadSign(String routeId, String HeadSign) {
        List<Trip> routeTrips = new ArrayList<>();
        for (Trip trip : tripFeedRepository.getAll()){
            if (trip.getRouteId().equals(routeId) && trip.getTripHeadsign().equals(HeadSign)){
                routeTrips.add(trip);
            }
        }
        return routeTrips;
    }


}
