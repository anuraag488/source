package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31850a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ byte f31851b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31852c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f31853d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f31854e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f31855f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f31856g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ iq1 f31857h;

    public /* synthetic */ ug2(byte b) {
        this.f31850a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31850a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                nt2 nt2Var = (nt2) this.f31852c;
                si2 si2Var = (si2) this.f31853d;
                e73 e73Var = (e73) this.f31854e;
                InterfaceC1299wn interfaceC1299wn = (InterfaceC1299wn) this.f31855f;
                C0779iz c0779iz = (C0779iz) this.f31856g;
                yp1 yp1Var = (yp1) this.f31857h;
                byte b2 = this.f31851b;
                ((Integer) obj2).getClass();
                as4.m3246e(nt2Var, si2Var, e73Var, interfaceC1299wn, c0779iz, yp1Var, (mi0) obj, vd6.m11838V(b2 | 1));
                break;
            case 1:
                byte b3 = this.f31851b;
                mq1 mq1Var = (mq1) this.f31852c;
                pg0 pg0Var = (pg0) this.f31853d;
                mq1 mq1Var2 = (mq1) this.f31854e;
                pg0 pg0Var2 = (pg0) this.f31855f;
                ww2 ww2Var = (ww2) this.f31856g;
                mq1 mq1Var3 = (mq1) this.f31857h;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    AbstractC1356y5.m12911e(b3, mq1Var, pg0Var, mq1Var2, pg0Var2, ww2Var, mq1Var3, ir1Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1356y5.m12911e(this.f31851b, (mq1) this.f31852c, (pg0) this.f31853d, (mq1) this.f31854e, (pg0) this.f31855f, (a05) this.f31856g, (mq1) this.f31857h, (mi0) obj, vd6.m11838V(1));
                break;
        }
        return ju4Var;
    }
}
