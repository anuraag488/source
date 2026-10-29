package com.materialkolor.ktx;

import p000.cn0;
import p000.rv1;
import p000.sc6;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ContrastKt {
    /* JADX INFO: renamed from: contrastRatio--OWjLjI, reason: not valid java name */
    public static final double m13931contrastRatioOWjLjI(long j, long j2) {
        double[] dArrM10662d0 = sc6.m10662d0(zy5.m13858V(j));
        double[] dArrM10662d1 = sc6.m10662d0(zy5.m13858V(j2));
        double d = dArrM10662d0[1];
        double d2 = dArrM10662d1[1];
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    /* JADX INFO: renamed from: hasEnoughContrast-jxsXWHM, reason: not valid java name */
    public static final boolean m13932hasEnoughContrastjxsXWHM(long j, long j2, cn0 cn0Var) {
        return Double.compare(m13931contrastRatioOWjLjI(j, j2), cn0Var.f16135a) >= 0;
    }

    /* JADX INFO: renamed from: hasEnoughContrast-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ boolean m13933hasEnoughContrastjxsXWHM$default(long j, long j2, cn0 cn0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            cn0Var = cn0.WCAG_AA_NORMAL_TEXT;
        }
        return m13932hasEnoughContrastjxsXWHM(j, j2, cn0Var);
    }

    /* JADX INFO: renamed from: tonalContrastRatio--OWjLjI, reason: not valid java name */
    public static final double m13934tonalContrastRatioOWjLjI(long j, long j2) {
        rv1 rv1VarM13950toHct8_81llA = HctKt.m13950toHct8_81llA(j);
        rv1 rv1VarM13950toHct8_81llA2 = HctKt.m13950toHct8_81llA(j2);
        double d = rv1VarM13950toHct8_81llA.f29663d;
        double d2 = rv1VarM13950toHct8_81llA2.f29663d;
        double dM10664e0 = sc6.m10664e0(d);
        double dM10664e1 = sc6.m10664e0(d2);
        double dMax = Math.max(dM10664e0, dM10664e1);
        if (dMax != dM10664e1) {
            dM10664e0 = dM10664e1;
        }
        return (dMax + 5.0d) / (dM10664e0 + 5.0d);
    }
}
