package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hv3 implements mq1 {

    /* JADX INFO: renamed from: b */
    public static final hv3 f20891b = new hv3(0);

    /* JADX INFO: renamed from: c */
    public static final hv3 f20892c = new hv3(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20893a;

    public /* synthetic */ hv3(byte b) {
        this.f20893a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        String str;
        iq1 iq1Var;
        switch (this.f20893a) {
            case 0:
                long j = ((pb0) obj2).f27503a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(zy5.m13858V(j));
            default:
                C1353y2 c1353y2 = (C1353y2) obj;
                C1353y2 c1353y3 = (C1353y2) obj2;
                if (c1353y2 == null || (str = c1353y2.f34817a) == null) {
                    str = c1353y3.f34817a;
                }
                if (c1353y2 == null || (iq1Var = c1353y2.f34818b) == null) {
                    iq1Var = c1353y3.f34818b;
                }
                return new C1353y2(str, iq1Var);
        }
    }
}
