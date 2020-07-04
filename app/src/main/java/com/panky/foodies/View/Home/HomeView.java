package com.panky.foodies.View.Home;

import com.panky.foodies.Model.Categories;
import com.panky.foodies.Model.Meals;

import java.util.List;

public interface HomeView {

    void onShowLoading();
    void onHideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
