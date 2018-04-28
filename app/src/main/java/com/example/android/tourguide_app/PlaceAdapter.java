package com.example.android.tourguide_app;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter<W> extends ArrayAdapter<place> {

    private int mBackgoundIdColor;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param places A List of AndroidFlavor objects to display in a list
     */
    public PlaceAdapter(Activity context, ArrayList<place> places, int backgoundIdColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
        mBackgoundIdColor = backgoundIdColor;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link Word} object located at this position in the list
        place currentPlace;
        currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationName= (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentPlace.getmPlaceName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView locationDescription = (TextView) listItemView.findViewById(R.id.location_description);
        locationDescription.setText(currentPlace.getmLocationDesctiption());

        // Find the ImageView in the list_item.xml layout with the ID version_number
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getmImageId());

        TextView locationAdrress = (TextView) listItemView.findViewById(R.id.locations_location);
        locationAdrress.setText(currentPlace.getmLocationAddress());

        TextView openHours = (TextView) listItemView.findViewById(R.id.open_hours);
        openHours.setText(currentPlace.getmOpenHours());

        View textContainer = listItemView.findViewById(R.id.list_container);
        int color = ContextCompat.getColor(getContext(),mBackgoundIdColor);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
