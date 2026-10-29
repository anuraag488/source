package p000;

import ads_mobile_sdk.t24;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface uh5 {
    static {
        cm3 cm3Var = hg5.f20568a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    static Object m11552a(uh5 uh5Var, ym0 ym0Var) {
        t24 t24Var;
        C1283w7 c1283w7M4045a;
        if (ym0Var instanceof t24) {
            t24Var = (t24) ym0Var;
            int i = t24Var.f11854c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t24Var.f11854c = i - Integer.MIN_VALUE;
            } else {
                t24Var = new t24(uh5Var, ym0Var);
            }
        } else {
            t24Var = new t24(uh5Var, ym0Var);
        }
        Object objMo2694a = t24Var.f11852a;
        ap0 ap0Var = ap0.f14763a;
        int i2 = t24Var.f11854c;
        if (i2 == 0) {
            k43.m7376J(objMo2694a);
            t24Var.f11854c = 1;
            objMo2694a = uh5Var.mo2694a();
            if (objMo2694a == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objMo2694a);
        }
        String str = (String) objMo2694a;
        if (str == null || (c1283w7M4045a = cm3.m4045a(hg5.f20568a, str)) == null) {
            return null;
        }
        return (String) ((hq2) c1283w7M4045a.m12120G()).get(1);
    }

    /* JADX INFO: renamed from: a */
    Object mo2637a(ym0 ym0Var);

    /* JADX INFO: renamed from: b */
    Object mo2638b(ym0 ym0Var);

    /* JADX INFO: renamed from: a */
    default Object mo2694a() {
        return null;
    }
}
