package Ventana;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import Interfas.FromInterface;

public class Jframe extends Frame implements FromInterface{
	
private static final long serialVersionUID = 1L;

private Frame Ventana;


public void Iniciar_Controladores() {
	ventana();
   //Botones();
	
}



private void ventana( ){
	  Ventana = new Frame("Primer Ventana");
	  Ventana.setLayout(null);
	   Ventana.setSize(800,400);//Tama—o dE lA VentAna 
	   Ventana.setBackground(Color.black);
	Ventana.setLocationRelativeTo(null);
	Ventana.setVisible(true);
	Ventana.addWindowListener(new WindowAdapter() {
	 public void windowClosing(WindowEvent e) {
		System.exit(0); 
		
	 }	
	});
	  

	 Ventana.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			System.exit(0); 
			
		 }	
		});
	 
	// Botones de acion
	 
		Button boton1 = new Button("Azul");
		boton1.setForeground(Color.red);
		boton1.setBackground(Color.blue);
		boton1.setBounds(25,100,100,40);
		boton1.setEnabled(true);
		
		boton1.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana2 V2 = new Ventana2();
				V2.VentanaAzul();
			}
		});
		
		Ventana.add(boton1);
		
		
		
		Button boton3 = new Button("Verde");
		boton3.setBounds( 25,200,100,40);
		boton3.setBackground(Color.	green);
       boton3.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana2 V2 = new Ventana2();
				V2.VentanaVerde();;
			}
		});
		Ventana.add(boton3);
		
		
		Button boton2 = new Button("Azul y blaco");
		boton2.setBounds( 620,100,150,40);
		boton2.setBackground(Color.white);
		boton2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana2 V2 = new Ventana2();
				V2.VentaAzulyblaco();
			}
		});
		Ventana.add(boton2);
		
		

		Button boton4 = new Button("Fucsia");
		   boton4.setBackground(Color.pink); 
		   boton4.setBounds( 650,200,90,40);
		   boton4.addActionListener(new ActionListener(){
          				
				@Override
				public void actionPerformed(ActionEvent e) {
					Ventana2 V2 = new Ventana2();
					V2.fucia();
				}
			});
		   Ventana.add(boton4);		
		   
		   
	   
		Button Calculos = new Button("Calculo");	
		Calculos.setBounds( 330,300,100,40);
		Calculos.setBackground(Color.orange);
		
		Calculos.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana2 V2 = new Ventana2();
				V2.Ventana_Calculo();
			}
		});
		Ventana.add(Calculos);
	
   
	
}	



 @Override
public void Frame() {
	ventana();
    //Botones();	
	
	
if(Ventana!= null) {
	 Ventana.setSize(800,400);
	 Ventana.setLocationRelativeTo(null);
	 Ventana.setResizable(false);
     Ventana.setVisible(true);	
}
	
	
	

}



@Override
public void limpiar() {


}






			
	
	




}














