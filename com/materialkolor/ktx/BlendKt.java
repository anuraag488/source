package com.materialkolor.ktx;

import p000.AbstractC1356y5;
import p000.n00;
import p000.qs5;
import p000.sc6;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class BlendKt {
    /* JADX INFO: renamed from: blend-IbeAmgk, reason: not valid java name */
    public static final long m13913blendIbeAmgk(n00 n00Var, long j, long j2, float f) {
        return zy5.m13869d(n00.m8473a(f, zy5.m13858V(j), zy5.m13858V(j2)));
    }

    /* JADX INFO: renamed from: blend-jxsXWHM, reason: not valid java name */
    public static final long m13914blendjxsXWHM(long j, long j2, float f) {
        return m13913blendIbeAmgk(n00.f25354a, j, j2, f);
    }

    /* JADX INFO: renamed from: blend-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ long m13915blendjxsXWHM$default(long j, long j2, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return m13914blendjxsXWHM(j, j2, f);
    }

    /* JADX INFO: renamed from: blendHue-IbeAmgk, reason: not valid java name */
    public static final long m13916blendHueIbeAmgk(n00 n00Var, long j, long j2, float f) {
        int iM13858V = zy5.m13858V(j);
        int iM12899H = AbstractC1356y5.m12899H(qs5.m10120y(n00.m8473a(f, iM13858V, zy5.m13858V(j2))).f29040a, qs5.m10120y(iM13858V).f29041b, sc6.m10642N(iM13858V));
        qs5.m10120y(iM12899H);
        sc6.m10642N(iM12899H);
        return zy5.m13869d(iM12899H);
    }

    /* JADX INFO: renamed from: blendHue-jxsXWHM, reason: not valid java name */
    public static final long m13917blendHuejxsXWHM(long j, long j2, float f) {
        return m13916blendHueIbeAmgk(n00.f25354a, j, j2, f);
    }

    /* JADX INFO: renamed from: blendHue-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ long m13918blendHuejxsXWHM$default(long j, long j2, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return m13917blendHuejxsXWHM(j, j2, f);
    }
}
