package Ventana;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.CheckboxGroup;
import models.Calculos;
import java.awt.Label;


import Interfas.FromInterface;

public class Ventana2 extends Frame implements FromInterface{

	private static final long serialVersionUID = 1L;
	
	private Frame ventana2;

    private TextField tex1, tex2;
    private Label LbResultado;
    private CheckboxGroup Grupo;
    private Checkbox Suma, Resta,Multiplicacion,DIvicion;
    private Button Calcular ;
    private Button Regresar;
    private Button Limpiar; 

	
	

	
  public void VentanaAzul() {
	  
	  ventana2 = new Frame();
	  ventana2.setLayout(null);
	  ventana2.setSize(800,400);//Tama—o dE lA VentAna 
	  ventana2.setBackground(Color.blue);
	  ventana2.setLocationRelativeTo(null);
	  ventana2.setVisible(true);
	  ventana2.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			System.exit(0); 
			dispose();
			
		 }	
		});
	  
	  
	  Regresar = new Button("Volver");  
	  Regresar.setBounds(25,100,100,40);
	  ventana2.add(Regresar);
	  Regresar.setBackground(Color.orange);
	  Regresar.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
         Jframe V1 = new Jframe(); 
         V1.Iniciar_Controladores();
			
		}
		  
	  });

	  
	  
	  
  }
	
	
  public void VentaAzulyblaco () {  
	  ventana2 = new Frame();
	  panel1 = new Panel();
	  panel2 = new Panel();
	  panel1.setBounds(0,0,800,200);
	  panel1.setBackground(Color.blue);
	  panel2.setBackground(Color.white);
	  panel1.setBounds(0,200,800,200);
	  ventana2.setLayout(null);
	  ventana2.add(panel1);
	  ventana2.add(panel2);
	  ventana2.setSize(800,400);//Tama—o dE lA VentAna 
	  //ventana2.setBackground(Color.blue);
	  ventana2.setLocationRelativeTo(null);
	  ventana2.setVisible(true);
	  ventana2.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			System.exit(0); 
			
		 }	
		}); 
	  
	  Regresar = new Button("Volver");  
	  Regresar.setBounds(25,100,100,40);
	  ventana2.add(Regresar);
	  Regresar.setBackground(Color.orange);
	  Regresar.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
         Jframe V1 = new Jframe(); 
         V1.Iniciar_Controladores();
			
		}
		  
	  });

	  
	 
  }
  private Panel panel1, panel2;
  
  public void VentanaVerde() {
	  
	  ventana2 = new Frame();
	  ventana2.setLayout(null);
	  ventana2.setSize(800,400);//Tama—o dE lA VentAna 
	  ventana2.setBackground(Color.green);
	  ventana2.setLocationRelativeTo(null);
	  ventana2.setVisible(true);
	  ventana2.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			System.exit(0); 
			
		 }	
		});  
	  
	  Regresar = new Button("Volver");  
	  Regresar.setBounds(25,100,100,40);
	  ventana2.add(Regresar);
	  Regresar.setBackground(Color.orange);
	  Regresar.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
         Jframe V1 = new Jframe(); 
         V1.Iniciar_Controladores();
			
		}
		  
	  });

	  
	  
	  
  }
  
  public void fucia() {
	  ventana2 = new Frame();
	  ventana2.setLayout(null);
	  ventana2.setSize(800,400);//Tama—o dE lA VentAna 
	  ventana2.setBackground(Color.pink);
	  ventana2.setLocationRelativeTo(null);
	  ventana2.setVisible(true);
	  ventana2.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			System.exit(0); 
			
		 }	
		});  
	  	  
	  
	  Regresar = new Button("Volver");  
	  Regresar.setBounds(25,100,100,40);
	  ventana2.add(Regresar);
	  Regresar.setBackground(Color.orange);
	  Regresar.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
         Jframe V1 = new Jframe(); 
         V1.Iniciar_Controladores();
			
		}
		  
	  });

	  
	  
	  
  }
  
  
  
  
  public void Ventana_Calculo() {
	  
	  ventana2 = new Frame();
	  ventana2.setLayout(null);
	  ventana2.setBackground(Color.black);
	  ventana2.setSize(800,400);//Tama—o dE lA VentAna 
	  ventana2.setLocationRelativeTo(null);
	  ventana2.setVisible(true);
	  ventana2.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			System.exit(0); 
			
			
		 }	
		});  
	  Botones_Acion_ventana_Calcular(); 
	 
	  Regresar = new Button("Volver");  
	  Regresar.setBounds(550,300,100,30);
	  ventana2.add(Regresar);
	  Regresar.setBackground(Color.orange);
	  Regresar.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
         Jframe V1 = new Jframe(); 
         V1.Iniciar_Controladores();
			
		}
		  
	  });

	   
	 
   } 
	  
  Calculos Cl = new Calculos();
  
  public void Botones_Acion_ventana_Calcular() {
	  
	 
	  
	  Calculos Cl = new Calculos();
	  
	    Calcular = new Button("Calcular");
		Calcular.setBounds(50,300,100,30);
		Calcular.setBackground(Color.green);
        Calcular.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String texto1 = tex1.getText();
				String texto2 = tex2.getText();
				
				double numero1 = Double.parseDouble(texto1); 
	            double numero2 = Double.parseDouble(texto2);
	            
	            if(Suma.getState()) {
	            	 LbResultado.setText("Suma:" + (Cl.Suma(numero1, numero2)));
	            	 System.out.println("SUMA");
	            }else if(Resta.getState()) {
	            	 LbResultado.setText("Resta:" + (Cl.Resta(numero1, numero2)));
	            	 System.out.println("RESTA");
	            }else if(DIvicion.getState()) {
	            	 LbResultado.setText("Division:" + (Cl.Divicion(numero1, numero2)));
	            	 System.out.println("DIVISION");
	            }else {
	            	LbResultado.setText("Multiplicacion:" + (Cl.Multiplicacion(numero1, numero2)));
	            	System.out.println("MULTI");
	            }
	            
	           
	            
	            //LbResultado.setText("Resta:" + (Cl.Resta(numero1, numero2)));
	            
	           // LbResultado.setText("Multiplicacion:" + (Cl.Multiplicacion(numero1, numero2)));
	           // LbResultado.setText("Divicion:" + (Cl.Divicion(numero1, numero2)));
			}
        	
        });		
 

    
        
        
        
        
        
        
        
        
		
         ventana2.add(Calcular);
