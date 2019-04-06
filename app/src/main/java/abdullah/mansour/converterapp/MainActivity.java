package abdullah.mansour.converterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;

public class MainActivity extends AppCompatActivity
{
    MaterialRippleLayout currency_mrl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currency_mrl = findViewById(R.id.currency_mrl);

        currency_mrl.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CurrencyActivity.class);
                startActivity(intent);
            }
        });
    }
}
