package p000;

import android.app.KeyguardManager;
import android.os.PowerManager;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dz0 {

    /* JADX INFO: renamed from: a */
    public d83 f17510a;

    /* JADX INFO: renamed from: b */
    public wy0 f17511b;

    /* JADX INFO: renamed from: c */
    public wy0 f17512c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ PowerManager f17513d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ KeyguardManager f17514e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ xn2 f17515f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ xz4 f17516g;

    /* JADX INFO: renamed from: a */
    public final boolean m4802a() {
        return ((Boolean) this.f17511b.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m4803b(boolean z, ym0 ym0Var) {
        zy0 zy0Var;
        Object obj;
        xn2 xn2Var = this.f17515f;
        if (ym0Var instanceof zy0) {
            zy0Var = (zy0) ym0Var;
            int i = zy0Var.f36462x;
            if ((i & Integer.MIN_VALUE) != 0) {
                zy0Var.f36462x = i - Integer.MIN_VALUE;
            } else {
                zy0Var = new zy0(this, ym0Var);
            }
        } else {
            zy0Var = new zy0(this, ym0Var);
        }
        Object objM12799b = zy0Var.f36460v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = zy0Var.f36462x;
        if (i2 != 0) {
            if (i2 == 1) {
                z = zy0Var.f36458t;
                k43.m7376J(objM12799b);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = zy0Var.f36459u;
                k43.m7376J(objM12799b);
            }
            objM12799b = obj;
            return Boolean.valueOf(z62.m13387o(objM12799b, Boolean.TRUE));
        }
        k43.m7376J(objM12799b);
        if (xn2Var != null) {
            PowerManager powerManager = this.f17513d;
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on turn on request is off ? " + (!powerManager.isInteractive()), null);
            }
        }
        if (m4802a()) {
            if (xn2Var != null) {
                String strM12721a2 = xn2Var.m12721a();
                k44 k44Var2 = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                    xn2Var.m12722b(k44Var2, strM12721a2, "already on", null);
                }
            }
            return Boolean.TRUE;
        }
        xz4 xz4Var = this.f17516g;
        C0928n c0928n = new C0928n((byte) 6);
        c0928n.f25353b = this;
        VarHandle.storeStoreFence();
        pg0 pg0Var = new pg0(-905649812, true, c0928n);
        zy0Var.f36458t = z;
        zy0Var.f36462x = 1;
        objM12799b = xz4Var.m12799b(pg0Var, zy0Var);
        if (objM12799b != ap0Var) {
        }
        return ap0Var;
        if (z62.m13387o((Boolean) objM12799b, Boolean.TRUE) && z) {
            r50 r50Var = i41.f21117b;
            long jM3238Q = as4.m3238Q(250, m41.MILLISECONDS);
            zy0Var.f36459u = objM12799b;
            zy0Var.f36458t = z;
            zy0Var.f36462x = 2;
            if (d24.m4318s(jM3238Q, zy0Var) != ap0Var) {
                obj = objM12799b;
                objM12799b = obj;
            }
            return ap0Var;
        }
        return Boolean.valueOf(z62.m13387o(objM12799b, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public final Object m4804c(ym0 ym0Var) {
        az0 az0Var;
        Object obj;
        KeyguardManager keyguardManager = this.f17514e;
        xn2 xn2Var = this.f17515f;
        if (ym0Var instanceof az0) {
            az0Var = (az0) ym0Var;
            int i = az0Var.f14950w;
            if ((i & Integer.MIN_VALUE) != 0) {
                az0Var.f14950w = i - Integer.MIN_VALUE;
            } else {
                az0Var = new az0(this, ym0Var);
            }
        } else {
            az0Var = new az0(this, ym0Var);
        }
        Object objM12799b = az0Var.f14948u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = az0Var.f14950w;
        int i3 = 2;
        wm0 wm0Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(objM12799b);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = az0Var.f14947t;
                k43.m7376J(objM12799b);
            }
            objM12799b = obj;
            return Boolean.valueOf(z62.m13387o(objM12799b, Boolean.TRUE));
        }
        k43.m7376J(objM12799b);
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on unlock request is locked ? " + keyguardManager.isKeyguardLocked(), null);
            }
        }
        if (((Boolean) this.f17512c.getValue()).booleanValue()) {
            if (xn2Var != null) {
                String strM12721a2 = xn2Var.m12721a();
                k44 k44Var2 = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                    xn2Var.m12722b(k44Var2, strM12721a2, "already unlocked", null);
                }
            }
            return Boolean.TRUE;
        }
        xz4 xz4Var = this.f17516g;
        up4 up4Var = new up4((byte) 5);
        up4Var.f32065b = keyguardManager;
        up4Var.f32066c = xn2Var;
        VarHandle.storeStoreFence();
        pg0 pg0Var = new pg0(-560057278, true, up4Var);
        az0Var.f14950w = 1;
        objM12799b = xz4Var.m12799b(pg0Var, az0Var);
        if (objM12799b != ap0Var) {
        }
        return ap0Var;
        if (z62.m13387o((Boolean) objM12799b, Boolean.TRUE)) {
            xy0 xy0Var = new xy0((byte) 2);
            xy0Var.f34713b = this;
            VarHandle.storeStoreFence();
            vt0 vt0VarM10013H = qq2.m10013H(xy0Var);
            C0969o3 c0969o3 = new C0969o3(i3, wm0Var, (byte) 4);
            az0Var.f14947t = objM12799b;
            az0Var.f14950w = 2;
            if (lb5.m7902J(vt0VarM10013H, c0969o3, az0Var) != ap0Var) {
                obj = objM12799b;
                objM12799b = obj;
            }
            return ap0Var;
        }
        return Boolean.valueOf(z62.m13387o(objM12799b, Boolean.TRUE));
    }
}
