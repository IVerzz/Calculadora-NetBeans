
package proyecto.calculadora;
//@wiliam ramos, jesus bula, kener guazne
//impotamos la libreria que usamos
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {
    //declaramos variables
    public float primerNumero; //  almacena el primer numero
    public float segundoNumero; // almacedna el segundo numero
    public String operador; // almacena el operador seleccionado 
    
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null); // esto es para que la calculadora aperezca en el centro
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantallaOperacion = new javax.swing.JLabel();
        pantallaResultado = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pi = new javax.swing.JButton();
        retroceder = new javax.swing.JButton();
        parentesisAbre = new javax.swing.JButton();
        parentesisCierra = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        Elevado = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        Suma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantallaOperacion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pantallaOperacion.setForeground(new java.awt.Color(102, 102, 102));
        pantallaOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantallaOperacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(pantallaOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 30));

        pantallaResultado.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        pantallaResultado.setForeground(new java.awt.Color(102, 102, 102));
        pantallaResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(pantallaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 90, 390, 63));

        btn_oscuro.setBackground(new java.awt.Color(51, 51, 51));
        btn_oscuro.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_oscuro.setForeground(new java.awt.Color(255, 255, 255));
        btn_oscuro.setText("MODOS");
        btn_oscuro.setActionCommand("");
        btn_oscuro.setBorder(null);
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 10, 90, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("•");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("•");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -20, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pi.setBackground(new java.awt.Color(204, 204, 255));
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        jPanel2.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, 50));

        retroceder.setBackground(new java.awt.Color(255, 51, 51));
        retroceder.setText("X");
        retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrocederActionPerformed(evt);
            }
        });
        jPanel2.add(retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        parentesisAbre.setBackground(new java.awt.Color(204, 204, 255));
        parentesisAbre.setText("(");
        parentesisAbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentesisAbreActionPerformed(evt);
            }
        });
        jPanel2.add(parentesisAbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        parentesisCierra.setBackground(new java.awt.Color(204, 204, 255));
        parentesisCierra.setText(")");
        parentesisCierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentesisCierraActionPerformed(evt);
            }
        });
        jPanel2.add(parentesisCierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        mod.setBackground(new java.awt.Color(204, 204, 255));
        mod.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        mod.setText("mod");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel2.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        siete.setBackground(new java.awt.Color(242, 249, 251));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        ocho.setBackground(new java.awt.Color(242, 249, 251));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        nueve.setBackground(new java.awt.Color(242, 249, 251));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

        Dividir.setBackground(new java.awt.Color(242, 249, 251));
        Dividir.setText("÷");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });
        jPanel2.add(Dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 50));

        Raiz.setBackground(new java.awt.Color(204, 204, 255));
        Raiz.setText("√");
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });
        jPanel2.add(Raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 50, 50));

        Elevado.setBackground(new java.awt.Color(204, 204, 255));
        Elevado.setText("x²");
        Elevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevadoActionPerformed(evt);
            }
        });
        jPanel2.add(Elevado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 50, 50));

        cuatro.setBackground(new java.awt.Color(242, 249, 251));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        cinco.setBackground(new java.awt.Color(242, 249, 251));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        seis.setBackground(new java.awt.Color(242, 249, 251));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        multiplicar.setBackground(new java.awt.Color(242, 249, 251));
        multiplicar.setText("x");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 50));

        uno.setBackground(new java.awt.Color(242, 249, 251));
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        dos.setBackground(new java.awt.Color(242, 249, 251));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 50));

        tres.setBackground(new java.awt.Color(242, 249, 251));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 50));

        Resta.setBackground(new java.awt.Color(242, 249, 251));
        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        jPanel2.add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 50));

        Igual.setBackground(new java.awt.Color(51, 102, 0));
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        jPanel2.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 50, 120));

        cero.setBackground(new java.awt.Color(242, 249, 251));
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel2.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        coma.setBackground(new java.awt.Color(242, 249, 251));
        coma.setText(",");
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });
        jPanel2.add(coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 50));

        porcentaje.setBackground(new java.awt.Color(242, 249, 251));
        porcentaje.setText("%");
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, 50));

        Suma.setBackground(new java.awt.Color(242, 249, 251));
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        jPanel2.add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 410, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        // agregamos los numeros en pantalla
    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"0");
        
    }//GEN-LAST:event_ceroActionPerformed
    //agregamos la funcion de borrar al boton de retroceder 
    private void retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrocederActionPerformed
        pantallaOperacion.setText("");
        pantallaResultado.setText("");
    }//GEN-LAST:event_retrocederActionPerformed
    // este método permite al usuario agregar una coma al número que están ingresando en la interfaz de usuario, para introducir números decimales
    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+",");
    }//GEN-LAST:event_comaActionPerformed
        // agregamos el simbolo de porcentaje 
    // este código toma un número ingresado por el usuario, lo interpreta como un porcentaje (dividiendo por 100), y muestra el resultado en la interfaz de usuario.
    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
        //this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"%");
        primerNumero = Float.parseFloat(pantallaOperacion.getText());
        float resultado = primerNumero / 100;
        pantallaResultado.setText(String.valueOf(resultado));

        
        
    }//GEN-LAST:event_porcentajeActionPerformed
      //  agregamos la suma 
    // este código toma un número ingresado por el usuario, establecer un operador (suma), y luego limpiar la pantalla para prepararse para la entrada de un segundo número.
    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        //this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"+");
        primerNumero = Float.parseFloat(pantallaOperacion.getText());
        operador = "+";
        pantallaOperacion.setText("");
    }//GEN-LAST:event_SumaActionPerformed
    // se agrega los numeros 1, 2 y 3 en la calculadora
    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"1");
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"3");
    }//GEN-LAST:event_tresActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
    //  agregamos la resta
