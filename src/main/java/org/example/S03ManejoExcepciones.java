package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class S03ManejoExcepciones {
    public static void main(String[] args) {
        //Establecer la ruta del articulo ChromeDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        //instanciar un objeto de chromeDriver para trabajar con los navegadores y sus porpiedades y elementos del DOM
        //Al typear WebDriver y hacer click se importa automaticamente
        WebDriver driver = new ChromeDriver();

        //Primera Prueba_Navegar a google
        driver.get("https://www.google.com/");

        //Manejo de Excepciones
        try{
           //Codigo donde talvez exista una excepcion
            //Localizar por Xpath
            WebElement botonAcceder = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/at"));
            //Click sobre el boton
            botonAcceder.click();

        }catch(NoSuchElementException ex){  //QUE ES EL NOSUCHEXCEPTION?SIEMPRE SE DEBE IMPORTAR?
            //Capturar un error 1
            System.out.println("El elemento no fue ejecutado :" +ex);
        }catch(TimeoutException ex){
            //Capturar un error 1
            System.out.println("El elemento no fue encontrado por el tiempo" +ex);
        }finally {
            //Ejecutar Proceso
            //Cerrar el navegador
            driver.quit();
        }


    }
}
