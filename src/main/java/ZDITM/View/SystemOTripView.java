package ZDITM.View;

import ZDITM.Controller.TripController;
import ZDITM.core.model.Trip;

import java.util.List;
import java.util.Scanner;

public class SystemOTripView implements TripView{

    private final Scanner scanner;
    private TripController tripController;

    public SystemOTripView(){ this.scanner = new Scanner(System.in);}


    @Override
    public void loadPage() {
        int choice;
        while (true){
            displayMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    loadTrips();
                    break;
                case 2:
                    showAllTrip();
                    break;
                case 3:
                    findTrip();
                    break;
                default:
            }
        }

    }

    @Override
    public void setController(TripController tripcontroller) {
        this.tripController = tripcontroller;
    }

    private void displayMenu(){
        System.out.println("Don't Trip to much hommie");
        System.out.println("1. Load trip files");
        System.out.println("2. Show all trips");
        System.out.println("3. Find trips:");
    }

    private void showAllTrip(){
        List<Trip> tripList = tripController.getAllTrips();
        displayTrips(tripList);
    }

    private void findTrip(){
        String routeId = scanner.next();
        List<Trip> foundTripList = tripController.findTtripByRouteId(routeId);
        displayTrips (foundTripList);
    }
    private void displayTrips(List<Trip> trips){
        for (Trip trip : trips){
            System.out.println(trip);
        }
    }

    private void loadTrips(){
        tripController.load();
    }






}
