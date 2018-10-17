package com.example.ukrida.gmail_clone.network;

import java.util.List;

import com.example.ukrida.gmail_clone.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface
{
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
