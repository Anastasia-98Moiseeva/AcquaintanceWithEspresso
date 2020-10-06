package com.example.espresso;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Тест для классса {@link MainActivity}
 *
 * @author Moiseeva Anastasia on 06.10.2020
 */
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityRule = new ActivityScenarioRule<>(
            MainActivity.class);

    @Test
    public void onCreate() {
        String someText = "Some text";
        onView(withId(R.id.enter_edit_text)).perform(typeText(someText));
        onView(withId(R.id.set_text_button)).perform(click());
        onView(withId(R.id.entered_text_view)).check(matches(withText(someText)));
    }
}