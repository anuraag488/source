package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mn4 {
    /* JADX INFO: renamed from: a */
    public static on4 m8363a(double d, double d2) {
        rv1 rv1Var;
        nn4 nn4Var = new nn4();
        nn4Var.f25969a = d;
        nn4Var.f25970b = d2;
        nn4Var.f25971c = new HashMap();
        VarHandle.storeStoreFence();
        int i = 100;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = nn4Var.m8802a(i3) < nn4Var.m8802a(i4);
            if (nn4Var.m8802a(i3) >= nn4Var.f25970b - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        rv1Var = new rv1(AbstractC1356y5.m12899H(nn4Var.f25969a, nn4Var.f25970b, i2));
                        return new on4(d, d2, rv1Var);
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        rv1Var = new rv1(AbstractC1356y5.m12899H(nn4Var.f25969a, nn4Var.f25970b, i2));
        return new on4(d, d2, rv1Var);
    }
}
