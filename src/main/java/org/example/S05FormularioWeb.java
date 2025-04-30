package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05FormularioWeb {
    public static void main(String[] args) {
        //Establecer la ruta del articulo ChromeDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        //instanciar un objeto de chromeDriver para trabajar con los navegadores y sus porpiedades y elementos del DOM
        //Al typear WebDriver y hacer click se importa automaticamente
        WebDriver driver = new ChromeDriver();
        //Primera Prueba_Navegar a Wikipedia
        driver.get("https://auth.wikimedia.org/eswiki/wiki/Especial:Crear_una_cuenta");

        //Maximizar la ventana
        driver.manage().window().maximize();

        //Localizar input usuario
        WebElement inputUsuario= driver.findElement(By.id("wpName2"));
        inputUsuario.sendKeys("Laura6755");

        //Localizar input password
        WebElement inputPassword= driver.findElement(By.id("wpPassword2"));
        inputPassword.sendKeys("Password1234");

        //Localizar input para confirmar Password
        WebElement repPassword= driver.findElement(By.id("wpRetype"));
        repPassword.sendKeys("Password1234");

    }
}