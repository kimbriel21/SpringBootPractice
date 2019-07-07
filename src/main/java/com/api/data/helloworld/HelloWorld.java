package com.api.data.helloworld;

import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloWorld {

    String repos;

    @GetMapping("/hello_world")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/get_repos")
    public String getAllRepos(){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/users/kimbriel21/repos")
                .header("Accept", "application/vnd.github.nightshade-preview.v3+json")
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                repos = response.body().string();
            }
        });

        return repos;
    }
}
