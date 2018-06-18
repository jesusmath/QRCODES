
import java.awt.Color;

import java.awt.Graphics2D;

import java.awt.image.BufferedImage;

import java.io.File;

import java.io.IOException;

import java.util.Hashtable;

import javax.imageio.ImageIO; 

import javafx.application.Application;

import javafx.embed.swing.SwingFXUtils;

import javafx.scene.Scene;

import javafx.scene.image.ImageView;

import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

public class QRcodes extends Application {
@Override
public void start(Stage primaryStage) {

String qrCodeText = "Lucien Meteumba";  

String filePath = "C:\\Users\\Desktop\\JD.png";  

int size = 512;  

String fileType = "png";  

File qrFile = new File(filePath);

System.out.println("QR-CODE Successfully generated!!"); 

image.createGraphics();

Graphics2D graphics = (Graphics2D) image.getGraphics();

graphics.setColor(Color.WHITE);

graphics.fillRect(0, 0, matrixWidth, matrixWidth);

graphics.setColor(Color.BLACK);

for (int i = 0; i < matrixWidth; i++) {

for (int j = 0; j < matrixWidth; j++) {

if (byteMatrix.get(i, j) == 0) {

graphics.fillRect(i, j, 1, 1);

}

}

}
 

}

public static void main(String[] args) {

launch(args);

}
}