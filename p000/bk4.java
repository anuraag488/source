package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ uj2 f15366a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pk4 f15367b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ xk4 f15368c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f15369d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f15370e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ vi3 f15371f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ au4 f15372g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ yp1 f15373h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ int f15374i;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uj2 uj2Var = this.f15366a;
        pk4 pk4Var = this.f15367b;
        xk4 xk4Var = this.f15368c;
        boolean z = this.f15369d;
        boolean z2 = this.f15370e;
        vi3 vi3Var = this.f15371f;
        au4 au4Var = this.f15372g;
        yp1 yp1Var = this.f15373h;
        int i = this.f15374i;
        ((Integer) obj3).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj2);
        ir1Var.m6885d0(851809892);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new pl4();
            ir1Var.m6905n0(objM6869O);
        }
        pl4 pl4Var = (pl4) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = new yu0();
            ir1Var.m6905n0(objM6869O2);
        }
        ak4 ak4Var = new ak4();
        ak4Var.f14588a = uj2Var;
        ak4Var.f14589b = pk4Var;
        ak4Var.f14590c = xk4Var;
        ak4Var.f14591d = z;
        ak4Var.f14592e = z2;
        ak4Var.f14593f = pl4Var;
        ak4Var.f14594g = vi3Var;
        ak4Var.f14595h = au4Var;
        ak4Var.f14596i = (yu0) objM6869O2;
        ak4Var.f14597j = cd2.f15939a;
        ak4Var.f14598k = yp1Var;
        ak4Var.f14599l = i;
        VarHandle.storeStoreFence();
        boolean zM6894i = ir1Var.m6894i(ak4Var);
        Object objM6869O3 = ir1Var.m6869O();
        if (zM6894i || objM6869O3 == i50Var) {
            C0633f0 c0633f0 = new C0633f0(1, ak4Var, ak4.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, (byte) 25);
            ir1Var.m6905n0(c0633f0);
            objM6869O3 = c0633f0;
        }
        nt2 nt2VarM13356O = z62.m13356O(kt2.f23428a, (yp1) ((xq1) objM6869O3));
        ir1Var.m6912r(false);
        return nt2VarM13356O;
    }
}
