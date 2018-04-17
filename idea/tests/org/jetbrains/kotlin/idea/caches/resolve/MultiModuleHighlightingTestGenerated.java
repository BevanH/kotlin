/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.caches.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/multiModuleHighlighting/multiplatform")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiModuleHighlightingTestGenerated extends AbstractMultiModuleHighlightingTest {
    public void testAllFilesPresentInMultiplatform() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/multiModuleHighlighting/multiplatform"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("basic")
    public void testBasic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/basic/");
        doTest(fileName);
    }

    @TestMetadata("catchHeaderExceptionInPlatformModule")
    public void testCatchHeaderExceptionInPlatformModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/catchHeaderExceptionInPlatformModule/");
        doTest(fileName);
    }

    @TestMetadata("depends")
    public void testDepends() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/depends/");
        doTest(fileName);
    }

    @TestMetadata("headerClass")
    public void testHeaderClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/headerClass/");
        doTest(fileName);
    }

    @TestMetadata("headerClassImplTypealias")
    public void testHeaderClassImplTypealias() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/headerClassImplTypealias/");
        doTest(fileName);
    }

    @TestMetadata("headerFunUsesStdlibInSignature")
    public void testHeaderFunUsesStdlibInSignature() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/headerFunUsesStdlibInSignature/");
        doTest(fileName);
    }

    @TestMetadata("headerFunctionProperty")
    public void testHeaderFunctionProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/headerFunctionProperty/");
        doTest(fileName);
    }

    @TestMetadata("headerPartiallyImplemented")
    public void testHeaderPartiallyImplemented() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/headerPartiallyImplemented/");
        doTest(fileName);
    }

    @TestMetadata("headerWithoutImplForBoth")
    public void testHeaderWithoutImplForBoth() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/headerWithoutImplForBoth/");
        doTest(fileName);
    }

    @TestMetadata("internal")
    public void testInternal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/internal/");
        doTest(fileName);
    }

    @TestMetadata("nestedClassWithoutImpl")
    public void testNestedClassWithoutImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/nestedClassWithoutImpl/");
        doTest(fileName);
    }

    @TestMetadata("suppressHeaderWithoutImpl")
    public void testSuppressHeaderWithoutImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/suppressHeaderWithoutImpl/");
        doTest(fileName);
    }

    @TestMetadata("transitive")
    public void testTransitive() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/transitive/");
        doTest(fileName);
    }

    @TestMetadata("triangle")
    public void testTriangle() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/triangle/");
        doTest(fileName);
    }

    @TestMetadata("triangleWithDependency")
    public void testTriangleWithDependency() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/triangleWithDependency/");
        doTest(fileName);
    }

    @TestMetadata("useCorrectBuiltInsForCommonModule")
    public void testUseCorrectBuiltInsForCommonModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/useCorrectBuiltInsForCommonModule/");
        doTest(fileName);
    }

    @TestMetadata("withOverrides")
    public void testWithOverrides() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/multiModuleHighlighting/multiplatform/withOverrides/");
        doTest(fileName);
    }
}
