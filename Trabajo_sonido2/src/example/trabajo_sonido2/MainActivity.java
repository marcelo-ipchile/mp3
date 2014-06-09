package example.trabajo_sonido2;



import android.app.Activity; 
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle; 

import android.view.Menu;
import android.view.View; 
import android.widget.Button; 







public class MainActivity extends Activity { // hola
	
	


	
	MediaPlayer mp;
	Button btnplay; // como estas
	int pos=0;
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
				
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnplay = (Button) findViewById(R.id.play);


		

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.

		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void destruir(){
		
		if(mp != null){
			mp.release();
		}
	}
	

	
	public void play(View v){
		
		   
			if(mp !=null && mp.isPlaying()){
		
		destruir();
			mp=MediaPlayer.create(this,R.raw.tv);
			mp.start();
	
		
	
		
			
			
			


	
			mp.seekTo(pos);
				

				if(pos==19){
					

					Intent i = new Intent (this  , pregunta1.class);
					 
			    	startActivity(i);
				
				}
				
				
				if(pos==40){
					
					Intent i = new Intent (this  , pregunta2.class);
				    	
				    	startActivity(i);
					}
					

					if (pos==50){
						
					Intent i = new Intent (this  , pregunta3.class);
					
					startActivity(i);

					}

					if (pos==60){
						
					Intent i = new Intent (this  , pregunta4.class);
					
					startActivity(i);
					}


					if (pos==70){
						
					Intent i = new Intent (this  , pregunta5.class);
					
					startActivity(i);
					}


					if (pos==80){
					
					Intent i = new Intent (this  , pregunta6.class);
					
					startActivity(i);
					}


					if (pos==90){
						
					Intent i = new Intent (this  , pregunta7.class);
					
					startActivity(i);
					}
					
					
				
			}
	}
		
		
			
	 
	


	
		


	

	

	

public void pausar(){
	
	if(mp !=null && mp.isPlaying()){
	pos=mp.getCurrentPosition();
	mp.pause();
	
	}
}
	
	
	
	public void continuar(){
		
		if(mp !=null && mp.isPlaying()==false){
		
		mp.seekTo(pos);
		mp.start();
		
			
		
	}
	}
		
		public void parar(){
			
			if(mp !=null ){
			
			mp.stop();
			pos=0;
			}
				
			
		
	
}
		
	
			
			
			
		
	
	
}