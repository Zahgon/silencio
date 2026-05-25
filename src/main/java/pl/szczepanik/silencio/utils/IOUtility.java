package pl.szczepanik.silencio.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import pl.szczepanik.silencio.core.IntegrityException;

/**
 * Class with utility methods.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public final class IOUtility {

    /**
     * Does not allow to create instance of utility class.
     */
    private IOUtility() {
    }

    /**
     * Loads and returns content accessible via given URL.
     *
     * @param url
     *            address to load
     * @return loaded content
     * @throws IntegrityException
     *             when input/output operation fails
     */
    public static String urlToString(URL url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates new {@link java.net.URL}.
     *
     * @param url
     *            address from which the URL should be created
     * @return created URL
     */
    public static URL createURL(String url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
