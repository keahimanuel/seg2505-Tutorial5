package com.example.seg2105.labtesting;

import static java.util.regex.Pattern.matches;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest2 {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void emailIsInvalid() {
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("email@"), closeSoftKeyboard());
        onView(withId(R.id.loginBtn)).perform(click());
        onView(withText("Invalid Email")).check(matches(isDisplayed()));
    }
}