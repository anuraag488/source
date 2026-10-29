package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gn3 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f19976i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ rn3 f19977j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn3(rn3 rn3Var, byte b) {
        super(0);
        this.f19976i = b;
        this.f19977j = rn3Var;
    }

    @Override // p000.wp1
    public final Object invoke() {
        long jM8333i;
        long j;
        byte b = this.f19976i;
        float fM4319t = 0.0f;
        rn3 rn3Var = this.f19977j;
        switch (b) {
            case 0:
                return Boolean.valueOf(rn3Var.f29450k.getValue() != null);
            case 1:
                return rn3Var.f29440a.m12236d();
            case 2:
                qn3 qn3VarM10375b = rn3Var.m10375b();
                if (qn3VarM10375b != null) {
                    mi2 mi2Var = (mi2) rn3Var.f29440a.m12236d().f33090b;
                    int iOrdinal = mi2Var.f24955p.ordinal();
                    if (iOrdinal == 0) {
                        jM8333i = mi2Var.m8333i() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            C0670g.m5864c();
                            return null;
                        }
                        jM8333i = mi2Var.m8333i() >> 32;
                    }
                    long jM9991a = qn3VarM10375b.m9991a();
                    fM4319t = (((int) jM8333i) - d24.m4319t(i20.m6580e((int) (jM9991a >> 32), (int) (jM9991a & 4294967295L)), rn3Var.m10377d())) - 1.0f;
                }
                return Float.valueOf(fM4319t);
            case 3:
                qn3 qn3VarM10375b2 = rn3Var.m10375b();
                if (qn3VarM10375b2 != null) {
                    long jM9991a2 = qn3VarM10375b2.m9991a();
                    float fM4319t2 = d24.m4319t(i20.m6580e((int) (jM9991a2 >> 32), (int) (jM9991a2 & 4294967295L)), rn3Var.m10377d());
                    long jM9992b = qn3VarM10375b2.m9992b();
                    int iOrdinal2 = rn3Var.m10377d().ordinal();
                    if (iOrdinal2 == 0) {
                        j = jM9992b & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            C0670g.m5864c();
                            return null;
                        }
                        j = jM9992b >> 32;
                    }
                    fM4319t = (fM4319t2 + ((int) j)) - 1.0f;
                }
                return Float.valueOf(fM4319t);
            default:
                return rn3Var.m10377d();
        }
    }
}
