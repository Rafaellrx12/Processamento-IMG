import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.util.Locale;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO;

public class Principal{
    public static void main(String[] args) throws IOException {
        /*


        Scanner entrada = new Scanner(System.in);
        File arquivo = new File("C:\\Users\\Rafael\\Downloads\\gato1.png");

        BufferedImage image = ImageIO.read(arquivo);

        Color vermelho = new Color(255,0,0);
        Color verde = new Color(0,255,0);
        Color azul = new Color(0,0,255);

        int blue = azul.getRGB();
        int red = vermelho.getRGB();
        int green = verde.getRGB();

        int w = image.getWidth();
        int h = image.getHeight();
        int pixels = w * h;

        System.out.println("a largura da imagem é: "+ w);
        System.out.println("a altura da imagem é: "+ h);
        System.out.println("A quantidade total de pixels é: "+ pixels);


        /*
        for(int i = 0; i < image.getWidth();i++){
            for(int j = 0; j < image.getHeight();j++){
                Color aux = new Color(image.getRGB(i, j));
                image.setRGB(i, j,aux.getRGB());
                System.out.println("Vermelho: " + aux.getRed() + "| Verde : "+aux.getGreen()+"| Azul : "+aux.getBlue());
                System.out.print(image.getRGB(i, j) + "\n");
            }
            System.out.println();
        }
         */

        //Filtro.brilhoAditivo(image,70);
        //Filtro.brilhoMultiplicativo(image,1.6);
        //Filtro.limiarizacao(image);
        //Filtro.escalaCinza(image);
        //Filtro.bandaBlue(image);
        //Filtro.bandaGreen(image);
        //image.setRGB(0, 0,blue);
        //image.setRGB(w/2, h/2,green);
        //image.setRGB(w-1, h-1,red);
        /*

        int aux;
            System.out.println("╔═════════════════════════════════════════════════╗");
            System.out.println("║                   MENU DE FILTROS               ║");
            System.out.println("╠═════════════════════════════════════════════════╣");
            System.out.println("║ Escolha uma opção:                              ║");
            System.out.println("║   1. Filtro de Banda Vermelha                   ║");
            System.out.println("║   2. Filtro de Banda Verde                      ║");
            System.out.println("║   3. Filtro de Banda Azul                       ║");
            System.out.println("║   4. Filtro de Cinza Média                      ║");
            System.out.println("║   5. Filtro de Cinza Vermelho                   ║");
            System.out.println("║   6. Filtro de Cinza Verde                      ║");
            System.out.println("║   7. Filtro de Cinza Azul                       ║");
            System.out.println("║   8. Filtro Negativo                            ║");
            System.out.println("║   9. Filtro Tonalidade de Banda                 ║");
            System.out.println("║  10. Filtro de Limiarização                     ║");
            System.out.println("║  11. Filtro de Brilho Aditivo                   ║");
            System.out.println("║  12. Filtro de Brilho Multiplicativo            ║");
            System.out.println("║  13. Sair                                       ║");
            System.out.println("╚═════════════════════════════════════════════════╝");
            System.out.print("Digite o número da opção desejada: ");
            aux = entrada.nextInt();

            switch (aux) {
                case 1:
                    Filtro.bandaRed(image);
                    System.out.println("Opção 1 selecionada.");
                    break;
                case 2:
                    Filtro.bandaGreen(image);
                    System.out.println("Opção 2 selecionada.");
                    break;
                case 3:
                    Filtro.bandaBlue(image);
                    System.out.println("Opção 3 selecionada.");
                    break;
                case 4:
                    Filtro.cinzaMedia(image);
                    System.out.println("Opção 4 selecionada.");
                    break;
                case 5:
                    Filtro.cinzaRed(image);
                    System.out.println("Opção 5 selecionada.");
                    break;
                case 6:
                    Filtro.cinzaGreen(image);
                    System.out.println("Opção 6 selecionada.");
                    break;
                case 7:
                    Filtro.cinzaBlue(image);
                    System.out.println("Opção 7 selecionada.");
                    break;
                case 8:
                    Filtro.negativo(image);
                    System.out.println("Opção 8 selecionada.");
                    break;
                case 9:
                    int valor;
                    String nomeBanda;
                    System.out.println("Digite o valor da Tonalização");
                    valor = entrada.nextInt();
                    System.out.println("Digite qual a Banda: ");
                    nomeBanda = entrada.next().toLowerCase();
                    Filtro.tonalidadeBanda(image, valor, nomeBanda);
                    System.out.println("Opção 9 selecionada.");
                    break;
                case 10:
                    Filtro.limiarizacao(image);
                    System.out.println("Opção 10 selecionada.");
                    break;
                case 11:
                    int aux2;
                    System.out.println("Digite o valor do Brilho Aditivo: ");
                    aux2 = entrada.nextInt();
                    Filtro.brilhoAditivo(image, aux2);
                    System.out.println("Opção 11 selecionada.");
                    break;
                case 12:
                    double aux3;
                    System.out.println("Digite o valor do Brilho Multiplicativo: ");
                    aux3 = entrada.nextDouble();
                    Filtro.brilhoMultiplicativo(image, aux3);
                    System.out.println("Opção 12 selecionada.");
                    break;
                case 13:
                    System.out.println("Opção 13 selecionada.");
                    return; // Sair do loop e encerrar o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        */





            BufferedImage image = ImageIO.read(new File("C:\\Users\\Rafael\\Downloads\\dedo.png"));

            Filtro filtro = new Filtro();

            filtro.histograma(image);

            int[] mediana = new int[9];
            mediana[0] = 40;
            mediana[1] = 32;
            mediana[2] = 40;
            mediana[3] = 27;
            mediana[4]= 0;
            mediana[5]= 22;
            mediana[6]= 35;
            mediana[7]= 198;
            mediana[8]= 25;

            filtro.medianaArray(mediana);


        }
}







