package com.example.dinesh.androidtomysql;

import android.graphics.Bitmap;

/**
 * Created by dinesh on 03-11-2017.
 */

public class SelectUser {
    String name;

    String email;
    Boolean checkbox=false;
    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(Boolean checkbox) {
        this.checkbox = checkbox;
    }
}
