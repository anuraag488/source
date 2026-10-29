package p000;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lr6 extends dp5 {

    /* JADX INFO: renamed from: c */
    public yn5 f24319c;

    /* JADX INFO: renamed from: d */
    public HashMap f24320d;

    @Override // p000.dp5
    /* JADX INFO: renamed from: f */
    public final aq5 mo4517f(r36 r36Var, List list) {
        aq5 aq5Var;
        w76.m12154a("require", 1, list);
        String strMo3117h = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(0)).mo3117h();
        HashMap map = this.f24320d;
        if (map.containsKey(strMo3117h)) {
            return (aq5) map.get(strMo3117h);
        }
        HashMap map2 = this.f24319c.f35372a;
        if (map2.containsKey(strMo3117h)) {
            try {
                aq5Var = (aq5) ((Callable) map2.get(strMo3117h)).call();
            } catch (Exception unused) {
                C1077qn.m9989o("Failed to create API implementation: ".concat(String.valueOf(strMo3117h)));
                return null;
            }
        } else {
            aq5Var = aq5.f14781np;
        }
        if (aq5Var instanceof dp5) {
            map.put(strMo3117h, (dp5) aq5Var);
        }
        return aq5Var;
    }
}
