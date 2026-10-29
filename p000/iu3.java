package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iu3 implements gu3 {

    /* JADX INFO: renamed from: e */
    public static final yg3 f21804e = ev3.m5407a(new z13(2), new t63(10));

    /* JADX INFO: renamed from: a */
    public final Map f21805a;

    /* JADX INFO: renamed from: b */
    public final lw2 f21806b;

    /* JADX INFO: renamed from: c */
    public lu3 f21807c;

    /* JADX INFO: renamed from: d */
    public final hu3 f21808d;

    public iu3(Map map) {
        this.f21805a = map;
        long[] jArr = tv3.f31472a;
        this.f21806b = new lw2();
        hu3 hu3Var = new hu3((byte) 0);
        hu3Var.f20883b = this;
        VarHandle.storeStoreFence();
        this.f21808d = hu3Var;
    }

    @Override // p000.gu3
    /* JADX INFO: renamed from: e */
    public final void mo6170e(Object obj, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(533563200);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(this) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            ir1Var.m6891g0(obj);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                hu3 hu3Var = this.f21808d;
                if (!((Boolean) hu3Var.invoke(obj)).booleanValue()) {
                    xy4.m12783l("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                mu3 mu3VarM9279a = ou3.m9279a((Map) this.f21805a.get(obj), hu3Var);
                pu3 pu3Var = new pu3();
                pu3Var.f28010a = mu3VarM9279a;
                Object objMo8112d = mu3VarM9279a.mo8112d("androidx.savedstate.SavedStateRegistry");
                Bundle bundle = objMo8112d instanceof Bundle ? (Bundle) objMo8112d : null;
                if (bundle != null) {
                    pu3Var.m9677e(bundle);
                }
                g32 g32Var = new g32((byte) 18);
                g32Var.f19558b = pu3Var;
                VarHandle.storeStoreFence();
                mu3VarM9279a.mo8109a("androidx.savedstate.SavedStateRegistry", g32Var);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(pu3Var);
                objM6869O = pu3Var;
            }
            pu3 pu3Var2 = (pu3) objM6869O;
            as4.m3245d(new zh3[]{ou3.f27125a.mo7523a(pu3Var2), xm2.f34419a.mo7523a(pu3Var2)}, pg0Var, ir1Var, (i2 & 112) | 8);
            boolean zM6894i = ir1Var.m6894i(this) | ir1Var.m6894i(obj) | ir1Var.m6894i(pu3Var2);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (zM6894i || objM6869O2 == i50Var) {
                C1164t c1164t = new C1164t((byte) 24);
                c1164t.f30700c = this;
                c1164t.f30699b = obj;
                c1164t.f30701d = pu3Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj2 = c1164t;
            }
            lb5.m7923d(ju4.f22634a, (yp1) obj2, ir1Var);
            if (ir1Var.f21709y && ir1Var.f21670G.f23855i == ir1Var.f21710z) {
                ir1Var.f21710z = -1;
                ir1Var.f21709y = false;
            }
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 10);
            c1403zf.f36036c = this;
            c1403zf.f36037d = obj;
            c1403zf.f36038e = pg0Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    @Override // p000.gu3
    /* JADX INFO: renamed from: f */
    public final void mo6171f(Object obj) {
        if (this.f21806b.m8136k(obj) == null) {
            this.f21805a.remove(obj);
        }
    }
}
