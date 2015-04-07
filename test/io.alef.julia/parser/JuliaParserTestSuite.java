package io.alef.julia.parser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Taimur el-Halawani
 */
public class JuliaParserTestSuite extends TestCase {
    public static Test suite() {
        final TestSuite testSuite = new TestSuite();
        testSuite.addTestSuite(JuliaParsingTest.class);
        return testSuite;
    }
}
