package com.example.android.tourguide_app;

public class place {

    /**
     * Name of the place
     */
    private String mPlaceName;

    /**
     * Description of the
     */
    private String mLocationDescription;

    /**
     * Image resource ID for the com.example.android.tourguide_app.location
     */
    private int mImageId;

    /**
     * Address of the given com.example.android.tourguide_app.location
     */
    private String mLocationAddress;

    private String mOpenHours;

    /**
     * +     * Create a new Location object.
     */
    public place(String placeName, String locationDesctiption, int imageId, String locationAddress, String openHours) {
        mPlaceName = placeName;
        mLocationDescription = locationDesctiption;
        mImageId = imageId;
        mLocationAddress = locationAddress;
        mOpenHours = openHours;
    }

    /**
     * +     * Get the com.example.android.tourguide_app.location's name
     * +
     */
    public String getmPlaceName() {
        return mPlaceName;
    }

    /**
     * +     * Get the com.example.android.tourguide_app.location's description.
     * +
     */
    public String getmLocationDesctiption() {
        return mLocationDescription;
    }

    /**
     * +     * Get the related image of the place.
     * +
     */
    public int getmImageId() {
        return mImageId;
    }

    /**
     * +     * Get the adress of the place.
     * +
     */
    public String getmLocationAddress() {
        return mLocationAddress;
    }

    /**
     * +     * Get the worktime of the place.
     * +
     */
    public String getmOpenHours() {
        return mOpenHours;
    }
}
