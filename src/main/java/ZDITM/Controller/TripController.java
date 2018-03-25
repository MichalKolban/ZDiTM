package ZDITM.Controller;

import ZDITM.View.TripView;
import ZDITM.core.model.Trip;
import ZDITM.core.service.TripAPI;

import java.util.List;

public class TripController {

    private final TripAPI tripAPI;
    private final TripView tripView;

    public TripController(TripAPI tripAPI, TripView tripView){
        this.tripAPI = tripAPI;
        this.tripView = tripView;
        this.tripView.setController(this);
    }
    public void load(){tripAPI.loadTrips();}

    public List<Trip> getAllTrips(){
        return tripAPI.getAllTrips();
    }
    public List<Trip> findTtripByRouteId(String routeId){ return tripAPI.findTripByRouteId(routeId);}

}
