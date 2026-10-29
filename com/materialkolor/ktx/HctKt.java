package com.materialkolor.ktx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.ib0;
import p000.pb0;
import p000.qv1;
import p000.rv1;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class HctKt {
    /* JADX INFO: renamed from: from-4WTKRHQ, reason: not valid java name */
    public static final rv1 m13949from4WTKRHQ(qv1 qv1Var, long j) {
        return new rv1(zy5.m13858V(j));
    }

    public static final long toColor(rv1 rv1Var) {
        return zy5.m13869d(rv1Var.f29660a);
    }

    public static final List<pb0> toColors(List<rv1> list) {
        List<rv1> list2 = list;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(pb0.m9462a(toColor((rv1) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: toHct-8_81llA, reason: not valid java name */
    public static final rv1 m13950toHct8_81llA(long j) {
        return m13949from4WTKRHQ(rv1.f29659e, j);
    }

    public static final List<rv1> toHcts(List<pb0> list) {
        List<pb0> list2 = list;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m13950toHct8_81llA(((pb0) it.next()).f27503a));
        }
        return arrayList;
    }
}
