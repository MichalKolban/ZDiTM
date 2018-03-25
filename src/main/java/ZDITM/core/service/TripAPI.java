package ZDITM.core.service;

import ZDITM.core.model.Trip;

import java.util.List;

public interface TripAPI {

    void loadTrips();

    List<Trip> findTripByRouteId(String routeId);

    List<Trip> getAllTrips();

    List<Trip> findTripByHeadSign(String headSign);

    List<Trip> findTripByRouteIdAndHeadSign(String routeId, String HeadSign);
}