//this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"-");
        primerNumero = Float.parseFloat(pantallaOperacion.getText());
        operador = "-";
        pantallaOperacion.setText("");
    }//GEN-LAST:event_RestaActionPerformed
    //se agrega los numeros 4, 5 y 6 en la calculadora
    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"6");
    }//GEN-LAST:event_seisActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
//  agregamos el de multiplicar    
    // este código prepara la aplicación para realizar una operación de multiplicación utilizando el número ingresado por el usuario 
//this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"x");
        primerNumero = Float.parseFloat(pantallaOperacion.getText());
        operador = "*";
        pantallaOperacion.setText("");
    }//GEN-LAST:event_multiplicarActionPerformed
    //agregamos los numeros 7, 8 y 9 en la calculadora
    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"9");
    }//GEN-LAST:event_nueveActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
       //  agregamos la divicion
        // este código prepara la aplicación para realizar una operación de división utilizando el número ingresado por el usuario
        //this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"÷");
        primerNumero = Float.parseFloat(pantallaOperacion.getText());
        operador = "/";
        pantallaOperacion.setText("");
    }//GEN-LAST:event_DividirActionPerformed
    
    private void parentesisAbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentesisAbreActionPerformed
        //  agregamos los parentesis 
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"(");
    }//GEN-LAST:event_parentesisAbreActionPerformed

    private void parentesisCierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentesisCierraActionPerformed
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+")");
    }//GEN-LAST:event_parentesisCierraActionPerformed
    
    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        //  agregamos el pi para q nos muestre en pantalla su valor
        this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"3,1416");
    }//GEN-LAST:event_piActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        //  almacena el numero mostrado en pantalla como el primer numero y establece el operador como modulo 
       // this.pantallaOperacion.setText(this.pantallaOperacion.getText()+" mod ");
         primerNumero = Float.parseFloat(pantallaOperacion.getText());
           operador = "mod";
           pantallaOperacion.setText("");
    }//GEN-LAST:event_modActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        //  agregamos la raiz
        // este código calcula la raíz cuadrada del número ingresado por el usuario, verifica si el resultado es un número entero o tiene decimal.
        //this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"√");
        double primerNumero = Double.parseDouble(pantallaOperacion.getText());
        double resultado = Math.sqrt(primerNumero);
          if (resultado % 1 == 0){
          }else{
          //si tiene decimales, mostrarlo como un numero de punto flotante
          pantallaOperacion.setText(String.valueOf(resultado));
          pantallaResultado.setText(pantallaOperacion.getText());
          }

          
          
    }//GEN-LAST:event_RaizActionPerformed
    
    //es el controlador de un evento de acción que se activa cuando se presiona un botón de igual (IgualActionPerformed)
    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
       segundoNumero = Float.parseFloat(pantallaOperacion.getText());
       float resultado = 0;
       
       switch(operador) {
           case "+":
           resultado = primerNumero + segundoNumero;
           break;
           
           case "-":
               resultado = primerNumero - segundoNumero;
           break;
           
           case "*":
               resultado = primerNumero * segundoNumero;
           break;
           
           case "/":
               if (segundoNumero != 0){
                   resultado = primerNumero / segundoNumero;
               }else  {
                   pantallaResultado.setText("Error: Division por cero");
                   return; 
               }
           break;
           case"mod":
                resultado = primerNumero % segundoNumero;
                pantallaResultado.setText(primerNumero + " % " + segundoNumero + " = " + resultado);
                break;
           
                  
        
           default:
               pantallaResultado.setText("Operacion desconocida");
               
               
           
               
       }
       pantallaResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_IgualActionPerformed
    //este método calcula el cuadrado del número mostrado en la pantalla, y luego muestra el resultado en la interfaz de usuario. Dependiendo de si el resultado es un número entero o tiene decimales
    private void ElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevadoActionPerformed
       //this.pantallaOperacion.setText(this.pantallaOperacion.getText()+"²");
    String textoPantalla = pantallaOperacion.getText();
    double numero = Double.parseDouble(textoPantalla);
    double resultado = Math.pow(numero, 2);
  // hacemos un if else para saber si tines decimales y que los coloques 
  if (resultado % 1 == 0 ){
      // si es un numero entero que lo muestre como entero
      pantallaOperacion.setText(String.valueOf((int)resultado));
      pantallaResultado.setText("elevado "+ pantallaOperacion.getText());
  } else {
      // si tiene decimales que lo muestre como float 
      pantallaOperacion.setText(String.valueOf(resultado));
  }

      
  
            
       
       
    }//GEN-LAST:event_ElevadoActionPerformed
    
    //modo oscuro
    boolean modoOscuro = false;
    
    
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
       // Se cambian los colores de fondo y texto de varios componentes.
        if(!modoOscuro){
           jPanel1.setBackground(Color.decode("#333333"));
        jPanel2.setBackground(Color.decode("#202020"));
        pantallaOperacion.setForeground(Color.decode("#FFFFFF"));
        pantallaResultado.setForeground(Color.decode("#FFFFFF"));
        btn_oscuro.setForeground(Color.decode("#FFFFFF"));
        
        // Se cambian los colores de fondo de otros componentes llamando a la función "cambiarColorBtn1"
        cambiarColorBtn1(btn_oscuro);
        cambiarColorBtn1(Elevado);
        cambiarColorBtn1(Raiz);
        cambiarColorBtn1(pi);
        cambiarColorBtn1(mod);
        cambiarColorBtn1(parentesisCierra);
        cambiarColorBtn1(parentesisAbre);
        
        
        
        
       cambiarColorBtn2(cero);
       cambiarColorBtn2(uno);
       cambiarColorBtn2(dos);
       cambiarColorBtn2(tres);
       cambiarColorBtn2(cuatro);
       cambiarColorBtn2(cinco);
       cambiarColorBtn2(seis);
       cambiarColorBtn2(siete);
       cambiarColorBtn2(ocho);
       cambiarColorBtn2(nueve);
       cambiarColorBtn2(Suma);
       cambiarColorBtn2(Resta);
       cambiarColorBtn2(multiplicar);
       cambiarColorBtn2(Dividir);
       cambiarColorBtn2(porcentaje);
       cambiarColorBtn2(coma);
       modoOscuro = true;
       } else {
           Calculadora frame = new Calculadora();
           this.dispose();
           frame.setVisible(true);
       }
        
        
    }//GEN-LAST:event_btn_oscuroActionPerformed
    
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
        
    }
    public void cambiarColorBtn1(JButton btn){
        btn.setBackground(Color.decode("#808080"));
        btn.setForeground(Color.decode("#FFFFFF"));
        
    }
    
    
    
    public void cambiarColorBtn2(JButton btn){
        
        btn.setBackground(Color.decode("#333333"));
        btn.setForeground(Color.decode("#FFFFFF"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Elevado;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Raiz;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton coma;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JLabel pantallaOperacion;
    private javax.swing.JLabel pantallaResultado;
    private javax.swing.JButton parentesisAbre;
    private javax.swing.JButton parentesisCierra;
    private javax.swing.JButton pi;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton retroceder;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
