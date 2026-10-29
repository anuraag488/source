package com.materialkolor.ktx;

import java.util.HashMap;
import p000.d24;
import p000.n41;
import p000.o41;
import p000.pc0;
import p000.rv1;
import p000.sc6;
import p000.y41;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class DynamicColorKt {
    public static final long getColor(o41 o41Var, y41 y41Var) {
        n41 n41Var = o41Var.f26329j;
        HashMap map = o41Var.f26330k;
        rv1 rv1VarMo4459e = (rv1) map.get(y41Var);
        if (rv1VarMo4459e == null) {
            rv1VarMo4459e = (y41Var.f34857l == pc0.f27519d ? d24.f16744b : d24.f16743a).mo4459e(o41Var, y41Var);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(y41Var, rv1VarMo4459e);
        }
        int iM10675p = rv1VarMo4459e.f29660a;
        Double d = n41Var != null ? (Double) n41Var.invoke(y41Var) : null;
        if (n41Var != null && d != null) {
            iM10675p = (iM10675p & 16777215) | (sc6.m10675p((int) Math.rint(d.doubleValue() * 255.0d), 0, 255) << 24);
        }
        return zy5.m13869d(iM10675p);
    }
}
