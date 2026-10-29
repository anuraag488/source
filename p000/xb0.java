package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34125a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f34126b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f34127c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f34128d;

    public /* synthetic */ xb0(byte b) {
        this.f34125a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        Object obj6;
        byte b = this.f34125a;
        ju4 ju4Var = ju4.f22634a;
        i50 i50Var = ki0.f23136a;
        switch (b) {
            case 0:
                yp1 yp1Var = this.f34126b;
                sw2 sw2Var = this.f34127c;
                sw2 sw2Var2 = this.f34128d;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    float fM9469h = pb0.m9469h(bc0.m3544b(sw2Var));
                    boolean zM6892h = ir1Var.m6892h(false) | ir1Var.m6890g(yp1Var);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6892h || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        rb0 rb0Var = new rb0((byte) 1);
                        rb0Var.f29124b = sw2Var;
                        rb0Var.f29125c = yp1Var;
                        rb0Var.f29126d = sw2Var2;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(rb0Var);
                        obj4 = rb0Var;
                    }
                    bc0.m3545c(sw2Var, "R", fM9469h, (mq1) obj4, ir1Var);
                }
                break;
            case 1:
                yp1 yp1Var2 = this.f34126b;
                sw2 sw2Var3 = this.f34127c;
                sw2 sw2Var4 = this.f34128d;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    float fM9468g = pb0.m9468g(bc0.m3544b(sw2Var3));
                    boolean zM6892h2 = ir1Var2.m6892h(false) | ir1Var2.m6890g(yp1Var2);
                    Object objM6869O2 = ir1Var2.m6869O();
                    if (zM6892h2 || objM6869O2 == i50Var) {
                        obj5 = objM6869O2;
                        rb0 rb0Var2 = new rb0((byte) 0);
                        rb0Var2.f29124b = sw2Var3;
                        rb0Var2.f29125c = yp1Var2;
                        rb0Var2.f29126d = sw2Var4;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(rb0Var2);
                        obj5 = rb0Var2;
                    }
                    bc0.m3545c(sw2Var3, "G", fM9468g, (mq1) obj5, ir1Var2);
                }
                break;
            default:
                yp1 yp1Var3 = this.f34126b;
                sw2 sw2Var5 = this.f34127c;
                sw2 sw2Var6 = this.f34128d;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ir1Var3.m6874W();
                } else {
                    float fM9466e = pb0.m9466e(bc0.m3544b(sw2Var5));
                    boolean zM6892h3 = ir1Var3.m6892h(false) | ir1Var3.m6890g(yp1Var3);
                    Object objM6869O3 = ir1Var3.m6869O();
                    if (zM6892h3 || objM6869O3 == i50Var) {
                        obj6 = objM6869O3;
                        rb0 rb0Var3 = new rb0((byte) 2);
                        rb0Var3.f29124b = sw2Var5;
                        rb0Var3.f29125c = yp1Var3;
                        rb0Var3.f29126d = sw2Var6;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(rb0Var3);
                        obj6 = rb0Var3;
                    }
                    bc0.m3545c(sw2Var5, "B", fM9466e, (mq1) obj6, ir1Var3);
                }
                break;
        }
        return ju4Var;
    }
}
