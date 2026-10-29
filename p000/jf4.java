package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ nt2 f22210a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nv2 f22211b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ p44 f22212c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ long f22213d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ float f22214e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean f22215f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean f22216g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ yp1 f22217h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ pg0 f22218i;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        nt2 nt2Var = this.f22210a;
        nv2 nv2Var = this.f22211b;
        p44 p44Var = this.f22212c;
        long j = this.f22213d;
        float f = this.f22214e;
        boolean z = this.f22215f;
        boolean z2 = this.f22216g;
        yp1 yp1Var = this.f22217h;
        pg0 pg0Var = this.f22218i;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            dx1 dx1Var = f62.f18784a;
            nt2 nt2VarMo7630d = nt2Var.mo7630d(gt2.f20114a);
            kj0 kj0Var = xp3.f34516a;
            ((kq3) ir1Var.m6898k(kj0Var)).getClass();
            nt2 nt2VarM7513c = kf4.m7513c(nt2VarMo7630d.mo7630d(kt2.f23428a), p44Var, kf4.m7514d(j, f, ir1Var), null, ((ky0) ir1Var.m6898k(ij0.f21473h)).mo3575E(0.0f));
            ((kq3) ir1Var.m6898k(kj0Var)).getClass();
            nt2 nt2VarM7387l = k43.m7387l(n40.m8491B(nt2VarM7513c, z, nv2Var, xp3.m12729a(p44Var, 215), z2, null, yp1Var));
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM7387l);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            pg0Var.invoke(ir1Var, 0);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
