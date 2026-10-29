package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32555a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ a83 f32556b;

    public /* synthetic */ ve2(byte b) {
        this.f32555a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.f32555a;
        ju4 ju4Var = ju4.f22634a;
        kt2 kt2Var = kt2.f23428a;
        a83 a83Var = this.f32556b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    g12 g12Var = (g12) o02.f26268y.getValue();
                    Object objM6869O = ir1Var.m6869O();
                    if (objM6869O == ki0.f23136a) {
                        obj3 = objM6869O;
                        we2 we2Var = new we2((byte) 0);
                        we2Var.f33269b = a83Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(we2Var);
                        obj3 = we2Var;
                    }
                    obj3 = objM6869O;
                    nc4 nc4Var = je0.f22196a;
                    C0928n c0928n = new C0928n((byte) 4);
                    c0928n.f25353b = (wp1) obj3;
                    VarHandle.storeStoreFence();
                    l02.m7759a(g12Var, qq2.m10029m(kt2Var, c0928n), 0L, ir1Var, 48, 8);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    gl4.m6037b(c75.m3878j("Trial ends in ", a83Var.m132h(), " seconds"), AbstractC0647fd.m5650H(kt2Var, 16.0f, 8.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24278b.f22578i, ir1Var2, 48, 0, 131068);
                }
                break;
        }
        return ju4Var;
    }
}
