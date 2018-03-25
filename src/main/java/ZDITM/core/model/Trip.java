package ZDITM.core.model;

import ZDITM.Utils.TextUtils;

public class Trip extends FeedModel {

    private String routeId;
    private String serviceId;
    private String tripId;
    private String tripHeadsign;
    private String directionId;
    private String blockId;
    private String shapeId;
    private String wheelchairAccessible;
    private String lowFloor;

    public Trip(){ super(TextUtils.EMPTY_STRING);}

    public Trip(String routeId, String serviceId, String tripId, String tripHeadsign, String directionId, String blockId, String shapeId, String wheelchairAccessible, String lowFloor){
        super(routeId);
        this.routeId = routeId;
        this.serviceId = serviceId;
        this.tripId = tripId;
        this.tripHeadsign = tripHeadsign;
        this.directionId = directionId;
        this.blockId = blockId;
        this.shapeId = shapeId;
        this.wheelchairAccessible = wheelchairAccessible;
        this.lowFloor = lowFloor;

    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }

    public String getDirectionId() {
        return directionId;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public String getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public void setWheelchairAccessible(String wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }

    public String getLowFloor() {
        return lowFloor;
    }

    public void setLowFloor(String lowFloor) {
        this.lowFloor = lowFloor;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "routeId='" + routeId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", tripId='" + tripId + '\'' +
                ", tripHeadsign='" + tripHeadsign + '\'' +
                ", directionId='" + directionId + '\'' +
                ", blockId='" + blockId + '\'' +
                ", shapeId='" + shapeId + '\'' +
                ", wheelchairAccessible='" + wheelchairAccessible + '\'' +
                ", lowFloor='" + lowFloor + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
