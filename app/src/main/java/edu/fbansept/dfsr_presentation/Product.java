package edu.fbansept.dfsr_presentation;

import org.json.JSONException;
import org.json.JSONObject;

public class Product {
    private Integer anime_id;
    private String anime_name;
    private String anime_img;

    public Product(Integer anime_id, String anime_name, String anime_img) {
        this.anime_id = anime_id;
        this.anime_name = anime_name;
        this.anime_img = anime_img;
    }

    public Integer getAnime_id() {
        return anime_id;
    }

    public void setAnime_id(Integer anime_id) {
        this.anime_id = anime_id;
    }

    public String getAnime_name() {
        return anime_name;
    }

    public void setAnime_name(String anime_name) {
        this.anime_name = anime_name;
    }

    public String getAnime_img() {
        return anime_img;
    }

    public void setAnime_img(String anime_img) {
        this.anime_img = anime_img;
    }

    public Product(JSONObject json) {

        try {
            this.anime_id = json.getInt("anime_id");
            this.anime_name = json.getString("anime_name");
            this.anime_img = json.getString("anime_img");
        } catch (JSONException e) {
            e.printStackTrace();
            this.anime_id = 0;
            this.anime_name = "";
            this.anime_img = "";
        }
    }
}
