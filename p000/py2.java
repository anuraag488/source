package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py2 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LinkedHashMap f28085a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zx2 f28086b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f28087c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ lu2 f28088d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C0910mi f28089e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ xb4 f28090f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ sw2 f28091g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ sw2 f28092h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ ky0 f28093i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ xb4 f28094j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ pg0 f28095k;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinkedHashMap linkedHashMap = this.f28085a;
        zx2 zx2Var = this.f28086b;
        boolean z = this.f28087c;
        lu2 lu2Var = this.f28088d;
        C0910mi c0910mi = this.f28089e;
        xb4 xb4Var = this.f28090f;
        sw2 sw2Var = this.f28091g;
        sw2 sw2Var2 = this.f28092h;
        ky0 ky0Var = this.f28093i;
        xb4 xb4Var2 = this.f28094j;
        pg0 pg0Var = this.f28095k;
        v20 v20Var = (v20) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(v20Var) ? 4 : 2;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            qy2 qy2Var = new qy2();
            qy2Var.f28881a = linkedHashMap;
            qy2Var.f28882b = zx2Var;
            qy2Var.f28883c = z;
            qy2Var.f28884d = v20Var;
            qy2Var.f28885e = lu2Var;
            qy2Var.f28886f = c0910mi;
            qy2Var.f28887g = xb4Var;
            qy2Var.f28888h = sw2Var;
            qy2Var.f28889i = sw2Var2;
            qy2Var.f28890j = ky0Var;
            qy2Var.f28891k = xb4Var2;
            qy2Var.f28892l = pg0Var;
            VarHandle.storeStoreFence();
            c20.m3809d(vd6.m11834R(1110340780, qy2Var, ir1Var), ir1Var, 6);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
