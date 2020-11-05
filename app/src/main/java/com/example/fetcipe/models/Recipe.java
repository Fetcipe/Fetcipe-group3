package com.example.fetcipe.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;

public class Recipe implements Parcelable {
    private  String title;
    private int id;
    private String sourceName;
    private String[] extendedIngredients;
    private int aggregateLikes;
    private boolean vegetarian;
    private float spoonacularScore;
    private String image;
    private float calories;



    public Recipe(String title, int id, String sourceName,
                  String[] extendedIngredients, int aggregateLikes,
                  boolean vegetarian, float spoonacularScore,
                  String image, float calories) {
        this.title = title;
        this.id = id;
        this.sourceName = sourceName;
        this.extendedIngredients = extendedIngredients;
        this.aggregateLikes = aggregateLikes;
        this.vegetarian = vegetarian;
        this.spoonacularScore = spoonacularScore;
        this.image = image;
        this.calories = calories;

    }


    public Recipe() {
    }

    protected Recipe(Parcel in) {
        title = in.readString();
        id = in.readInt();
        sourceName = in.readString();
        extendedIngredients = in.createStringArray();
        aggregateLikes = in.readInt();
        vegetarian = in.readByte() != 0;
        spoonacularScore = in.readFloat();
        image = in.readString();
        calories = in.readFloat();
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String[] getExtendedIngredients() {
        return extendedIngredients;
    }

    public void setExtendedIngredients(String[] extendedIngredients) {
        this.extendedIngredients = extendedIngredients;
    }

    public int getAggregateLikes() {
        return aggregateLikes;
    }

    public void setAggregateLikes(int aggregateLikes) {
        this.aggregateLikes = aggregateLikes;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public float getSpoonacularScore() {
        return spoonacularScore;
    }

    public void setSpoonacularScore(float spoonacularScore) {
        this.spoonacularScore = spoonacularScore;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", sourceName='" + sourceName + '\'' +
                ", extendedIngredients=" + Arrays.toString(extendedIngredients) +
                ", aggregateLikes=" + aggregateLikes +
                ", vegetarian=" + vegetarian +
                ", spoonacularScore=" + spoonacularScore +
                ", image='" + image + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeInt(id);
        parcel.writeString(sourceName);
        parcel.writeStringArray(extendedIngredients);
        parcel.writeInt(aggregateLikes);
        parcel.writeByte((byte) (vegetarian ? 1 : 0));
        parcel.writeFloat(spoonacularScore);
        parcel.writeString(image);
        parcel.writeFloat(calories);
    }
}
