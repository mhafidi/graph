package com.graph.com;
/**
 * This Interface describes the behaviour of a graph: as defined in wikipedia:
 * A graph in this context is made up of vertices (also called nodes or points)
 * which are connected by edges (also called links or lines).
 * A distinction is made between undirected graphs, where edges link
 * two vertices symmetrically, and directed graphs, where edges link two vertices asymmetrically;
 * see Graph (discrete mathematics) for more detailed definitions and for other variations
 * in the types of graph that are commonly considered. Graphs are one of the prime objects of
 * study in discrete mathematics.
 * Refer to the glossary of graph theory for basic definitions in graph theory.<p>
 * <p>
 * <p>
 * Fields:
 * - <tt>Vertices: which is a set of vertices in other word no duplication is accepted</tt>
 * - <tt>edges: which is a set of edges no duplication is accepted whether directed
 * or undirected graph </tt>
 * - <tt></tt>
 * Methods:
 * - <tt>[boolean] addVertex if the vertex exists already returns false else returns true</tt>
 * - <tt>[boolean] addEdge if the edge exists already returns false else returns true</tt>
 * - <tt>[Set<Vertex>] getVertices returns empty Set </tt>
 * - <tt>[Set<Edge>] getEdges returns empty Set </tt>
 * <p>
 * </p>
 * <p>
 * This interface is a member of the
 * <a href="doesn't exist yet">
 * MHI Graph Theory Framework/a>.
 *
 * @author mhafidi
 * @see com.graph.com.IGraph
 * @since 1.1
 */

public interface IGraph<T>
{
    boolean addEdge(IEdge<T> aInEdge);







}
