package com.example.tadiche.androidtesting

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.tadiche.androidtesting", appContext.packageName)
    }

    @Test fun addtestPass() {
        assertEquals(1 , 3-2)
    }

    @Test fun multestFPass() {
        assertEquals(6 , 3*2)
    }

    @Test fun multestFPass2() {
        assertEquals(6 , 3*2)
    }
}
