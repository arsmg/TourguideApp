package com.example.android.tourguide_app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SitesFragment extends android.support.v4.app.Fragment {

    // Override onCreateView of the fragment - connect it to list-view.xml
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        /*Create list of words to be used in combination with custom class Word.xml and custom
        class...
         */;

        final ArrayList<place> places = new ArrayList<place>();
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));
        places.add(new place(getString(R.string.sight_name), getString(R.string.restaurant1_description),
                R.drawable.sightseeing_image, getString(R.string.restaurant1_address),getString(R.string.open_hours_1)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.sights_tab);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}