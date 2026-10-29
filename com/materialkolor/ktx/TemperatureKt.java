package com.materialkolor.ktx;

import p000.ti4;
import p000.ui4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class TemperatureKt {
    /* JADX INFO: renamed from: TemperatureCache-8_81llA, reason: not valid java name */
    public static final ui4 m13957TemperatureCache8_81llA(long j) {
        return new ui4(HctKt.m13950toHct8_81llA(j));
    }

    /* JADX INFO: renamed from: isCool-8_81llA, reason: not valid java name */
    public static final boolean m13958isCool8_81llA(long j) {
        return m13960temperature4WTKRHQ(ui4.f31895f, j) < 0.0d;
    }

    /* JADX INFO: renamed from: isWarm-8_81llA, reason: not valid java name */
    public static final boolean m13959isWarm8_81llA(long j) {
        return m13960temperature4WTKRHQ(ui4.f31895f, j) > 0.0d;
    }

    /* JADX INFO: renamed from: temperature-4WTKRHQ, reason: not valid java name */
    public static final double m13960temperature4WTKRHQ(ti4 ti4Var, long j) {
        return ti4.m11059a(HctKt.m13950toHct8_81llA(j));
    }
}
