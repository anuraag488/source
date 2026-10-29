package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ rn3 f27977a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27978b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ fv3 f27979c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ch0 f27980d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f27981e;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rn3 rn3Var = this.f27977a;
        Object obj4 = this.f27978b;
        ch0 ch0Var = this.f27980d;
        int i = this.f27981e;
        sg2 sg2Var = (sg2) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            lt4 lt4Var = new lt4();
            lt4Var.f24357a = sg2Var;
            lt4Var.f24358b = obj4;
            lt4Var.f24359c = ch0Var;
            lt4Var.f24360d = i;
            VarHandle.storeStoreFence();
            y62.m12975j(sg2Var, rn3Var, obj4, null, false, null, vd6.m11834R(1061232988, lt4Var, ir1Var), ir1Var, (iIntValue & 14) | 1572864);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
