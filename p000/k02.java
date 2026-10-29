package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k02 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22790a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f22791b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f22792c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22793d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22794e;

    public /* synthetic */ k02(byte b) {
        this.f22790a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22790a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                i73 i73Var = (i73) this.f22793d;
                nt2 nt2Var = (nt2) this.f22794e;
                long j = this.f22791b;
                int i = this.f22792c;
                ((Integer) obj2).getClass();
                l02.m7760b(i73Var, nt2Var, j, (mi0) obj, vd6.m11838V(i | 1));
                break;
            case 1:
                long j2 = this.f22791b;
                xl4 xl4Var = (xl4) this.f22793d;
                pg0 pg0Var = (pg0) this.f22794e;
                int i2 = this.f22792c;
                ((Integer) obj2).getClass();
                zt5.m13774e(j2, xl4Var, pg0Var, (mi0) obj, vd6.m11838V(i2 | 1));
                break;
            default:
                long j3 = this.f22791b;
                xl4 xl4Var2 = (xl4) this.f22793d;
                mq1 mq1Var = (mq1) this.f22794e;
                int i3 = this.f22792c;
                ((Integer) obj2).intValue();
                k43.m7380b(j3, xl4Var2, mq1Var, (mi0) obj, vd6.m11838V(i3 | 1));
                break;
        }
        return ju4Var;
    }
}
