package com.gradletdd.gradletdd.matchers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

/**
 * DiaSemanaMatcher
 */
public class DiaSemanaMatcher extends TypeSafeMatcher<LocalDate> {

    private Integer diaSemana;

    public DiaSemanaMatcher(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public void describeTo(Description description) {
        DayOfWeek data = DayOfWeek.of(diaSemana);
        String dataExtenso = data.getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        description.appendText(dataExtenso);
    }

    @Override
    protected boolean matchesSafely(LocalDate date) {
        return date.getDayOfWeek().getValue() == diaSemana;
    }
    
}