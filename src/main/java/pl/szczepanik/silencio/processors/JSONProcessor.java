package pl.szczepanik.silencio.processors;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import pl.szczepanik.silencio.api.Format;
import pl.szczepanik.silencio.core.ProcessorException;
import pl.szczepanik.silencio.processors.visitors.JSONVisitor;

/**
 * Provides processor that supports JSON format.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class JSONProcessor extends AbstractProcessor {

    private final ObjectMapper mapper;

    private Map<String, Object> jsonStructure;

    private final JSONVisitor visitor = new JSONVisitor();

    /**
     * Creates new processor for JSON file.
     */
    public JSONProcessor() {
        super(Format.JSON);
        mapper = new ObjectMapper();
        // this prevents printing eg. 2.20 as 2.2
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
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
