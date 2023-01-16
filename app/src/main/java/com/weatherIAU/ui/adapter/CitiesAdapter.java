package com.weatherIAU.ui.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.weatherIAU.ui.CityRequester;
import com.weatherIAU.ui.R;
import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.MyViewHolder>
{
    private final List<String> allCities;
    private int idSelected = 0;

    public CitiesAdapter(List<String> array)
    {
        this.allCities = array;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {

        private final TextView city_name;

        @SuppressLint("ClickableViewAccessibility")
        public MyViewHolder(final View view)
        {
            super(view);
            city_name = view.findViewById(R.id.city_name);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cities_recycler_adapter, parent, false);
        return new MyViewHolder(itemView);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        String invoices_id = allCities.get(position);
        holder.city_name.setText(invoices_id);
        holder.city_name.setOnClickListener(view ->
        {
            CityRequester.CITY = allCities.get(position) + ",tr";
            Intent intent = new Intent(holder.itemView.getContext(), CityRequester.class);
            ((Activity) holder.itemView.getContext()).startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return allCities.size();
    }
}

