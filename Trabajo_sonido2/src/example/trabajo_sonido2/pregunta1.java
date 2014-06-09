package example.trabajo_sonido2;




import android.app.Activity;


import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import android.widget.RadioButton;

import android.widget.Toast;


public class pregunta1 extends Activity {

	private RadioButton r1, r2, r3;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pregunta1);
		
		r1=(RadioButton)findViewById(R.id.r1);
		r2=(RadioButton)findViewById(R.id.r2);
		r3=(RadioButton)findViewById(R.id.r3);
		
		
	
		
	}
	
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void aceptar(View v){
		
	
		
	
		
		   if (r1.isChecked()==true) {
			   
			   
			   MainActivity m= new MainActivity();
			   m.continuar();
		
		
			  Toast.makeText(this, "respuesta correcta",Toast.LENGTH_SHORT).show();
			  finish();
		   }
		
	
	
	if (r2.isChecked()==true) {
	
		  MainActivity m= new MainActivity();
		   m.parar();
		  Toast.makeText(this, "respuesta incorrecta",Toast.LENGTH_SHORT).show();
		  finish();
	   }
	if (r3.isChecked()==true) {
		  MainActivity m= new MainActivity();
		   m.parar();
		  Toast.makeText(this, "respuesta incorrecta",Toast.LENGTH_SHORT).show();
		  finish();

	   }

}
}
