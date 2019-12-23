package com.gradletdd.gradletdd.matchers;

import java.time.LocalDate;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

/**
 * DataDiferencaDiasMatcher
 */
public class DataDiferencaDiasMatcher extends TypeSafeMatcher<LocalDate> {

    private Integer qtdDias;

    public DataDiferencaDiasMatcher(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }

    @Override
    public void describeTo(Description description) {
    }

    @Override
    protected boolean matchesSafely(LocalDate date) {
        return date.isEqual(LocalDate.now().plusDays(qtdDias));
    }

}