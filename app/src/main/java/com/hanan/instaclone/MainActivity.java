package com.hanan.instaclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticlesAdapter adapter;
    List<Article> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=getArticlesData();
        adapter=new ArticlesAdapter(this,data);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private List<Article> getArticlesData() {
        List<Article> articles=new ArrayList<>();
        Article article=new Article(
                "Instagram",
                "Abdul Hanan",
                "FEB 10, 2024",
                "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image1
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                "Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);
        article=new Article(
                "Instagram and Facebook",
                " Abdul Hanan",
                "FEB 21, 2024",
                "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                R.drawable.image2
        );
        articles.add(article);


        return articles;
    }
}