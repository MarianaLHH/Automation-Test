package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02Eventoclick {
    public static void main(String[] args) {
        //Establecer la ruta del articulo ChromeDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        //instanciar un objeto de chromeDriver para trabajar con los navegadores y sus porpiedades y elementos del DOM
        //Al typear WebDriver y hacer click se importa automaticamente
        WebDriver driver = new ChromeDriver();
        //Primera Prueba_Navegar a google
        driver.get("https://www.google.com/");

        //Localizar por Xpath
        WebElement botonAcceder = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
        //Click sobre el boton
        botonAcceder.click();

        //Cerrar el navegador
        driver.quit();
    }
}