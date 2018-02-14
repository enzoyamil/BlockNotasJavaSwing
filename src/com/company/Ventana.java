package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
  JMenuItem item[];
  JMenu menu[];
  private JMenuBar barra;
  private JTextArea texto;

  public Ventana(){
      super("Block de Notas");
      setSize(600,700);
      barra=new JMenuBar();
      texto=new JTextArea();
      item = new JMenuItem[24];
      item[0] = new JMenuItem("Nuevo");
      item[1] = new JMenuItem("Abrir");
      item[2] = new JMenuItem("nuevo archivo");
      item[3] = new JMenuItem("Guardar");
      item[4] = new JMenuItem("Guardar Como");
      item[5] = new JMenuItem("Configurar Pagina");
      item[6] = new JMenuItem("Imprimir");
      item[7] = new JMenuItem("Salir");
      item[8] = new JMenuItem("Deshacer");
      item[9] = new JMenuItem("Cortar");
      item[10] = new JMenuItem("Copiar");
      item[11] = new JMenuItem("Pegar");
      item[12] = new JMenuItem("Eliminar");
      item[13] = new JMenuItem("Buscar");
      item[14] = new JMenuItem("Buscar Siguiente");
      item[15] = new JMenuItem("Remplazar");
      item[16] = new JMenuItem("Ir a");
      item[17] = new JMenuItem("Seleccionar todo");
      item[18] = new JMenuItem("Horario y Fecha");
      item[19] = new JMenuItem("Ajuste de Linea");
      item[20] = new JMenuItem("Fuente...");
      item[21] = new JMenuItem("Barra de Estado");
      item[22] = new JMenuItem("Ver la Ayuda");
      item[23] = new JMenuItem("Acerca del Blck de Notas");


          menu =new JMenu[5];
          menu[0]=new JMenu("Archivo");
          menu[1]=new JMenu("Edicion");
          menu[2]=new JMenu("Formato");
          menu[3]=new JMenu("Ver");
          menu[4]=new JMenu("Ayuda");


      setJMenuBar(barra);
      barra.add(menu[0]);
      barra.add(menu[1]);
      barra.add(menu[2]);
      barra.add(menu[3]);
      barra.add(menu[4]);
      menu[0].add(item[0]);
      menu[0].add(item[1]);
      menu[0].add(item[2]);
      menu[0].add(item[3]);
      menu[0].add(item[4]);
      menu[0].add(item[5]);
      menu[0].add(item[6]);
      menu[0].add(item[7]);
      menu[1].add(item[8]);
      menu[1].add(item[9]);
      menu[1].add(item[10]);
      menu[1].add(item[11]);
      menu[1].add(item[12]);
      menu[1].add(item[13]);
      menu[1].add(item[14]);
      menu[1].add(item[15]);
      menu[1].add(item[16]);
      menu[1].add(item[17]);
      menu[1].add(item[18]);
      menu[2].add(item[19]);
      menu[2].add(item[20]);
      menu[3].add(item[21]);
      menu[4].add(item[22]);
      menu[4].add(item[23]);
      add(texto);
      System.out.println("esto se muestra");
      item[7].addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              item[7].setVisible(true);
              setVisible(false);
          }
      });

      }


  }



