package com.acesounderglass.testdriventutorial;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

/**
 * Created by elvan on 5/11/2015.
 */
public class ActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity activity;

    public ActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    // This should always pass
    public void testTrue() {
        assertTrue(true);
    }

    // This one you need to edit the test to pass
//    public void testFalse() {
//        assertTrue(false);
//    }

    public void testButtonExists() {
        View view = activity.findViewById(R.id.button);
        assertNotNull("Button does not exist", view);
    }

    // This test won't even compile until you fix it
//    public void testCantCompile() {
//        View view = activity.findViewById(R.id.button2);
//        assertNotNull("Button does not exist", view);
//    }

    // Fix this one by changing the activity_main.xml file.
    // If all you see is the GUI, move from the design tab to the text tab

    public void testText1Exists() {
        View view = activity.findViewById(R.id.text1);
        assertNotNull("Text1 does not exist", view);
    }

    // Fix this one by adding to activity_main.xml
//    public void testText2Exists() {
//        View view = activity.findViewById(R.id.text1);
//        assertNotNull("Text1 does not exist", view);
//
//        view = activity.findViewById(R.id.text2);
//        assertNotNull("Text2 does not exist", view);
//    }
}
