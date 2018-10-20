package com.laxmikant.mydaggerapp.mrasAPI;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class MRASListResponse {
    private Result[] result;

    public Result[] getResult() {
        return result;
    }

    public void setResult(Result[] result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ClassPojo [result = " + result + "]";
    }
}