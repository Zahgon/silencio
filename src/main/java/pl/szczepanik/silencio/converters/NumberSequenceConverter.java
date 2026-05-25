package pl.szczepanik.silencio.converters;

import java.util.HashMap;
import java.util.Map;
import pl.szczepanik.silencio.api.Converter;
import pl.szczepanik.silencio.core.Key;
import pl.szczepanik.silencio.core.Value;

/**
 * Converter that changes each passed value into number in way that the same passed value has the same number.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class NumberSequenceConverter implements Converter {

    // Reserved for null value
    private static final int NULL_INDEX = 0;

    /**
     * Keeps passed values and corresponding numbers;
     */
    private final Map<Object, Integer> values = new HashMap<>();

    /**
     * Number that can be assigned to new/next passed not indexed value.
     */
    private int availableIndex;

    @Override
    public Value convert(Key key, Value value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void init() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void nextIndex() {
        availableIndex++;
    }
}
