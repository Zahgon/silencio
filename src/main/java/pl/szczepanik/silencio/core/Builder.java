package pl.szczepanik.silencio.core;

import java.util.ArrayList;
import java.util.List;
import pl.szczepanik.silencio.api.Converter;
import pl.szczepanik.silencio.api.Decision;
import pl.szczepanik.silencio.api.Format;
import pl.szczepanik.silencio.api.Processor;
import pl.szczepanik.silencio.converters.BlankConverter;
import pl.szczepanik.silencio.converters.NumberSequenceConverter;
import pl.szczepanik.silencio.decisions.PositiveDecision;
import pl.szczepanik.silencio.processors.JSONProcessor;
import pl.szczepanik.silencio.processors.PropertiesProcessor;
import pl.szczepanik.silencio.processors.XMLProcessor;
import pl.szczepanik.silencio.processors.YAMLProcessor;

/**
 * Default implementation of class that holds processors.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public final class Builder {

    /**
     * Blank converter that clears value for each key.
     */
    public static final Converter BLANK = new BlankConverter();

    /**
     * NumberSequence converter that changes values into sequential numbers.
     */
    public static final Converter NUMBER_SEQUENCE = new NumberSequenceConverter();

    private final Format format;

    private final List<Execution> executions = new ArrayList<>();

    /**
     * Creates new builder from given format.
     *
     * @param format format for this builder
     */
    public Builder(Format format) {
        this.format = format;
    }

    /**
     * Appends list of decisions and converters into the executions as the new position.
     *
     * @param decisions  decisions for next execution
     * @param converters converters for next execution
     * @return instance of current builder
     */
    public Builder with(Decision[] decisions, Converter[] converters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Appends single decision and converters into the executions as the new position.
     *
     * @param decision   decision for next execution
     * @param converters converters for next execution
     * @return instance of current builder
     */
    public Builder with(Decision decision, Converter... converters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Appends single decision and converter into the executions as the new position.
     *
     * @param decision  decision for next execution
     * @param converter converter for next execution
     * @return instance of current builder
     */
    public Builder with(Decision decision, Converter converter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Appends converters into the executions as the new position.
     *
     * @param converters converters for next execution
     * @return instance of current builder
     */
    public Builder with(Converter... converters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Appends single converter into the executions as the new position.
     *
     * @param converter converter for next execution
     * @return instance of current builder
     */
    public Builder with(Converter converter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builds the processor based on passed values.
     *
     * @return created processor
     */
    public Processor build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Removes all decisions and converters from this builder.
     */
    public void clearExecutions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
