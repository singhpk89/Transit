package se.jakobkrantz.transit.app.searching;/*
 * Created by krantz on 14-11-30.
 */


public interface OnDetailedJourneySelectedListener {

    public void onJourneySelected(String fromStationId, String toStationId, String depDate, String depTime);

}
