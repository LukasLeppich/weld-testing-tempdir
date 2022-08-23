package example.pkg;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;

import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.jboss.weld.junit5.auto.ExcludeBeanClasses;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import jakarta.inject.Inject;

@EnableAutoWeld
// @ExcludeBeanClasses(File.class)
public class BeanTest {
    @Inject
    Bean bean;

    @Test
    void testWithoutTempDir() {
        assertNotNull(bean);
    }

    @Test
    void testWithTempDir(@TempDir File tempDir) {
        assertNotNull(bean);
        assertNotNull(tempDir);
    }
}
