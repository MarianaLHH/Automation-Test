package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class S01Locators {
    public static void main(String[] args) {
        //Establecer la ruta del articulo ChromeDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        //instanciar un objeto de chromeDriver para trabajar con los navegadores y sus porpiedades y elementos del DOM
        //Al typear WebDriver y hacer click se importa automaticamente
        WebDriver driver=new ChromeDriver();
        //Primera Prueba_Navegar a google
        driver.get("https://www.google.com/");

        //PRIMERA MANERA :Localizando el campopara buscar en este caso por su  name
        //WebElement searchInput= driver.findElement(By.name("q"));
        //SEGUNDA MANERA:  Localizando el campopara buscar en este caso por su  xpath
        //WebElement searchInput= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        //TERCERA  MANERA:  Localizando el campo para buscar en este caso por CSS SELECTOR
        //WebElement searchInput= driver.findElement(By.cssSelector("#APjFqb"));

        //CUARTA  MANERA:  Localizando el campo para buscar en este caso por By.ID
        //WebElement searchInput= driver.findElement(By.id("APjFqb"));

        //QUINTA  MANERA:  Localizando el campo para buscar en este caso por la clase
        WebElement searchInput= driver.findElement(By.className("gLFyfS"));

        //Escribir un texto para buscar
        searchInput.sendKeys("Historia de Bolivia"); //metodo->sendkeys
        //Presionar Enter
        searchInput.submit();

        //RECOMENDACION BUSCAR EN ESE ORDEN
        //1.- Primero buscar por ID
        //2.- localizar por name
        //3.-Localizar por xpath

    }
}