package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 implements oq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f237a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f238b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f239c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f240d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ sw2 f241e;

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        sg2 sg2Var = (sg2) obj;
        int iIntValue = ((Number) obj2).intValue();
        mi0 mi0Var = (mi0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        yp1 yp1Var = this.f238b;
        sw2 sw2Var = this.f240d;
        if ((iIntValue2 & 6) == 0) {
            i = (((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((ir1) mi0Var).m6886e(iIntValue) ? 32 : 16;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            long j = ((pb0) this.f237a.get(iIntValue)).f27503a;
            ir1Var.m6885d0(-1145566987);
            long j2 = AbstractC1410zm.m13638b(false, false, null, pb0.m9462a(j), null, null, ir1Var, 0, 239).f16942b;
            boolean zM12408a = ws4.m12408a(bc0.m3544b(sw2Var), j);
            boolean zM6892h = ir1Var.m6892h(false) | ir1Var.m6890g(yp1Var) | ir1Var.m6888f(j);
            Object objM6869O = ir1Var.m6869O();
            if (zM6892h || objM6869O == ki0.f23136a) {
                obj5 = objM6869O;
                sw2 sw2Var2 = this.f241e;
                zb0 zb0Var = new zb0();
                zb0Var.f35910a = j;
                zb0Var.f35911b = yp1Var;
                zb0Var.f35912c = sw2Var;
                zb0Var.f35913d = sw2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(zb0Var);
                obj5 = zb0Var;
            }
            obj5 = objM6869O;
            as4.m3242a(j, j2, zM12408a, (wp1) obj5, iIntValue, this.f239c, null, ir1Var, (i2 << 9) & 57344, 64);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
