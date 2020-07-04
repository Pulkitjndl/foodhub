package com.panky.foodies.RESTapi;

import com.panky.foodies.Model.Categories;
import com.panky.foodies.Model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodApi {

    /*This is all are request of GET */
    @GET("latest.php")
    Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();

    @GET("filter.php")
    Call<Meals> getMealsByCategory(@Query("c") String category);
}
