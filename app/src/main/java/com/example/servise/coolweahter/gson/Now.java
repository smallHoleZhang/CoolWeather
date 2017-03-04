package com.example.servise.coolweahter.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hasee on 2017/2/14.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
