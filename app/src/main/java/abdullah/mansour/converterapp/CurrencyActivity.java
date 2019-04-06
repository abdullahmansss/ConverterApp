package abdullah.mansour.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity
{
    EditText currency_field;
    TextView currency_txt;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        currency_field = findViewById(R.id.currency_field);
        currency_txt = findViewById(R.id.currency_txt);
        imageView = findViewById(R.id.image);

        currency_field.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                String currency = s.toString().trim();

                if (currency.length() != 0)
                {
                    if (currency.length() >= 3)
                    {
                        imageView.setImageResource(R.drawable.milometer);
                    }
                    double c = Double.parseDouble(currency);
                    double r = c * 18;
                    currency_txt.setText(r + " L.E");
                } else
                    {
                        currency_txt.setText("Currency in EGP");
                        imageView.setImageResource(R.drawable.coins);
                    }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
}
