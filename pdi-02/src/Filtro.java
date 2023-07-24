import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class Filtro {


    public static void bandaRed(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                Color aux1 = new Color(aux.getRed(), 0, 0);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }

    public static void bandaGreen(BufferedImage image) throws IOException {

        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                Color aux1 = new Color(0, aux.getGreen(), 0);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }

    public static void bandaBlue(BufferedImage image) throws IOException {

        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                Color aux1 = new Color(0, 0, aux.getBlue());
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }

    public static void cinzaMedia(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int vermelho = aux.getRed();
                int verde = aux.getGreen();
                int azul = aux.getBlue();
                Color aux1 = new Color((vermelho + verde + azul) / 3, (aux.getRed() + aux.getBlue() + aux.getGreen()) / 3, (aux.getRed() + aux.getBlue() + aux.getGreen()) / 3);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }

    public static void cinzaRed(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int vermelho = aux.getRed();
                Color aux1 = new Color(vermelho, vermelho, vermelho);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }
    public static void cinzaGreen(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int verde = aux.getGreen();
                Color aux1 = new Color(verde, verde, verde);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }
    public static void cinzaBlue(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int azul = aux.getBlue();
                Color aux1 = new Color(azul, azul, azul);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }

    public static void negativo(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int vermelho = aux.getRed();
                int verde = aux.getGreen();
                int azul = aux.getBlue();
                Color aux1 = new Color(255 - vermelho, 255 - verde, 255 - azul);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }
    public static void tonalidadeBanda(BufferedImage image, int valor, String banda) throws IOException {
        if (banda.equalsIgnoreCase("vermelho")) {
            for (int i = 0; i < image.getHeight(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color aux = new Color(image.getRGB(j, i));
                    int soma = aux.getRed() + valor;
                    if (soma > 255) {
                        soma = 255;
                        Color aux1 = new Color(soma, aux.getGreen(), aux.getBlue());
                        image.setRGB(j, i, aux1.getRGB());
                    } else {
                        Color aux1 = new Color(soma, aux.getGreen(), aux.getBlue());
                        image.setRGB(j, i, aux1.getRGB());
                    }
                }
            }
            ImageIO.write(image, "png", new File("imagem.png"));
        }
        if (banda.equalsIgnoreCase("verde")) {
            for (int i = 0; i < image.getHeight(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color aux = new Color(image.getRGB(j, i));
                    int soma = aux.getGreen() + valor;
                    if(soma > 255) {
                        soma =255;
                        Color aux1 = new Color(aux.getRed(), soma, aux.getBlue());
                        image.setRGB(j, i, aux1.getRGB());
                    } else {
                        Color aux1 = new Color(aux.getRed(), soma, aux.getBlue());
                        image.setRGB(j, i, aux1.getRGB());
                    }
                }
            }
            ImageIO.write(image, "png", new File("imagem.png"));
        }
        if (banda.equalsIgnoreCase("azul")) {
            for (int i = 0; i < image.getHeight(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color aux = new Color(image.getRGB(j, i));
                    int soma = aux.getBlue() + valor;
                    if (soma > 255) {
                        soma = 255;
                        Color aux1 = new Color(aux.getRed(), aux.getGreen(), soma);
                        image.setRGB(j, i, aux1.getRGB());
                    } else {
                        Color aux1 = new Color(aux.getRed(), aux.getGreen(), soma);
                        image.setRGB(j, i, aux1.getRGB());
                    }
                }
            }
            ImageIO.write(image, "png", new File("imagem.png"));
        }
    }
    public static void limiarizacao(BufferedImage image) throws IOException {
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int vermelho = aux.getRed();
                int verde = aux.getGreen();
                int azul = aux.getBlue();
                int limiar = (vermelho + verde + azul) / 3;

                Color aux1 = new Color(0, 0, 0);
                Color aux2 = new Color(255, 255, 255);
                if (limiar > 128) {
                    image.setRGB(j, i, aux1.getRGB());
                }
                if(limiar <=128){
                    image.setRGB(j, i, aux2.getRGB());
                }
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));

    }
    public static void brilhoAditivo(BufferedImage image, int valor)throws IOException{

        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                int somaRed = aux.getRed() + valor;
                int somaGreen = aux.getGreen() + valor;
                int somaBlue = aux.getBlue() + valor;
                if(somaRed > 255) somaRed = 255;
                if(somaGreen > 255) somaGreen = 255;
                if(somaBlue > 255) somaBlue = 255;
                Color aux1 = new Color(somaRed, somaGreen, somaBlue);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }
    public static void brilhoMultiplicativo(BufferedImage image, Double valor)throws IOException{

        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                Color aux = new Color(image.getRGB(j, i));
                double multiRed = aux.getRed() * valor;
                double multiGreen = aux.getGreen() * valor;
                double multiBlue = aux.getBlue() * valor;
                if(multiRed > 255) multiRed = 255.0;
                if(multiGreen > 255) multiGreen = 255.0;
                if(multiBlue > 255) multiBlue = 255.0;
                if(multiRed < 0) multiRed = 0.0;
                if(multiGreen < 0) multiGreen = 0.0;
                if(multiBlue < 0) multiBlue = 0.0;
                Color aux1 = new Color ((int) multiRed,(int) multiGreen, (int) multiBlue);
                image.setRGB(j, i, aux1.getRGB());
            }
        }
        ImageIO.write(image, "png", new File("imagem.png"));
    }



    public void media3x3(BufferedImage img) throws IOException {

        BufferedImage imgSaida = img.getSubimage(0, 0, img.getHeight(), img.getWidth());

        final int altura = img.getHeight();

        final int largura = img.getWidth();

        int[] valoresPixel = new int[9];



        for (int i = 1; i < altura-1; i++) {

            for (int j = 1; j < largura-1; j++) {

                int aux = -1;

                for (int y = i - 1; y <= i+1; y++) {

                    for (int x = j - 1; x <= j+1; x++) {

                        valoresPixel[++aux] = new Color(img.getRGB(x, y)).getRed();

                    }

                }

                int media = (Arrays.stream(valoresPixel).sum())/9;
                int[] arrayOrdenado = Arrays.stream(valoresPixel).sorted().toArray();
                // int mediana = arrayOrdenado.length/2;
                int mediana = arrayOrdenado[4];
                Color auxVermelho = new Color(media, media, media);

                imgSaida.setRGB(j, i, auxVermelho.getRGB());

            }



            ImageIO.write(imgSaida, "png", new File("img3x3.png"));

        }

    }
    public void mediaKern(BufferedImage image,double[] kernel) throws IOException {
        BufferedImage imagemSaida = image.getSubimage(0,0,image.getWidth(),image.getHeight());
        final int altura = image.getHeight();
        final int largura = image.getWidth();
        int[] valoresPixels = new int[9];
        for(int j = 1;j < altura-1;j++){
            for(int i = 1;i < largura-1;i++){
                int cont = -1;
                for(int y = i-1;y <= i +1;y++){
                    for(int x= j -1; x <=j + 1;x++){
                        valoresPixels[++cont] = new Color(image.getRGB(x,y)).getRed();
                    }
                }

            }
        }
        int soma = 0;
        for(int j = 1;j < altura - 1;j++){
            for(int i = 1;i < largura - 1; i++){
                for(int k = 0; k < 9;k++){
                    soma += (int) (valoresPixels[k] * kernel[k]);
                }
                int media = Arrays.stream(valoresPixels).sum()/valoresPixels.length;

                int[] arrayOrdenado = Arrays.stream(valoresPixels).sorted().toArray();
                int mediana = arrayOrdenado[valoresPixels.length/2];
                Color novaCor = new Color(soma,soma,soma);
                image.setRGB(j,i,novaCor.getRGB());
            }
        }
        ImageIO.write(image,"png", new File("imagem.png"));
    }

    public void mediaArray(int[] valores){
        int total = Arrays.stream(valores).sum();
        int valor = total / valores.length;

        System.out.println(valor);
    }
    public void medianaArray (int[] valores){
        Arrays.sort(valores);
        int numero =  valores[valores.length/2];

        System.out.println(numero);

    }
    public void histograma(BufferedImage img) throws IOException {
        int[] valores = new int[256];
        final int altura = img.getHeight();
        final int largura = img.getWidth();

        double soma = 0;
        int qtdPixeis = altura * largura;

        int menor = 9999999;
        int maior = 0;

        for (int x = 0; x < altura; x++) {
            for (int y = 0; y < largura; y++) {
                Color aux = new Color(img.getRGB(y, x));
                int vermelho = aux.getRed();
                valores[vermelho]++;

                if (vermelho > maior) {
                    maior = vermelho;
                }
                if (vermelho < menor) {
                    menor = vermelho;
                }
            }
        }

        int moda = 0;
        int ocorrenciasModa = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > ocorrenciasModa) {
                moda = i;
                ocorrenciasModa = valores[i];
            }
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] != 0) {
                System.out.println("Valor " + i + " ocorre " + valores[i] + " vezes.");
            }
        }

        for (int i = 0; i < valores.length; i++) {
            soma += i * valores[i];
        }

        double valorMedio = soma / qtdPixeis;

        System.out.printf("Valor médio: %,.3f\n", valorMedio);
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Total de pixels: " + altura * largura);
        System.out.println("Moda: " + moda);
    }



}