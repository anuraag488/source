package p000;

import ads_mobile_sdk.h50;
import ads_mobile_sdk.mk2;
import ads_mobile_sdk.yb1;
import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g90 {

    /* JADX INFO: renamed from: a */
    public boolean f19661a;

    /* JADX INFO: renamed from: b */
    public Object f19662b;

    /* JADX INFO: renamed from: c */
    public Object f19663c;

    /* JADX INFO: renamed from: d */
    public Object f19664d;

    /* JADX INFO: renamed from: e */
    public Object f19665e;

    /* JADX INFO: renamed from: a */
    public static g90 m5937a(h50 h50Var, yb1 yb1Var, mk2 mk2Var, mk2 mk2Var2, boolean z) {
        if (h50Var == null) {
            C1077qn.m9987m("CreativeType is null");
            return null;
        }
        if (yb1Var == null) {
            C1077qn.m9987m("ImpressionType is null");
            return null;
        }
        if (mk2Var == null) {
            C1077qn.m9987m("Impression owner is null");
            return null;
        }
        mk2 mk2Var3 = mk2.NONE;
        if (mk2Var == mk2Var3) {
            C1077qn.m9987m("Impression owner is none");
            return null;
        }
        h50 h50Var2 = h50.DEFINED_BY_JAVASCRIPT;
        mk2 mk2Var4 = mk2.NATIVE;
        if (h50Var == h50Var2 && mk2Var == mk2Var4) {
            C1077qn.m9987m("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (yb1Var == yb1.DEFINED_BY_JAVASCRIPT && mk2Var == mk2Var4) {
            C1077qn.m9987m("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        g90 g90Var = new g90();
        g90Var.f19664d = h50Var;
        g90Var.f19665e = yb1Var;
        g90Var.f19662b = mk2Var;
        if (mk2Var2 == null) {
            g90Var.f19663c = mk2Var3;
        } else {
            g90Var.f19663c = mk2Var2;
        }
        g90Var.f19661a = z;
        VarHandle.storeStoreFence();
        return g90Var;
    }

    /* JADX INFO: renamed from: b */
    public IOException m5938b(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m5941e(iOException);
        }
        return ((ek3) this.f19662b).m5157h(this, z2, z, iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public int m5939c(nh3 nh3Var, ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, boolean z) {
        int i;
        byte b;
        int i2;
        int i3;
        nw1 nw1Var = (nw1) this.f19663c;
        qw1 qw1Var = (qw1) this.f19665e;
        if (this.f19661a) {
            return 0;
        }
        try {
            this.f19661a = true;
            rd6 rd6VarM12089o = ((w42) this.f19664d).m12089o(nh3Var, viewTreeObserverOnGlobalLayoutListenerC1140sc);
            po2 po2Var = (po2) rd6VarM12089o.f29197c;
            int iM9594e = po2Var.m9594e();
            while (true) {
                if (i >= iM9594e) {
                    b = true;
                    break;
                }
                lc3 lc3Var = (lc3) po2Var.m9595f(i);
                i = (lc3Var.f23938d || lc3Var.f23942h) ? 0 : i + 1;
                b = false;
                break;
            }
            int iM9594e2 = po2Var.m9594e();
            for (int i4 = 0; i4 < iM9594e2; i4++) {
                lc3 lc3Var2 = (lc3) po2Var.m9595f(i4);
                if (b != false || AbstractC1356y5.m12921o(lc3Var2)) {
                    ((wf2) this.f19662b).m12249B(lc3Var2.f23937c, (qw1) this.f19665e, lc3Var2.f23943i, true);
                    if (!qw1Var.f28847a.m4208i()) {
                        nw1Var.m8867a(lc3Var2.f23935a, qw1Var, AbstractC1356y5.m12921o(lc3Var2));
                        qw1Var.clear();
                    }
                }
            }
            boolean zM8868b = nw1Var.m8868b(rd6VarM12089o, z);
            if (rd6VarM12089o.f29196b) {
                i2 = 0;
                break;
            }
            int iM9594e3 = po2Var.m9594e();
            int i5 = 0;
            while (true) {
                if (i5 >= iM9594e3) {
                    i2 = 0;
                    break;
                }
                lc3 lc3Var3 = (lc3) po2Var.m9595f(i5);
                if (!b33.m3425c(AbstractC1356y5.m12898G(lc3Var3, true), 0L) && lc3Var3.m7954c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iM9594e4 = po2Var.m9594e();
            for (int i6 = 0; i6 < iM9594e4; i6++) {
                if (((lc3) po2Var.m9595f(i6)).m7954c()) {
                    i3 = 1;
                    return (zM8868b ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zM8868b ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.f19661a = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public wo3 m5940d(boolean z) throws IOException {
        try {
            wo3 wo3VarMo5852g = ((mb1) this.f19664d).mo5852g(z);
            if (wo3VarMo5852g == null) {
                return wo3VarMo5852g;
            }
            wo3VarMo5852g.f33561m = this;
            return wo3VarMo5852g;
        } catch (IOException e) {
            m5941e(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5941e(IOException iOException) {
        this.f19661a = true;
        ((nb1) this.f19663c).m8680b(iOException);
        hk3 hk3VarMo5853h = ((mb1) this.f19664d).mo5853h();
        ek3 ek3Var = (ek3) this.f19662b;
        synchronized (hk3VarMo5853h) {
            try {
                if (!(iOException instanceof vc4)) {
                    if (!(hk3VarMo5853h.f20647o != null) || (iOException instanceof mk0)) {
                        hk3VarMo5853h.f20650r = true;
                        if (hk3VarMo5853h.f20653u == 0) {
                            hk3.m6415V(ek3Var.f18171a, hk3VarMo5853h.f20642j, iOException);
                            hk3VarMo5853h.f20652t++;
                        }
                    }
                } else if (((vc4) iOException).f32521a == 8) {
                    int i = hk3VarMo5853h.f20654v + 1;
                    hk3VarMo5853h.f20654v = i;
                    if (i > 1) {
                        hk3VarMo5853h.f20650r = true;
                        hk3VarMo5853h.f20652t++;
                    }
                } else if (((vc4) iOException).f32521a != 9 || !ek3Var.f18183m) {
                    hk3VarMo5853h.f20650r = true;
                    hk3VarMo5853h.f20652t++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5942f(int i, int i2) {
        if (i < 0.0f) {
            t32.m10968a("Index should be non-negative (" + i + ")");
        }
        ((a83) this.f19662b).m133i(i);
        ph2 ph2Var = (ph2) this.f19665e;
        if (i != ph2Var.f27606b) {
            ph2Var.f27606b = i;
            int i3 = (i / 30) * 30;
            ph2Var.f27605a.setValue(sc6.m10660c0(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((a83) this.f19663c).m133i(i2);
    }
}
