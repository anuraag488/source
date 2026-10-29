package com.materialkolor.ktx;

import p000.ir1;
import p000.jq2;
import p000.ki0;
import p000.kq2;
import p000.mi0;
import p000.w41;
import p000.y41;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialDynamicColorsKt {
    public static final kq2 getColors(w41 w41Var, mi0 mi0Var, int i) {
        y41 y41VarM12073c = w41Var.m12073c(mi0Var);
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(y41VarM12073c);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            ((Boolean) w41Var.f33078d.getValue()).booleanValue();
            objM6869O = new kq2();
            ir1Var.m6905n0(objM6869O);
        }
        return (kq2) objM6869O;
    }

    public static final jq2 getM3Colors(w41 w41Var, mi0 mi0Var, int i) {
        y41 y41VarM12073c = w41Var.m12073c(mi0Var);
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(y41VarM12073c);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new jq2();
            ir1Var.m6905n0(objM6869O);
        }
        return (jq2) objM6869O;
    }
}
