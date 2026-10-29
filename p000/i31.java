package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i31 extends ue2 implements nq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ rn3 f21088i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ wp1 f21089j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f21090k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ig1 f21091l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ yp1 f21092m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ mq1 f21093n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(rn3 rn3Var, wp1 wp1Var, boolean z, ig1 ig1Var, yp1 yp1Var, mq1 mq1Var) {
        super(3);
        this.f21088i = rn3Var;
        this.f21089j = wp1Var;
        this.f21090k = z;
        this.f21091l = ig1Var;
        this.f21092m = yp1Var;
        this.f21093n = mq1Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        nt2 nt2Var = (nt2) obj;
        ((Number) obj3).intValue();
        ir1 ir1Var = (ir1) ((mi0) obj2);
        ir1Var.m6885d0(1321786060);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            jj0 jj0Var = new jj0(lb5.m7942w(r71.f29063a, ir1Var));
            ir1Var.m6905n0(jj0Var);
            objM6869O = jj0Var;
        }
        zo0 zo0Var = ((jj0) objM6869O).f22325a;
        ir1Var.m6885d0(-98757340);
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = k43.m7398w(null);
            ir1Var.m6905n0(objM6869O2);
        }
        sw2 sw2Var = (sw2) objM6869O2;
        ir1Var.m6912r(false);
        ir1Var.m6885d0(-98754771);
        Object objM6869O3 = ir1Var.m6869O();
        if (objM6869O3 == i50Var) {
            objM6869O3 = k43.m7398w(Boolean.FALSE);
            ir1Var.m6905n0(objM6869O3);
        }
        sw2 sw2Var2 = (sw2) objM6869O3;
        ir1Var.m6912r(false);
        ir1Var.m6885d0(-98752375);
        boolean zM6894i = ir1Var.m6894i(zo0Var) | ir1Var.m6890g(null);
        wp1 wp1Var = this.f21089j;
        boolean zM6890g = zM6894i | ir1Var.m6890g(wp1Var);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g || objM6869O4 == i50Var) {
            f31 f31Var = new f31(wp1Var, sw2Var2, sw2Var, zo0Var, (byte) 0);
            ir1Var.m6905n0(f31Var);
            objM6869O4 = f31Var;
        }
        ir1Var.m6912r(false);
        rn3 rn3Var = this.f21088i;
        lb5.m7923d(rn3Var, (yp1) objM6869O4, ir1Var);
        boolean z = this.f21090k;
        Boolean boolValueOf = Boolean.valueOf(z);
        ir1Var.m6885d0(-98737076);
        boolean zM6892h = ir1Var.m6892h(z);
        ig1 ig1Var = this.f21091l;
        boolean zM6894i2 = zM6892h | ir1Var.m6894i(ig1Var) | ir1Var.m6894i(zo0Var) | ir1Var.m6890g(null);
        yp1 yp1Var = this.f21092m;
        boolean zM6890g2 = zM6894i2 | ir1Var.m6890g(yp1Var) | ir1Var.m6890g(wp1Var);
        mq1 mq1Var = this.f21093n;
        boolean zM6890g3 = zM6890g2 | ir1Var.m6890g(mq1Var);
        Object objM6869O5 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O5 == i50Var) {
            bool = boolValueOf;
            h31 h31Var = new h31(this.f21090k, ig1Var, mq1Var, yp1Var, sw2Var2, zo0Var, sw2Var, wp1Var, null);
            ir1Var.m6905n0(h31Var);
            objM6869O5 = h31Var;
        } else {
            bool = boolValueOf;
        }
        ir1Var.m6912r(false);
        ec3 ec3Var = rf4.f29227a;
        qf4 qf4Var = new qf4();
        qf4Var.f28440a = (mq1) objM6869O5;
        VarHandle.storeStoreFence();
        nt2 nt2VarMo7630d = nt2Var.mo7630d(new pf4(rn3Var, bool, qf4Var, 4));
        ir1Var.m6912r(false);
        return nt2VarMo7630d;
    }
}
