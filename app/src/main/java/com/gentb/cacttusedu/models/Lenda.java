package com.gentb.cacttusedu.models;

import org.json.JSONObject;

/**
 * Created by gentberani on 12/18/17.
 */

public class Lenda {
    private final String id;
    private final String titulli;
    private final String profesori;

    public Lenda(JSONObject jsonObject) {
        this.id = jsonObject.optString("id", "0");
        this.titulli = jsonObject.optString("titulli", "");
        this.profesori = jsonObject.optString("profesori", "");
    }

    public String getId() {
        return id;
    }

    public String getTitulli() {
        return titulli;
    }

    public String getProfesori() {
        return profesori;
    }
}