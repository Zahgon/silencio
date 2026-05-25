package pl.szczepanik.silencio.processors;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import pl.szczepanik.silencio.api.Format;
import pl.szczepanik.silencio.core.ProcessorException;
import pl.szczepanik.silencio.processors.visitors.PropertiesVisitor;

/**
 * Provides processor that supports Properties format.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class PropertiesProcessor extends AbstractProcessor {

    private final Properties properties = new Properties();

    private final PropertiesVisitor visitor = new PropertiesVisitor();

    /**
     * Creates new processor for properties file.
     */
    public PropertiesProcessor() {
        super(Format.PROPERTIES);
    }

    @Override
    public void realLoad(Reader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void realProcess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void realWrite(Writer writer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
