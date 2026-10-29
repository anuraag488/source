package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface ip5 {
    /* JADX INFO: renamed from: b */
    static aq5 m6850b(ip5 ip5Var, sq5 sq5Var, r36 r36Var, ArrayList arrayList) {
        String str = sq5Var.f30510a;
        if (!ip5Var.mo4625e(str)) {
            if ("hasOwnProperty".equals(str)) {
                w76.m12154a("hasOwnProperty", 1, arrayList);
                return ip5Var.mo4625e(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h()) ? aq5.f14786sp : aq5.f14787tp;
            }
            C1077qn.m9987m(zi4.m13620t("Object has no function ", str));
            return null;
        }
        aq5 aq5VarMo4624d = ip5Var.mo4624d(str);
        if (aq5VarMo4624d instanceof dp5) {
            return ((dp5) aq5VarMo4624d).mo4517f(r36Var, arrayList);
        }
        throw new IllegalArgumentException(str + " is not a function");
    }

    /* JADX INFO: renamed from: c */
    void mo4623c(String str, aq5 aq5Var);

    /* JADX INFO: renamed from: d */
    aq5 mo4624d(String str);

    /* JADX INFO: renamed from: e */
    boolean mo4625e(String str);
}
