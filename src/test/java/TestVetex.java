import com.graph.com.org.Vertex;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;

public class TestVetex
{

    private static final String TOKYO = "Tokyo";
    private static final String MARRAKECH = "Marrakech";

    @Test
    public void testVertexCreation()
    {

        Vertex<String> tokyo = new Vertex<String>(TOKYO);
        Vertex<String> marrakesh= new Vertex<String>(MARRAKECH);

        assertEquals(TOKYO,tokyo.getName());
        assertEquals(MARRAKECH,marrakesh.getName());

    }

    @Test
    public void testVertexNotEqual()
    {

        Vertex<String> tokyo = new Vertex<String>(TOKYO);
        Vertex<String> marrakesh= new Vertex<String>(MARRAKECH);

        assertNotSame(tokyo,marrakesh);
    }
    @Test
    public void testVerteciesEqual()
    {
        Vertex<String> marrakesh= new Vertex<String>(MARRAKECH);
        Vertex<String> essaouira= new Vertex<String>(MARRAKECH);

        assertEquals(marrakesh,essaouira);
    }
}
