package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface zq2 extends s62 {
    /* JADX INFO: renamed from: T */
    yq2 mo3578T(int i, int i2, Map map, yp1 yp1Var, yp1 yp1Var2);

    /* JADX INFO: renamed from: l0 */
    default yq2 mo3583l0(int i, int i2, Map map, yp1 yp1Var) {
        return mo3578T(i, i2, map, null, yp1Var);
    }
}
