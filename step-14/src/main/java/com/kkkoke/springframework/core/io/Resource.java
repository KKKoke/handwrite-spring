package com.kkkoke.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author KeyCheung
 * @date 2023/05/12
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}