package com.openclassrooms.tourguide.model;


public class NearestAttraction {

    public String attrationName;
    public double attractionLatitude;
    public double attractionLongitude;
    public double userLocationLatitude;
    public double userLocationLongitude;
    public double distanceFromAttraction;
    public int rewardPoints;

    public NearestAttraction(String attrationName, double attractionLatitude, double attractionLongitude, double userLocationLatitude, double userLocationLongitude, double distanceFromAttraction, int rewardPoints) {
        this.attrationName = attrationName;
        this.attractionLatitude = attractionLatitude;
        this.attractionLongitude = attractionLongitude;
        this.userLocationLatitude = userLocationLatitude;
        this.userLocationLongitude = userLocationLongitude;
        this.distanceFromAttraction = distanceFromAttraction;
        this.rewardPoints = rewardPoints;
    }

    public String getAttrationName() {
        return attrationName;
    }

    public void setAttrationName(String attracionName) {
        this.attrationName = attracionName;
    }

    public double getAttractionLatitude() {
        return attractionLatitude;
    }

    public void setAttractionLatitude(double attractionLatitude) {
        this.attractionLatitude = attractionLatitude;
    }

    public double getAttractionLongitude() {
        return attractionLongitude;
    }

    public void setAttractionLongitude(double attractionLongitude) {
        this.attractionLongitude = attractionLongitude;
    }

    public double getUserLocationLatitude() {
        return userLocationLatitude;
    }

    public void setUserLocationLatitude(double userLocationLatitude) {
        this.userLocationLatitude = userLocationLatitude;
    }

    public double getUserLocationLongitude() {
        return userLocationLongitude;
    }

    public void setUserLocationLongitude(double userLocationLongitude) {
        this.userLocationLongitude = userLocationLongitude;
    }

    public double getDistanceFromAttraction() {
        return distanceFromAttraction;
    }

    public void setDistanceFromAttraction(double distanceFromAttraction) {
        this.distanceFromAttraction = distanceFromAttraction;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int userRewardPoints) {
        rewardPoints = userRewardPoints;
    }
}
