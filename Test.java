/*
*Este codigo fue escrito por SirRiuz - MJP :)
*
*  Fecha de mod :
*  Ver :1.0
*/

package pestañas;

        import mdlaf.MaterialLookAndFeel;
        import javax.swing.*;
        import javax.swing.border.LineBorder;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.net.InetAddress;
        import java.net.Socket;
        import java.util.Timer;
        import java.util.TimerTask;

 public class Test  {

     private JDialog frame;
     private JTextArea ta;
     private JPanel panel;
     private JPanel panel2;

     public boolean compro_open = false ;

     private static String name_ip ;         //Direccion ip
     private static String host_name ;       //Host name
     private static String Wifi_name = "none"; //Nombre de la red wifi

     private final ImageIcon close_icon = new ImageIcon("C:\\Users\\EQUIPO\\IdeaProjects\\Cript\\src\\pestañas\\img\\icons8_multiply_20px.png");
     private final ImageIcon check_wifi = new ImageIcon("C:\\Users\\EQUIPO\\IdeaProjects\\Cript\\src\\pestañas\\img\\Check_wifi.jpg");
     private InetAddress ip ;

     /*Este metodo contiene todos los estilos del dialog*/

     private void show_dialog() throws Exception {

         UIManager.setLookAndFeel(new MaterialLookAndFeel());

         frame = new JDialog();
         //      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // x = 1000
         frame.setLocation(971, 770);
         frame.setAlwaysOnTop(true);
         frame.setSize(394, 310);
         frame.setUndecorated(true);
         frame.setVisible(true);

         JSeparator separador = new JSeparator();
                    separador.setBounds(10, 59, 377, 1);
         //     separador.setBackground(Color.decode("#F6F6F6"));
                    separador.setForeground(Color.decode("#F6F6F6"));

         panel = new JPanel();
         panel.setLayout(null);
         panel.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width
                 , Toolkit.getDefaultToolkit().getScreenSize().height);
         panel.setBackground(Color.decode("#FFFFFF"));
         panel.add(separador);

         JLabel wifi = new JLabel(check_wifi);
                wifi.setBounds(20, 10, 50, 37);
                wifi.setBackground(Color.BLACK);
                panel.add(wifi);

         JButton close = new JButton(close_icon);
                 close.setFocusable(false);
                 close.setBounds(350, 19, 20, 20);
                 close.setBackground(Color.WHITE);
                 close.addActionListener(new AbstractAction() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("Cerrando el programa ...");
                 System.exit(0);
             }
         });

         JLabel msg1 = new JLabel();
                msg1.setText("Se ha conectado correctamente a");
                msg1.setBounds(30,80,600,24);
                msg1.setForeground(Color.decode("#343C46"));
                msg1.setFont(new Font("Roboto", Font.PLAIN, 18));
                panel.add(msg1);

                JLabel msg2 = new JLabel();
                       msg2.setText("la red : ");
                       msg2.setBounds(30,100,60,24);
                       msg2.setForeground(Color.decode("#343C46"));
                       msg2.setFont(new Font("Roboto", Font.PLAIN, 18));
                       panel.add(msg2);

                JLabel wifi_name = new JLabel();
                       Font f2 = wifi_name.getFont();
                       wifi_name.setText(Test.Wifi_name);
                       wifi_name.setBounds(90,97,600,30);
                       wifi_name.setForeground(Color.decode("#343C46"));
                       wifi_name.setFont(f2.deriveFont(f2.getStyle() | Font.BOLD, 15));
                       panel.add(wifi_name);

                      JLabel msg3 = new JLabel();
                             msg3.setText("Host name : ");
                             msg3.setBounds(30,134,105,24);
                             msg3.setForeground(Color.decode("#343C46"));
                             msg3.setFont(new Font("Roboto", Font.PLAIN, 18));
                             panel.add(msg3);

                            ip =  InetAddress.getLocalHost();
                            Test.host_name = ip.getHostName();

                            JLabel host_name = new JLabel();
                                   host_name.setText(Test.host_name);
                                   host_name.setBounds(135,134,600,30);
                                   host_name.setForeground(Color.decode("#343C46"));
                                   host_name.setFont(f2.deriveFont(f2.getStyle() | Font.BOLD, 15));
                                   panel.add(host_name);

                            JLabel msg4 = new JLabel();
                                   msg4.setText("Direccion ip : ");
                                   msg4.setBounds(30,155,110,24);
                                   msg4.setForeground(Color.decode("#343C46"));
                                   msg4.setFont(new Font("Roboto", Font.PLAIN, 18));
                                   panel.add(msg4);

                           JLabel dir_ip = new JLabel();

                                 String thisIp = InetAddress.getLocalHost().getHostAddress();
                                 Test.name_ip = thisIp;


                                 dir_ip.setText(Test.name_ip);
                                  dir_ip.setBounds(145,155,600,30);
                                  dir_ip.setForeground(Color.decode("#343C46"));
                                  dir_ip.setFont(f2.deriveFont(f2.getStyle() | Font.BOLD, 15));
                                  panel.add(dir_ip);

                 panel.add(close);

         panel2 = new JPanel();
         panel2.setBackground(Color.decode("#F5F7F9"));
         panel2.setBounds(0, 220, 394, 58);
         panel.add(panel2);

         JLabel titulo = new JLabel();
         Font f = titulo.getFont();
                titulo.setText("Conectado a internet");
                titulo.setFont(f.deriveFont(f.getStyle() | Font.BOLD, 19));
                titulo.setBounds(85, 19, 200, 19);
                titulo.setForeground(Color.decode("#28323F"));
         panel.add(titulo);

         JButton btn_info = new JButton();
                 btn_info.setText("Mas informacion");
                 btn_info.setSize(158, 35);
                 btn_info.setLocation(210, 10);
                 btn_info.setBackground(Color.GREEN);
                 btn_info.setFocusable(false);
                 btn_info.setBackground(Color.WHITE);
                 btn_info.setForeground(Color.decode("#7D7D7D"));
                 btn_info.setFont(new Font("Roboto", Font.PLAIN, 15));
                 btn_info.setBorder(new LineBorder(Color.decode("#EAEDEE")));
                 btn_info.addActionListener(new AbstractAction() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         System.out.println("\nEste apartado no esta disponible :(");
                     }
                 });
                 panel2.add(btn_info);

         frame.add(panel);

         /*Esta es la animacion que se ejecuta al aparecer el dialog*/

         TimerTask Animacion = new TimerTask() {
             @Override
             public void run() {
                 System.out.println("Ejecutando animacion");
                 int x = 770;

                 while (x > 490) {

                     frame.setLocation(971, x);
                     x = x - 1;
                 }}
         };

         int x = Toolkit.getDefaultToolkit().getScreenSize().width;
         System.out.println(x);

         Timer time = new Timer();
         time.schedule(Animacion, 0);

     }

     /*Compruebaa la conexion a internet*/

     public boolean com_conexion(String url, int puerto) {

         try {

             Socket conexion = new Socket(url, puerto);
             if (conexion.isConnected()) {

                 System.out.println("\nConectado a internet \n");
                 System.out.println("HOST-NAME : " + Test.host_name);
                 System.out.println("WIFI-NAME : "+Test.Wifi_name);
                 String thisIp = InetAddress.getLocalHost().getHostAddress();
                 System.out.println("IP:"+Test.name_ip);
                 compro_open = true;
                 show_dialog();
             }
         } catch (Exception e) {
             System.out.println("Sin conexion \n- No se muestra el dialog...");
             compro_open = false ;
         }
         return compro_open ;
     }

     public static void main(String[] args) {
         Test v = new Test();

         //Comprueva la conexion a internet

         var x = 0 ;
         while (x < 10){
             if (v.com_conexion("www.google.com", 80)){
                 break;
             } else {
                 continue;
             }
         }}
  }