/**
 *@author Francesco Tornese 5inf
 *@version 1.0.0
 *@since 10/05/2023
 */



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;

public class testEAN13 {
    private static EAN13 ean;
    public void init(){
        ean = new EAN13();
    }

    public static void testEanVerificaCodiceValido(){
        assertArrayEquals(null, null, null, 0);

    }

    public static void testEanVerificaCodiceNonValido(){
        assertNotEquals(null, 0, 0, 0);
        

    }

    public static void testEanVerificaCodiceLunghezzaNonValida(){
        assertEquals(null, 0, 0, 0);

    }

    public static void  testEanVerificaCodiceVuoto(){
        assertThrows(null, null, null);

    }

}
