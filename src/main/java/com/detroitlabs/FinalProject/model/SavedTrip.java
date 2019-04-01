package com.detroitlabs.FinalProject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="savedtrips")
public class SavedTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="tripid")
    private long tripid;

    @Column(name="userid")
    private long userid;

    @NotNull
    @Column(name="start")
    private String start;

    @NotNull
    @Column(name="end")
    private String end;

    @Column(name="waypoints")
    private String waypoints;

    public SavedTrip() { }

    public SavedTrip(long userid, String start, String end) {
        this.userid = userid;
        this.start = start;
        this.end = end;
    }

    public SavedTrip(long userid, String start, String end, String waypoints) {
        this.userid = userid;
        this.start = start;
        this.end = end;
        this.waypoints = waypoints;
    }


    public long getTripid() {
        return tripid;
    }

    public void setTripid(long tripid) {
        this.tripid = tripid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(String waypoints) {
        this.waypoints = waypoints;
    }
}

