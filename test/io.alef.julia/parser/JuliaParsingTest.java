package io.alef.julia.parser;

import com.intellij.testFramework.ParsingTestCase;
import io.alef.julia.JuliaParserDefinition;

public class JuliaParsingTest extends ParsingTestCase {

    public JuliaParsingTest() {
        super("", "jl", new JuliaParserDefinition());
    }


    public void testImmutable() {
        doTest(true);
    }

    public void testTypeAlias() {
        doTest(true);
    }

    public void testInvDivOp() {
        doTest(true);
    }

    public void testIsNotOp() {
        doTest(true);
    }

    public void testStdFunction() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "testData";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }

}
