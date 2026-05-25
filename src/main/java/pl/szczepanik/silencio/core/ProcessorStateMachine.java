package pl.szczepanik.silencio.core;

/**
 * State machine for processors.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class ProcessorStateMachine {

    private enum States {

        /**
         * Represent state where processor has been created.
         */
        CREATED,
        /**
         * Represent state where processor has loaded the content.
         */
        LOADED,
        /**
         * Represent state where processor has been processed the content.
         */
        PROCESSED
    }

    private static final String ERROR_MESSAGE = "This operation is not allowed for this state: ";

    /**
     * Information about current state.
     */
    private States state = States.CREATED;

    /**
     * Checks if given operation is allowed.
     *
     * @throws ProcessorException
     *             when operation is not allowed for this processor state
     */
    public void validateProcess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if given operation is allowed.
     *
     * @throws ProcessorException
     *             when operation is not allowed for this processor state
     */
    public void validateWrite() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Changes state into new one.
     */
    public void moveToLoaded() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Changes state into new one.
     */
    public void moveToProcessed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
