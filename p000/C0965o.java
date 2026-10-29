package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: o */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0965o implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26227a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0950nl f26228b;

    public /* synthetic */ C0965o(byte b) {
        this.f26227a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        Object obj6;
        byte b = this.f26227a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        boolean z = false;
        C0950nl c0950nl = this.f26228b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    Object objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        obj4 = objM6869O;
                        a83 a83Var = new a83(0);
                        ir1Var.m6905n0(a83Var);
                        obj4 = a83Var;
                    }
                    obj4 = objM6869O;
                    a83 a83Var2 = (a83) obj4;
                    a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
                    yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
                    boolean zM6890g = ir1Var.m6890g(a44Var) | ir1Var.m6890g(yp1VarM5366p0);
                    Object objM6869O2 = ir1Var.m6869O();
                    Object obj7 = objM6869O2;
                    if (zM6890g || objM6869O2 == i50Var) {
                        C1201u c1201u = new C1201u(z ? (byte) 1 : (byte) 0);
                        c1201u.f31573b = a44Var;
                        c1201u.f31574c = yp1VarM5366p0;
                        c1201u.f31575d = a83Var2;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1201u);
                        obj7 = c1201u;
                    }
                    nt2 nt2VarM10327a = rf4.m10327a(kt2.f23428a, ju4Var, (PointerInputEventHandler) obj7);
                    pg0 pg0Var = oh6.f26729c;
                    C1016p c1016p = new C1016p(z ? (byte) 1 : (byte) 0);
                    c1016p.f27252b = c0950nl;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(nt2VarM10327a, null, false, null, null, null, pg0Var, vd6.m11834R(1424667693, c1016p, ir1Var), oh6.f26730d, null, ir1Var, 114819072, 574);
                }
                break;
            case 1:
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    boolean zM6894i = ir1Var2.m6894i(c0950nl);
                    Object objM6869O3 = ir1Var2.m6869O();
                    if (zM6894i || objM6869O3 == i50Var) {
                        obj5 = objM6869O3;
                        C0854l c0854l = new C0854l(z ? (byte) 1 : (byte) 0);
                        c0854l.f23655b = c0950nl;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0854l);
                        obj5 = c0854l;
                    }
                    mz3.m8463e(null, null, false, qq2.m10038v(ir1Var2, (wp1) obj5), null, null, oh6.f26736j, oh6.f26737k, oh6.f26738l, null, ir1Var2, 114819072, 567);
                }
                break;
            case 2:
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ir1Var3.m6874W();
                } else {
                    boolean zM6894i2 = ir1Var3.m6894i(c0950nl);
                    Object objM6869O4 = ir1Var3.m6869O();
                    if (zM6894i2 || objM6869O4 == i50Var) {
                        obj6 = objM6869O4;
                        C0854l c0854l2 = new C0854l(b2);
                        c0854l2.f23655b = c0950nl;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c0854l2);
                        obj6 = c0854l2;
                    }
                    C1297wl c1297wlM10038v = qq2.m10038v(ir1Var3, (wp1) obj6);
                    pg0 pg0Var2 = oh6.f26743q;
                    sg0 sg0Var = new sg0((byte) 2);
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, c1297wlM10038v, null, null, pg0Var2, vd6.m11834R(-64233314, sg0Var, ir1Var3), oh6.f26744r, null, ir1Var3, 114819072, 567);
                }
                break;
            default:
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ir1Var4.m6874W();
                } else {
                    gl4.m6037b(id4.m6767N("\n                  " + c0950nl.f25921b + " is part of a larger ecosystem of tools I’m building to improve the Android experience.\n                  \n                  I avoid one-time purchases because I want to ensure that every app I release remains fully supported as Android evolves. A subscription model allows me to stay dedicated to this project—and the others I’m developing—so they stay reliable, fast, and bug-free over the long term.\n                  \n                  This ensures that when you invest in one of my apps, you're investing in a tool that is guaranteed to stay compatible with your future devices.\n                "), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var4, 0, 0, 262142);
                }
                break;
        }
        return ju4Var;
    }
}
