package com.gradletdd.gradletdd.matchers;

import java.time.DayOfWeek;

/**
 * MainCoreMatcher
 */
public class MainCoreMatcher {

    public static DiaSemanaMatcher caiEm(Integer diaSemana) {
        return new DiaSemanaMatcher(diaSemana);
    }

    public static DiaSemanaMatcher caiNumaSegunda() {
        return new DiaSemanaMatcher(DayOfWeek.MONDAY.getValue());
    }

    public static DataDiferencaDiasMatcher ehHojeComDiferencaDeDias(Integer qtdDias) {
        return new DataDiferencaDiasMatcher(qtdDias);
    }

    public static DataDiferencaDiasMatcher ehHoje() { 
        return new DataDiferencaDiasMatcher(0);
    }
    
}