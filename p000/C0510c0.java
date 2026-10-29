package p000;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0510c0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15720a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AbstractC0892m0 f15721b;

    public /* synthetic */ C0510c0(byte b) {
        this.f15720a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        px0 px0Var;
        byte b = this.f15720a;
        AbstractC0892m0 abstractC0892m0 = this.f15721b;
        switch (b) {
            case 0:
                q22 q22Var = (q22) sj3.m10825u(abstractC0892m0, n22.f25413a);
                if (q22Var == null) {
                    t32.m10968a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + q22Var);
                }
                q22 q22Var2 = abstractC0892m0.f24508y;
                abstractC0892m0.f24508y = q22Var;
                if (q22Var2 != null && !z62.m13387o(q22Var, q22Var2) && ((px0Var = abstractC0892m0.f24491B) != null || !abstractC0892m0.f24498I)) {
                    if (px0Var != null) {
                        abstractC0892m0.m10155P0(px0Var);
                    }
                    abstractC0892m0.f24491B = null;
                    abstractC0892m0.m8163Z0();
                }
                return ju4.f22634a;
            default:
                abstractC0892m0.m8167d1();
                return Boolean.TRUE;
        }
    }
}
