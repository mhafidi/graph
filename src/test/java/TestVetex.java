import com.graph.Vertex;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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

}
