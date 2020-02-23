package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RovarTest {
    String a = null;
    String b = "";
    String c = "abcefghijklmnopqrstuvwxyzåäö";
    String d = "ABCDEFGHIJKLMOPQRSTUVQXYZÅÄÖ";
    String e = "0123456789";
    String f = "!”#€%&/(),.";
    String g = "abc123!?0AGVESH";

    @Test
    void enrov() {
        assertEquals(null, Rovar.enrov(a));
        assertEquals("", Rovar.enrov(b));
        assertEquals("abobcocefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö", Rovar.enrov(c));
        assertEquals("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMOPOPQOQRORSOSTOTUVOVQOQXOXYZOZÅÄÖ", Rovar.enrov(d));
        assertEquals("0123456789",Rovar.enrov(e));
        assertEquals("!”#€%&/(),.", Rovar.enrov(f));
        assertEquals("abobcoc123!?0AGOGVOVESOSHOH", Rovar.enrov(g));
    }

    @Test
    void derov() {
        assertEquals(a, Rovar.derov(null));
        assertEquals(b, Rovar.derov(""));
        assertEquals(c, Rovar.derov("abobcocefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö"));
        assertEquals(d, Rovar.derov("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMOPOPQOQRORSOSTOTUVOVQOQXOXYZOZÅÄÖ"));
        assertEquals(e, Rovar.derov("0123456789"));
        assertEquals(f, Rovar.derov("!”#€%&/(),."));
        assertEquals(g, Rovar.derov("abobcoc123!?0AGOGVOVESOSHOH"));
    }
}