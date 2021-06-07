package cs.lab;
import java.util.Scanner;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CSTranslatorTest {
    

    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());   

    @Test
    public void testTranslateApi(){
        CSTranslator otranslator= new CSTranslator();
        Assert.assertEquals(otranslator.translate("Hola"),"Hello");
    }
    @Test(invocationCount = 80, threadPoolSize = 80)
    public void testPoolUsers(){
        CSTranslator otranslator= new CSTranslator();
        Assert.assertEquals(otranslator.translate("Hola"),"Hello");
    }
    @Test
    public void testLessThan500words(){
        CSTranslator otranslator= new CSTranslator();
        Assert.assertEquals(otranslator.translate("Hola"),"Hello");
    }
    @Test
    
    public void testMoreThan500words(){
        CSTranslator otranslator= new CSTranslator();
        Assert.assertEquals(otranslator.translate("Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar. El piso de abajo tiene una cocina muy grande, un comedor con una mesa y seis sillas, un salón con dos sofás verdes, una televisión y cortinas. Además, tiene una pequeña terraza con piscina donde puedo tomar el sol en verano.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar.Mi nueva casa está en una calle ancha que tiene muchos árboles. El piso de arriba de mi casa tiene tres dormitorios y un despacho para trabajar"),"Character Length exceeded");
      
    }

    @Test
    public void testScan(){
        CSTranslator otranslator= new CSTranslator();
        Scanner o = new Scanner("Hola");
        Assert.assertEquals(otranslator.reedAndTranlate(o),"Hello");
    }


    @Test   
    public void testExecutionTime() throws Exception { 
         CSTranslator otranslator= new CSTranslator();
          long begginTime = System.currentTimeMillis(); 
          long maxExecutionTime = 5000;
          String result= otranslator.translate("Hola");
          long finalTime = System.currentTimeMillis(); 
          long executionTime = finalTime - begginTime;
          logger.info(Long.toString(executionTime));
          Assert.assertTrue(executionTime < maxExecutionTime); 
    }
}
