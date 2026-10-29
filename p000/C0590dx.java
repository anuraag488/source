package p000;

import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: dx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0590dx implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17471a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f17472b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f17473c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f17474d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f17475e;

    public /* synthetic */ C0590dx(byte b) {
        this.f17471a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f17471a;
        wm0 wm0Var = null;
        ju4 ju4Var = ju4.f22634a;
        boolean z = false;
        z = false;
        z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                String str = (String) this.f17475e;
                dz0 dz0Var = (dz0) this.f17472b;
                sw2 sw2Var = (sw2) this.f17473c;
                sw2 sw2Var2 = (sw2) this.f17474d;
                if (z62.m13387o((String) sw2Var.getValue(), str) && dz0Var.m4802a() && ((Boolean) sw2Var2.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                dz0 dz0Var2 = (dz0) this.f17472b;
                sw2 sw2Var3 = (sw2) this.f17473c;
                sw2 sw2Var4 = (sw2) this.f17474d;
                xb4 xb4Var = (xb4) this.f17475e;
                return "currentApp=" + ((String) sw2Var3.getValue()) + " screenOn=" + dz0Var2.m4802a() + " switchButtonVisible=" + ((Boolean) sw2Var4.getValue()).booleanValue() + " willSwitch=" + ((Boolean) xb4Var.getValue()).booleanValue();
            case 2:
                d64 d64Var = (d64) this.f17475e;
                zo0 zo0Var = (zo0) this.f17472b;
                C0910mi c0910mi = (C0910mi) this.f17473c;
                wp1 wp1Var = (wp1) this.f17474d;
                if (d64Var.m4386c() == e64.f17843b && d64Var.f16820d.m8670h().m11653c(e64.f17844c)) {
                    lb5.m7910S(zo0Var, null, null, new t10(d64Var, wm0Var, z ? (byte) 1 : (byte) 0), 3);
                    lb5.m7910S(zo0Var, null, null, new u10(c0910mi, wm0Var, z ? (byte) 1 : (byte) 0), 3);
                } else {
                    t82 t82VarM7910S = lb5.m7910S(zo0Var, null, null, new t10(d64Var, wm0Var, b2), 3);
                    l10 l10Var = new l10((byte) 1);
                    l10Var.f23692b = d64Var;
                    l10Var.f23693c = wp1Var;
                    VarHandle.storeStoreFence();
                    ((e92) t82VarM7910S).mo4972C(l10Var);
                }
                return ju4Var;
            case 3:
                ir1 ir1Var = (ir1) this.f17475e;
                y70 y70Var = (y70) this.f17472b;
                l84 l84Var = (l84) this.f17473c;
                uu2 uu2Var = (uu2) this.f17474d;
                ni0 ni0Var = ir1Var.f21676M;
                y70 y70Var2 = ni0Var.f25831b;
                try {
                    ni0Var.f25831b = y70Var;
                    l84 l84Var2 = ir1Var.f21670G;
                    int[] iArr = ir1Var.f21699o;
                    lv2 lv2Var = ir1Var.f21706v;
                    ir1Var.f21699o = null;
                    ir1Var.f21706v = null;
                    try {
                        ir1Var.f21670G = l84Var;
                        boolean z2 = ni0Var.f25834e;
                        try {
                            ni0Var.f25834e = false;
                            ir1Var.m6860F(uu2Var.f32179a, uu2Var.f32185g, uu2Var.f32180b, true);
                            ni0Var.f25834e = z2;
                            ir1Var.f21670G = l84Var2;
                            ir1Var.f21699o = iArr;
                            ir1Var.f21706v = lv2Var;
                            ni0Var.f25831b = y70Var2;
                            return ju4Var;
                        } catch (Throwable th) {
                            ni0Var.f25834e = z2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ir1Var.f21670G = l84Var2;
                        ir1Var.f21699o = iArr;
                        ir1Var.f21706v = lv2Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ni0Var.f25831b = y70Var2;
                    throw th3;
                }
            case 4:
                Float f = (Float) this.f17475e;
                f32 f32Var = (f32) this.f17472b;
                Float f2 = (Float) this.f17473c;
                e32 e32Var = (e32) this.f17474d;
                if (!f.equals(f32Var.f18705a) || !f2.equals(f32Var.f18706b)) {
                    f32Var.f18705a = f;
                    f32Var.f18706b = f2;
                    f32Var.f18709e = new hi4(e32Var, f32Var.f18707c, f, f2, null);
                    f32Var.f18713i.f21095b.setValue(Boolean.TRUE);
                    f32Var.f18710f = false;
                    f32Var.f18711g = true;
                }
                return ju4Var;
            case 5:
                kz2 kz2Var = (kz2) this.f17475e;
                xv3 xv3Var = (xv3) this.f17472b;
                List list = (List) this.f17473c;
                List list2 = (List) this.f17474d;
                kz2Var.f23634c.setValue(xv3Var);
                kz2Var.f23633b.setValue(list);
                kz2Var.f23635d.setValue(list2);
                return ju4Var;
            default:
                return new d64((Set) this.f17475e, (wp1) this.f17472b, (e64) this.f17473c, (yp1) this.f17474d);
        }
    }
}
