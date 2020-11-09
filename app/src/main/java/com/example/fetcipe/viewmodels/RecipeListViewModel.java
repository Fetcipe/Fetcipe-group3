package com.example.fetcipe.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.fetcipe.models.Recipe;

import java.util.List;

public class RecipeListViewModel extends ViewModel {

    private MutableLiveData<List<Recipe>> mRecipes=new MutableLiveData<>();

    public RecipeListViewModel() {
    }
    public LiveData<List<Recipe>> getRecipes(){
        return mRecipes;
    }
}
