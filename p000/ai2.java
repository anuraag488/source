package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14521a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ di2 f14522b;

    public /* synthetic */ ai2(byte b) {
        this.f14521a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f14521a;
        int i = 0;
        di2 di2Var = this.f14522b;
        switch (b) {
            case 0:
                hi2 hi2Var = (hi2) di2Var.f17075o.invoke();
                int iM6409c = hi2Var.m6409c();
                while (i < iM6409c) {
                    if (hi2Var.m6410d(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                hi2 hi2Var2 = (hi2) di2Var.f17075o.invoke();
                if (iIntValue < 0 || iIntValue >= hi2Var2.m6409c()) {
                    t32.m10968a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + hi2Var2.m6409c() + ")");
                }
                lb5.m7910S(di2Var.m8391C0(), null, null, new ci2(di2Var, iIntValue, null, (byte) 0), 3);
                return Boolean.TRUE;
        }
    }
}
