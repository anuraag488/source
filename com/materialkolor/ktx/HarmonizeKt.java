package com.materialkolor.ktx;

import p000.AbstractC1356y5;
import p000.dc0;
import p000.n00;
import p000.qv1;
import p000.rv1;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class HarmonizeKt {
    /* JADX INFO: renamed from: harmonize-IbeAmgk, reason: not valid java name */
    public static final long m13943harmonizeIbeAmgk(n00 n00Var, long j, long j2, boolean z) {
        if (z) {
            j = ColorKt.m13927matchSaturationOWjLjI(j, j2);
        }
        qv1 qv1Var = rv1.f29659e;
        rv1 rv1VarM13949from4WTKRHQ = HctKt.m13949from4WTKRHQ(qv1Var, j);
        rv1 rv1VarM13949from4WTKRHQ2 = HctKt.m13949from4WTKRHQ(qv1Var, j2);
        double d = rv1VarM13949from4WTKRHQ.f29661b;
        double d2 = rv1VarM13949from4WTKRHQ2.f29661b;
        double dMin = Math.min((180.0d - Math.abs(Math.abs(d - d2) - 180.0d)) * 0.5d, 15.0d);
        double d3 = (d2 - d) % 360.0d;
        if (d3 < 0.0d) {
            d3 += 360.0d;
        }
        double d4 = ((dMin * (d3 <= 180.0d ? 1.0d : -1.0d)) + d) % 360.0d;
        if (d4 < 0.0d) {
            d4 += 360.0d;
        }
        return HctKt.toColor(new rv1(AbstractC1356y5.m12899H(d4, rv1VarM13949from4WTKRHQ.f29662c, rv1VarM13949from4WTKRHQ.f29663d)));
    }

    /* JADX INFO: renamed from: harmonize-IbeAmgk$default, reason: not valid java name */
    public static /* synthetic */ long m13944harmonizeIbeAmgk$default(n00 n00Var, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m13943harmonizeIbeAmgk(n00Var, j, j2, z);
    }

    /* JADX INFO: renamed from: harmonize-jxsXWHM, reason: not valid java name */
    public static final long m13945harmonizejxsXWHM(long j, long j2, boolean z) {
        return m13943harmonizeIbeAmgk(n00.f25354a, j, j2, z);
    }

    /* JADX INFO: renamed from: harmonize-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ long m13946harmonizejxsXWHM$default(long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13945harmonizejxsXWHM(j, j2, z);
    }

    /* JADX INFO: renamed from: harmonizeWithPrimary-bw27NRU, reason: not valid java name */
    public static final long m13947harmonizeWithPrimarybw27NRU(dc0 dc0Var, long j, boolean z) {
        return m13943harmonizeIbeAmgk(n00.f25354a, j, dc0Var.f16940a, z);
    }

    /* JADX INFO: renamed from: harmonizeWithPrimary-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ long m13948harmonizeWithPrimarybw27NRU$default(dc0 dc0Var, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13947harmonizeWithPrimarybw27NRU(dc0Var, j, z);
    }
}
