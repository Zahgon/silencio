package pl.szczepanik.silencio.diagnostics;

import pl.szczepanik.silencio.api.Converter;
import pl.szczepanik.silencio.core.Key;
import pl.szczepanik.silencio.core.Value;

/**
 * Diagnostic converter that returns new instance of {@link Value} object created from passed key.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public final class KeyValueConverter implements Converter {

    // Limits the access only to diagnostic package.
    KeyValueConverter() {
    }

    @Override
    public Value convert(Key key, Value value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void init() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
