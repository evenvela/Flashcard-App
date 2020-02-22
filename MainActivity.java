package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.answer1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("1"))
                    ((TextView) findViewById(R.id.answer1)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                else
                    ((TextView) findViewById(R.id.answer1)).setBackgroundColor(getResources().getColor(R.color.colorAccent));

                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("2"))
                    ((TextView) findViewById(R.id.answer2)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("3"))
                    ((TextView) findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

            }
        });


        findViewById(R.id.answer2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("1"))
                    ((TextView) findViewById(R.id.answer1)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("2"))
                    ((TextView) findViewById(R.id.answer2)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                else
                    ((TextView) findViewById(R.id.answer2)).setBackgroundColor(getResources().getColor(R.color.colorAccent));

                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("3"))
                    ((TextView) findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

            }
        });
        findViewById(R.id.answer3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("1"))
                    ((TextView) findViewById(R.id.answer1)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("2"))
                    ((TextView) findViewById(R.id.answer2)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                if(((TextView)findViewById(R.id.flashcard_question)).getTag().equals("3"))
                    ((TextView) findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                else
                    ((TextView) findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.colorAccent));

            }
        });
    }

}
