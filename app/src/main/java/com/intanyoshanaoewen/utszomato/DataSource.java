package com.intanyoshanaoewen.utszomato;

import com.intanyoshanaoewen.utszomato.Model.Categories;
import com.intanyoshanaoewen.utszomato.Model.Restaurants;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Categories> createListCategories() {
        List<Categories> categories = new ArrayList<>();
        categories.add(new Categories(
                "Trending This Week",
                "30 Places, 15119 Saves",
                "Most popular restaurants in town this week",
                "https://cdn.moneysmart.id/wp-content/uploads/2018/12/08181221/Makanan-ini-paling-pas-disantap-saat-musim-hujan-turun-700x497.jpg"
        ));
        categories.add(new Categories(
                "Best Places for Buka Puasa",
                "70 Places, 7 Saves",
                "Gather around with your loved ones in these best places for buka puasa",
                "https://cdn.idntimes.com/content-images/post/20171218/openrice-62a2451c4c897b7f53367007651525c2_600x400.jpg"
        ));
        categories.add(new Categories(
                "Jakarta's Finest",
                "243 Places, 1396 Saves",
                "The hunt for the highest-rated restaurants in your city ends here",
                "https://s.republika.co.id/uploads/images/inpicture_slide/makanan-italia-piza-merupakan-makanan-italia-yang-ada-di-_190313085617-433.jpg"
        ));
        categories.add(new Categories(
                "Newly Opened",
                "25 Places, 9751 Saves",
                "The best new places in town",
                "https://cdn.moneysmart.id/wp-content/uploads/2018/12/08181221/Makanan-ini-paling-pas-disantap-saat-musim-hujan-turun-700x497.jpg"
        ));
        categories.add(new Categories(
                "Enjoy Ramadan with BCA",
                "632 Places, 11 Saves",
                "Experience the finest Buka Puasa moments with BCA Debit/Credit",
                "https://cdn.idntimes.com/content-images/post/20171218/openrice-62a2451c4c897b7f53367007651525c2_600x400.jpg"
        ));
        categories.add(new Categories(
                "Frozen Delights",
                "126 Places, 1130 Saves",
                "Chase your next brain freeze with these refreshing delicious frozen desserts",
                "https://s.republika.co.id/uploads/images/inpicture_slide/makanan-italia-piza-merupakan-makanan-italia-yang-ada-di-_190313085617-433.jpg"
        ));
        return categories;
    }

    public static List<Restaurants> createRestaurantsList(){
        List<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants(
                "Kayu Manis Restaurant",
                "Setiabudi, Jakarta",
                "Casual Dining - Asian, Western, Italian",
                "Rp300.000 for two (approx.)",
                "3.6",
                "Opens at 10am",
                "https://www.julieslifestyle.com/src/Frontend/Files/blog/images/968x560/mushroom-avocado-sushi-rolls-vegan-gluten-free-inspiration-anett-velsberg-en-662.jpg"
        ));
        restaurants.add(new Restaurants(
                "Abunawas",
                "Kemang, Jakarta",
                "Casual Dining - Middle Eastern",
                "Rp250.000 for two (approx.)",
                "4.2",
                "Opens at 10am",
                "http://www.savorcalifornia.com/images/home_food_04.jpg"
        ));
        restaurants.add(new Restaurants(
                "Infinite Cafe",
                "Kuningan, Jakarta",
                "Coffee - Indonesian",
                "Rp220.000 for two (approx.)",
                "3.5",
                "Opens at 7am",
                "https://cdn.vox-cdn.com/thumbor/C_d6_k2nBdHdrhh1UrFwAXKKP2c=/0x0:2000x1335/1200x900/filters:focal(963x482:1283x802)/cdn.vox-cdn.com/uploads/chorus_image/image/56240539/2018_05_07_NoreeThai_025.1502992730.jpg"
        ));

        restaurants.add(new Restaurants(
                "Ayam Kriwil",
                "Rawamangun, Jakarta",
                "Quick Bites - Indonesian",
                "Rp120.000 for two (approx.)",
                "3.9",
                "Opens at 9am",
                "https://media-cdn.tripadvisor.com/media/photo-s/15/c5/a4/14/pepperoni-lovers.jpg"
        ));
        restaurants.add(new Restaurants(
                "Mie Alip",
                "Pecenongan, Jakarta",
                "Bakmi, Bakso",
                "Rp80.000 for two (approx.)",
                "4.0",
                "Opens at 4pm",
                "https://www.julieslifestyle.com/src/Frontend/Files/blog/images/968x560/mushroom-avocado-sushi-rolls-vegan-gluten-free-inspiration-anett-velsberg-en-662.jpg"
        ));
        restaurants.add(new Restaurants(
                "Larazeta Restaurant",
                "Tebet, Jakarta",
                "Casual Dining - Arabian, Middle Eastern",
                "Rp280.000 for two (approx.)",
                "4.0",
                "Opens at 10am",
                "http://www.savorcalifornia.com/images/home_food_04.jpg"
        ));
        restaurants.add(new Restaurants(
                "Eastern Opulence",
                "Dharmawangsa, Jakarta",
                "Fine Dining - Intan",
                "Rp650.000 for two (approx.)",
                "4.5",
                "Opens at 10am",
                "https://cdn.vox-cdn.com/thumbor/C_d6_k2nBdHdrhh1UrFwAXKKP2c=/0x0:2000x1335/1200x900/filters:focal(963x482:1283x802)/cdn.vox-cdn.com/uploads/chorus_image/image/56240539/2018_05_07_NoreeThai_025.1502992730.jpg"
        ));
        restaurants.add(new Restaurants(
                "En Japanese Dining",
                "Senayan, Jakarta",
                "Fine Dining - Japanese",
                "Rp600.000 for two (approx.)",
                "4.1",
                "Opens at 11am",
                "https://media-cdn.tripadvisor.com/media/photo-s/15/c5/a4/14/pepperoni-lovers.jpg"
        ));
        return restaurants;
    }
}
