import com.graph.Edge;
import com.graph.EdgeException;
import com.graph.Sens;
import com.graph.Vertex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEdge
{
    final String MARRAKESH="Marrakech";
    final String BERLIN="Berlin";

    @Test
    public void testEdgeConstructionWithoutException()
    {

        Vertex<String> marrakesh= new Vertex<String>(MARRAKESH);
        Vertex<String> berlin= new Vertex<String>(BERLIN);

        try
        {
            Edge<String> marrakeshToBerlin=new Edge<String>(marrakesh,berlin,0.0,
                    false,false, Sens.undirected);
            assertNotNull(marrakeshToBerlin);
        }
        catch (EdgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Test(expected = EdgeException.class)
    public void testEdgeConstructionWithException() throws EdgeException
    {

        Vertex<String> marrakesh= new Vertex<String>(MARRAKESH);
        Vertex<String> berlin= new Vertex<String>(BERLIN);

        try
        {
            Edge<String> marrakeshToBerlin=new Edge<String>(marrakesh,berlin,0.0,
                    true,false, Sens.undirected);
            assertNotNull(marrakeshToBerlin);
        }
        catch (EdgeException e)
        {
            throw e;
        }
    }
    @Test
    public void testEdgeEqualityUndirectEdge()
    {
        Vertex<String> marrakesh= new Vertex<String>(MARRAKESH);
        Vertex<String> berlin= new Vertex<String>(BERLIN);

        try
        {
            Edge<String> marrakeshToBerlin=new Edge<String>(marrakesh,berlin,0.0,
                    false,false, Sens.undirected);
            Edge<String> berlinToMarrakesh=new Edge<String>(berlin,marrakesh,0.0,
                    false,false, Sens.undirected);
            assertEquals(marrakeshToBerlin,berlinToMarrakesh);
        }
        catch (EdgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
