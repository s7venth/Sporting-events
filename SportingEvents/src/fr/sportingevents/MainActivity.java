package fr.sportingevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Button btn_connexion;
	EditText champ_login,champ_mdp;
	
	// ----------------- DEBUT onCreate ----------------------- //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addOnclickListner();
        
        champ_login = (EditText) findViewById(R.id.login);
        champ_mdp = (EditText) findViewById(R.id.mdp);
        
        /* Description : Permet de changer la forme du champ quand il est selectionné 
         * cible : EditText Login et mot de passe
         */
        champ_login.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				champ_login.setBackgroundResource(R.drawable.champ_login_pressed);
				champ_mdp.setBackgroundResource(R.drawable.rightroundborder);
				return false;
			}
        });
        
        /* Description : Permet de changer la forme du champ quand il est selectionné 
         * cible : EditText Login et mot de passe
         */
        champ_mdp.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				champ_mdp.setBackgroundResource(R.drawable.champ_login_pressed);
				champ_login.setBackgroundResource(R.drawable.rightroundborder);
				return false;
			}
		});
        
    }
    // ----------------- FIN onCreate ----------------------- //

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	private void addOnclickListner() {
		
		this.btn_connexion = (Button) findViewById(R.id.btn_connexion);
		this.btn_connexion.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Connexion...", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(MainActivity.this, Home_activity.class);
				startActivity(intent);
			}
		});
	}
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
