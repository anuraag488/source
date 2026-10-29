package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nn4 {

    /* JADX INFO: renamed from: a */
    public double f25969a;

    /* JADX INFO: renamed from: b */
    public double f25970b;

    /* JADX INFO: renamed from: c */
    public HashMap f25971c;

    /* JADX INFO: renamed from: a */
    public final double m8802a(int i) {
        HashMap map = this.f25971c;
        Integer numValueOf = Integer.valueOf(i);
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            int iM12899H = AbstractC1356y5.m12899H(this.f25969a, 200.0d, i);
            double d = qs5.m10120y(iM12899H).f29041b;
            sc6.m10642N(iM12899H);
            objValueOf = Double.valueOf(d);
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }
}
