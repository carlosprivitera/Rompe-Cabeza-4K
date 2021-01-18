package recursos;

import java.awt.Color;
import java.awt.Image;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Imagenes01 {
    private final static int NImagenes = 3;
    private boolean jugar = true;
    private int numImgActual = 0;
    private int numImgActualReal = 0;
    private ImageIcon imgIcono[] = new ImageIcon[3];
    private Image imgImg[] = new Image[3];
    private ImageIcon imgIconoEscalado[] = new ImageIcon[3];
    
    private ImageIcon imgIconoBN = null;
    private Image imgImgBN = null;    
    private ImageIcon imgIconoEscaladoBN = null;
    
    private Image imgNxN[][] = new Image[20][20];
    private ImageIcon imgIconNxN[][] = new ImageIcon[20][20]; 
    
    private BufferedImage tmp_Recorte = null;
    private ImageIcon tmp_RecorteIcon = null;
    private BufferedImage Imagen_en_memoria = null;
    private BufferedImage Imagen_en_memoriaBN = null;
    
    private int arribaAbajo = 0;
    public void seleccionarPieza(boolean masMenos) {
        if(masMenos){
            if(arribaAbajo < (20 * 20) - 1 ) arribaAbajo++; 
        }else{
            if(arribaAbajo > 0) arribaAbajo--;
        }
        tmp_RecorteIcon = imgIconNxN[10][10];
        pieza.setIcon(imgIconNxN[10][10]);        
    }
    public void romper(int queImagen) {
        Imagen_en_memoria = new BufferedImage(imgIcono[numImgActualReal].getIconWidth(),imgIcono[numImgActualReal].getIconHeight(),BufferedImage.TYPE_INT_ARGB);
        Imagen_en_memoriaBN = new BufferedImage(imgIcono[numImgActualReal].getIconWidth(),imgIcono[numImgActualReal].getIconHeight(),BufferedImage.TYPE_BYTE_GRAY); 
        
        Imagen_en_memoria.getGraphics().drawImage(imgIcono[numImgActualReal].getImage(), 0, 0, null);
        
     //   Imagen_en_memoriaBN.getGraphics().drawImage(imgIcono[numImgActualReal].getImage(), 0, 0, null);
        
        int x = imgIcono[numImgActualReal].getIconWidth();
        int y = imgIcono[numImgActualReal].getIconHeight();
        int xc = (x / 20);
        int yc = (y / 20);
        //x = x - xc; y = y - yc;
        /**
        for(int f=0; f<y; f = f + yc) {
            Imagen_en_memoriaBN.getGraphics().drawLine(0, f, x, f);
        }
        for(int c=0; c<x; c = c + xc) {
           Imagen_en_memoriaBN.getGraphics().drawLine(c, 0, c, y);    
        }     
**/
       // Imagen_en_memoriaBN.getGraphics().setColor (new Color(0,0,0)); 
        //carrusel.setOpaque(false);
        //carrusel.setBackground(Color.green);
        for(int f=0; f<(y); f = f + yc) {
            for(int c=0; c<(x); c = c + xc) {
                Imagen_en_memoriaBN.getGraphics().drawRect(c, f, xc-1, yc-1);
                
                imgNxN[c/xc][f/yc] = Imagen_en_memoria.getSubimage(c, f, xc-1, yc-1);
                imgIconNxN[c/xc][f/yc]=new ImageIcon(imgNxN[c/xc][f/yc]);
                
                
              //  if(c==0 && f==0) Imagen_en_memoriaBN.getGraphics().drawRect(c, f, xc-20, yc-20);
              //  if(c==0 && f>0) Imagen_en_memoriaBN.getGraphics().drawRect(c, f, xc-20, f+yc-20);
              //  if(c>0 && f==0) Imagen_en_memoriaBN.getGraphics().drawRect(c, f, c+xc-20, yc-20);
              //  if(c>0 && f>0) Imagen_en_memoriaBN.getGraphics().drawRect(c, f, c+xc-20, f+yc-20); 
            }
        } 
      //  tmp_Recorte.getGraphics().drawImage(imgIconNxN[0][0].getImage(), 0, 0, null);
        tmp_RecorteIcon = imgIconNxN[10][10];
        pieza.setIcon(imgIconNxN[10][10]);
/**      
        for(int f=0; f<(y-yc); f = f + yc) {
            for(int c=0; c<(x-xc); c = c + xc) {
                if(c==0 && f==0) {
                    //Imagen_en_memoriaBN.getGraphics().drawRect(c, f, xc, yc);
                    imgNxN[c/xc][f/yc] = Imagen_en_memoria.getSubimage(c, f, xc, yc);
                    imgIconNxN[c/xc][f/yc]=new ImageIcon(imgNxN[c/xc][f/yc]);
                    pieza.setIcon(imgIconNxN[c/xc][f/yc]);
                }
                if(c==0 && f>0) {
                    //Imagen_en_memoriaBN.getGraphics().drawRect(c, f, xc, f * yc);
                    imgNxN[c/xc][f/yc] = Imagen_en_memoria.getSubimage(c, f, xc, f + yc);
                    imgIconNxN[c/xc][f/yc]=new ImageIcon(imgNxN[c/xc][f/yc]);
                    pieza.setIcon(imgIconNxN[c/xc][f/yc]);                
                }
                if(c>0 && f==0) {
                    //Imagen_en_memoriaBN.getGraphics().drawRect(c, f, c * xc, yc);
                    imgNxN[c/xc][f/yc] = Imagen_en_memoria.getSubimage(c, f, c + xc, yc);
                    imgIconNxN[c/xc][f/yc]=new ImageIcon(imgNxN[c/xc][f/yc]);
                    pieza.setIcon(imgIconNxN[c/xc][f/yc]);                
                }
                if(c>0 && f>0)  { 
                    //Imagen_en_memoriaBN.getGraphics().drawRect(c, f, c * xc, f * yc); 
                    imgNxN[c/xc][f/yc] = Imagen_en_memoria.getSubimage(c, f, c + xc, f + yc);
                    imgIconNxN[c/xc][f/yc]=new ImageIcon(imgNxN[c/xc][f/yc]);
                    pieza.setIcon(imgIconNxN[c/xc][f/yc]);                
                }    
            }
        }        
  */     
        
  /*      
        tmp_Recorte = Imagen_en_memoria.getSubimage(0, 0, 64, 64);
        tmp_RecorteIcon = new ImageIcon(tmp_Recorte);
        //pieza.getGraphics().drawImage(tmp_Recorte, 0, 0, null);
        pieza.setIcon(tmp_RecorteIcon);
        
  */      
        imgIconoBN = new ImageIcon(Imagen_en_memoriaBN);
        imgImgBN = imgIconoBN.getImage();
        
        //imgIconoEscaladoBN = new ImageIcon(Imagen_en_memoriaBN);
        
        

        
        
        
    }
    
    private JLabel carrusel = null;
    private JLabel pieza = null;
    
    private Hilo hilo = null;
    
    public Imagenes01(JLabel carrusel, JLabel pieza) {
        super();
        imgIcono[0] = new ImageIcon(getClass().getResource("01.png"));
        imgImg[0] = imgIcono[0].getImage();

        
        imgIcono[1] = new ImageIcon(getClass().getResource("02.png"));
        imgImg[1] = imgIcono[1].getImage();

        
        imgIcono[2] = new ImageIcon(getClass().getResource("03.png"));
        imgImg[2] = imgIcono[2].getImage();
        
        this.carrusel = carrusel;
        this.pieza = pieza;
        
       // escalar(-1);       
       // carrusel.setIcon(imgIconoEscalado[numImgActual]);
        
        hilo = new Hilo();
        hilo.start();
        
    }
    private int xAncho = 0;
    private int yAlto = 0;
    public void escalar(int xAncho, int yAlto) {
        //carrusel.setSize(200, 200);
        if((this.xAncho != xAncho) || (this.yAlto != yAlto)) {
          
           if(jugar == true) {
            imgIconoEscalado[0] = new ImageIcon(imgImg[0].getScaledInstance(xAncho, -1, Image.SCALE_SMOOTH));
            imgIconoEscalado[1] = new ImageIcon(imgImg[1].getScaledInstance(xAncho, -1, Image.SCALE_SMOOTH));
            imgIconoEscalado[2] = new ImageIcon(imgImg[2].getScaledInstance(xAncho, -1, Image.SCALE_SMOOTH));
           }
           if(jugar == false) {
               imgIconoEscaladoBN = new ImageIcon(imgImgBN.getScaledInstance(xAncho, -1, Image.SCALE_SMOOTH)); 
           }
          this.xAncho = xAncho;
          this.yAlto = yAlto;
           
       }
       // if(jugar == false){
       //     pieza.getGraphics().drawImage(tmp_Recorte, 0, 0, null); 
       // }
       // carrusel.setIcon(imgIconoEscalado[numImgActual]);
    //    segundos = 5;
    }

    public void setJugar(boolean jugar) {
        this.jugar = jugar;
    }

    class Hilo extends Thread {

        Hilo() {
            // TODO Implement this method
            super();
        }

        @Override
        public void run() {
            // TODO Implement this method
            super.run();
            int segundos = 5;
            int x = 0;
            int y = 0;
            do {

                try {
                    this.sleep(1000);
                    
                    if(jugar == false) {
                        if((xAncho != x) || (yAlto != y)) {
                          x = xAncho; y = yAlto;  
                          carrusel.setIcon(imgIconoEscaladoBN);
                         // pieza.getGraphics().drawImage(tmp_Recorte, 0, 0, null);
                          pieza.setIcon(tmp_RecorteIcon);
                        }
                    }    
                    if(jugar == true) {
                      segundos = segundos + 1;
                      if((segundos > 5)) {
                        segundos = 0;  
                        carrusel.setIcon(imgIconoEscalado[numImgActual]);
                        numImgActualReal = numImgActual;
                        numImgActual = numImgActual + 1;
                    //imgImg[0].getScaledInstance(0, 100, 100);
         //           carrusel.setText(carrusel.getWidth() + ":" + carrusel.getHeight());
                    
                        if(numImgActual >= 3){
                          numImgActual = 0;
                        }
                      //this.sleep(5000);
                      }else{
                          if((xAncho != x) || (yAlto != y)) {
                            x = xAncho; y = yAlto;  
                            carrusel.setIcon(imgIconoEscalado[numImgActualReal]);
                          } 
                      }
                    }  
                } catch (InterruptedException e) {
                   JOptionPane.showMessageDialog(null, "Error InterruptedException: run(), Hilo{}." +
                                                 e.getMessage());
                   System.exit(1);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Exception: run(), Hilo{}." +
                                                  e.getMessage());
                    System.exit(1);  
                }

            }while(true);
        }
    }
}
