package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S04InteraccionesBasicas {
    public static void main(String[] args) {
        //Establecer la ruta del articulo ChromeDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        //instanciar un objeto de chromeDriver para trabajar con los navegadores y sus porpiedades y elementos del DOM
        //Al typear WebDriver y hacer click se importa automaticamente
        WebDriver driver = new ChromeDriver();
        //Primera Prueba_Navegar a google
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        //Maximizar la ventana en este caso porque si no nos sale un expection en la consola ya que con la pantalla miniizada no esta ejecutando el "search"
        driver.manage().window().maximize();

        //Localizar input mediante name
        WebElement InputBuscar = driver.findElement(By.name("search"));
        // Ingresar texto a buscar
        InputBuscar.sendKeys("Bolivia");
        //Hacer Enter
        InputBuscar.submit();
    }
}