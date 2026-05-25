package pl.szczepanik.silencio.processors.visitors;

import java.util.Properties;
import pl.szczepanik.silencio.core.Key;
import pl.szczepanik.silencio.core.Value;

/**
 * Iterates over Properties nodes and calls {@link #processValue(Key, Object)} for each basic node.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class PropertiesVisitor extends AbstractVisitor {

    /**
     * Process passed properties and iterates over each node.
     *
     * @param properties
     *            properties to process
     */
    public void process(Properties properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