// aqui solo hay texfile         
         tex1 = new TextField();
     	tex1.setBounds(20, 100, 100,25);
     	tex1.setBackground(Color.white);

     	ventana2.add(tex1);
     	
     	
     	
     	tex2 = new TextField();
     	tex2.setBounds(150, 100, 100,25);
     	tex2.setBackground(Color.white);
     	
     	
     	ventana2.add(tex2);
     	
   // chesk vocs    
     	
     Grupo = new CheckboxGroup(); 

   	 Suma = new Checkbox("Suma");	 
   	 Suma.setBounds(650, 100, 100,25); 
   	 Suma.setBackground(Color.pink);
   	 Suma.setCheckboxGroup(Grupo);
   	 
   	 Suma.addItemListener(new ItemListener(){

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			String texto1 = tex1.getText();
			String texto2 = tex2.getText();
			
			double numero1 = Double.parseDouble(texto1); 
            double numero2 = Double.parseDouble(texto2);
            
            
            System.out.println("Suma:"+Cl.Suma(numero1, numero2));
			
		}
   		 
   		 
   	 });
		
   	 
   	 ventana2.add(Suma);
   	 
   	 
   	 
   	 Resta = new Checkbox("Resta");	 
   	 Resta.setBounds(650,125, 100,25); 
   	 Resta.setBackground(Color.pink);
   	 Resta.setCheckboxGroup(Grupo);
   
   	 
   	 
   	 ventana2.add(Resta);
   	 
   	 

   	  Multiplicacion = new Checkbox("Multiplicacion");	 
   	  Multiplicacion .setBounds(650, 150, 100,25); 
   	  Multiplicacion .setBackground(Color.pink);
   	  Multiplicacion .setCheckboxGroup(Grupo);
   	  
		

		
   	 
   	 ventana2.add(Multiplicacion); 
   	 
   	 DIvicion = new Checkbox("Divicion");	 
   	 DIvicion.setBounds(650, 175, 100,25); 
   	 DIvicion.setBackground(Color.pink);
   	 DIvicion.setCheckboxGroup(Grupo);
		

   	
   	 
   	 ventana2.add( DIvicion);
   
    
     LbResultado=new Label();
	 LbResultado.setBounds(40,200, 200,25);
	 LbResultado.setBackground(Color.white);
	 ventana2.add(LbResultado);
	 
	// boton limpiar
	 
	 Limpiar = new Button("Limpiar");
		Limpiar.setBounds(650,300,100,30);
	    Limpiar.setBackground(Color.green);
	    Limpiar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				limpiar();
			}
	    	
	    });
	    
	    
	    ventana2.add(Limpiar);  
     
  }
	



 
 
	@Override
	public void Frame() {
		
		
		
	if( ventana2!= null) {
		 ventana2.setSize(800,400);
		 ventana2.setLocationRelativeTo(null);
		 ventana2.setResizable(false);
	     ventana2.setVisible(true);	
	}
		
		
	}


	@Override
	public void limpiar() {
		 LbResultado.setText("");
        tex1.setText("");
        tex2.setText("");

		
	}

}
