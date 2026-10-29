package p000;

import essentials.app.EsApp;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class le0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23973a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f23974b;

    public /* synthetic */ le0(byte b) {
        this.f23973a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.f23973a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        sw2 sw2Var = this.f23974b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    Object value = sw2Var.getValue();
                    db4 db4VarMo7289f = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d.mo7289f();
                    boolean zM6890g = ir1Var.m6890g(db4VarMo7289f);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj3 = objM6869O;
                        C1127s c1127s = new C1127s((byte) 12);
                        c1127s.f29778b = db4VarMo7289f;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1127s);
                        obj3 = c1127s;
                    }
                    me0 me0Var = new me0((byte) 0);
                    VarHandle.storeStoreFence();
                    ev0.m5331F(value, null, (yp1) obj3, null, null, null, vd6.m11834R(2099558357, me0Var, ir1Var), ir1Var, 1572864, 58);
                }
                break;
            case 1:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i = EsApp.f18450c;
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    gl4.m6037b("Memory ".concat(EsApp.m5325a(sw2Var, "summary.total-pss")), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 0, 0, 262142);
                }
                break;
            case 2:
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i2 = EsApp.f18450c;
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ir1Var3.m6874W();
                } else {
                    gl4.m6037b(c75.m3881m(zi4.m13625y("graphics ", EsApp.m5325a(sw2Var, "summary.graphics"), " · java ", EsApp.m5325a(sw2Var, "summary.java-heap"), " · native "), EsApp.m5325a(sw2Var, "summary.native-heap"), " · code ", EsApp.m5325a(sw2Var, "summary.code")), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var3, 0, 0, 262142);
                }
                break;
            default:
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ir1Var4.m6874W();
                } else {
                    g12 g12VarM5550u = ((t82) sw2Var.getValue()) != null ? C0638f5.m5550u() : (g12) o02.f26246c.getValue();
                    Object objM6869O2 = ir1Var4.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = new fv3((byte) 25);
                        ir1Var4.m6905n0(objM6869O2);
                    }
                    je0.m7085a(g12VarM5550u, null, (yp1) objM6869O2, ir1Var4, 384, 2);
                }
                break;
        }
        return ju4Var;
    }
}
