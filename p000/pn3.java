package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pn3 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f27804i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ si2 f27805j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn3(si2 si2Var, byte b) {
        super(0);
        this.f27804i = b;
        this.f27805j = si2Var;
    }

    @Override // p000.wp1
    public final Object invoke() {
        long jM8333i;
        byte b = this.f27804i;
        si2 si2Var = this.f27805j;
        switch (b) {
            case 0:
                mi2 mi2VarM10789h = si2Var.m10789h();
                int iOrdinal = mi2VarM10789h.f24955p.ordinal();
                if (iOrdinal == 0) {
                    jM8333i = mi2VarM10789h.m8333i() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    jM8333i = mi2VarM10789h.m8333i() >> 32;
                }
                return Float.valueOf(((int) jM8333i) * 0.05f);
            default:
                return si2Var.m10789h().f24955p;
        }
    }
}
