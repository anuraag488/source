package com.materialkolor.ktx;

import p000.mn4;
import p000.on4;
import p000.rv1;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class TonalPaletteKt {
    public static final on4 from(mn4 mn4Var, int i) {
        rv1 rv1Var = new rv1(i);
        return new on4(rv1Var.f29661b, rv1Var.f29662c, rv1Var);
    }

    /* JADX INFO: renamed from: from-4WTKRHQ, reason: not valid java name */
    public static final on4 m13961from4WTKRHQ(mn4 mn4Var, long j) {
        return from(mn4Var, zy5.m13858V(j));
    }

    public static final long toneColor(on4 on4Var, int i) {
        return zy5.m13869d(on4Var.m9192b(i));
    }

    public static final on4 from(mn4 mn4Var, rv1 rv1Var) {
        return new on4(rv1Var.f29661b, rv1Var.f29662c, rv1Var);
    }
}
