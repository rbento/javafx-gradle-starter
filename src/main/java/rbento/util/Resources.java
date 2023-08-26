
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.util;

import java.net.URL;
import java.util.Objects;
import rbento.Program;

public final class Resources {

    private Resources() {}

    public static URL asURL(String resourceName) {
        Objects.requireNonNull(resourceName);
        return Program.class.getResource(resourceName);
    }
}
