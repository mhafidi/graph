import com.graph.com.org.Edge;
import com.graph.com.org.EdgeException;
import com.graph.com.org.Sens;
import com.graph.com.org.Vertex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

public class TestEdge
{
    private static final String PARIS = "Paris";
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
    @Test
    public void testEdgeNotEqualUndirectEdge()
    {

        Vertex<String> marrakesh= new Vertex<String>(MARRAKESH);
        Vertex<String> berlin= new Vertex<String>(BERLIN);
        Vertex<String> paris= new Vertex<String>(PARIS);

        try
        {
            Edge<String> marrakeshToBerlin=new Edge<String>(marrakesh,berlin,0.0,
                    false,false, Sens.undirected);
            Edge<String> marrakeshToCasablanca=new Edge<String>(marrakesh,paris,0.0,
                    false,false, Sens.undirected);
            assertNotSame(marrakeshToBerlin,marrakeshToCasablanca);
        }
        catch (EdgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
