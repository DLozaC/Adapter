package mx.edu.utng.dloza.ejercicioadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button btnTurkey;
    Button btnDuck;
    Button btnTurkeyAdapter;
    MallardDuck duck;
    WildTurkey turkey;
    Duck turkeyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTurkey=(Button)findViewById(R.id.btn_turkey);
        btnDuck=(Button)findViewById(R.id.btn_duck);
        btnTurkeyAdapter=(Button)findViewById(R.id.btn_turkey_adapter);

        btnTurkey.setOnClickListener(this);//para que se registre en el escuchador de esta clase
        btnDuck.setOnClickListener(this);
        btnTurkeyAdapter.setOnClickListener(this);

        duck= new MallardDuck();
        turkey= new WildTurkey();
        turkeyAdapter = new  TurkeyAdapter(turkey);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_duck:
                Toast.makeText(getApplicationContext(),duck.quack()+"\n"+duck.fly(),
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_turkey:
                Toast.makeText(getApplicationContext(),turkey.gobble()+"\n"+turkey.fly(),
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_turkey_adapter:
                Toast.makeText(getApplicationContext(),turkeyAdapter.quack()+"\n"+turkey.fly(),
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
