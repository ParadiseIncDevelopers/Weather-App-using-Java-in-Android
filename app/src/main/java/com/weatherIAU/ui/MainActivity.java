package com.weatherIAU.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.weatherIAU.ui.adapter.CitiesAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView citiesRecyclerView;
    private CitiesAdapter adapter;

    public static List<String> cities = Arrays.asList("Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara",
            "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik",
            "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ",
            "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
            "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul",
            "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir",
            "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş",
            "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
            "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas, Tekirdağ",
            "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat",
            "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman",
            "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
            "Kilis", "Osmaniye", "Düzce");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesRecyclerView = findViewById(R.id.citiesRecyclerView);

        adapter = new CitiesAdapter(cities);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        citiesRecyclerView.setLayoutManager(manager);
        citiesRecyclerView.setAdapter(adapter);
    }
}
