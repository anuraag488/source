package p000;

import android.os.Bundle;
import android.os.SystemClock;
import java.lang.invoke.VarHandle;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uh6 extends q56 {

    /* JADX INFO: renamed from: g */
    public volatile eh6 f31880g;

    /* JADX INFO: renamed from: h */
    public volatile eh6 f31881h;

    /* JADX INFO: renamed from: i */
    public eh6 f31882i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap f31883j;

    /* JADX INFO: renamed from: k */
    public pz5 f31884k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f31885l;

    /* JADX INFO: renamed from: m */
    public volatile eh6 f31886m;

    /* JADX INFO: renamed from: n */
    public eh6 f31887n;

    /* JADX INFO: renamed from: o */
    public boolean f31888o;

    /* JADX INFO: renamed from: p */
    public Object f31889p;

    /* JADX INFO: renamed from: A */
    public final eh6 m11553A(boolean z) {
        m9741u();
        mo5038t();
        eh6 eh6Var = this.f31882i;
        return (z && eh6Var == null) ? this.f31887n : eh6Var;
    }

    /* JADX INFO: renamed from: B */
    public final String m11554B(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        oa6 oa6Var = (oa6) this.f36084a;
        int length2 = str2.length();
        oa6Var.f26512d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        oa6Var.f26512d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX INFO: renamed from: C */
    public final void m11555C(pz5 pz5Var, Bundle bundle) {
        Bundle bundle2;
        if (!((oa6) this.f36084a).f26512d.m9229I() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f31883j.put(Integer.valueOf(pz5Var.f28109d), new eh6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* JADX INFO: renamed from: D */
    public final void m11556D(String str, eh6 eh6Var, boolean z) {
        eh6 eh6Var2 = this.f31880g == null ? this.f31881h : this.f31880g;
        if (eh6Var.f18106b == null) {
            eh6Var = new eh6(eh6Var.f18105a, str != null ? m11554B(str) : null, eh6Var.f18107c, eh6Var.f18109e, eh6Var.f18110f);
        }
        this.f31881h = this.f31880g;
        this.f31880g = eh6Var;
        oa6 oa6Var = (oa6) this.f36084a;
        oa6Var.f26519k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ih6 ih6Var = new ih6();
        ih6Var.f21424a = eh6Var;
        ih6Var.f21425b = eh6Var2;
        ih6Var.f21426c = jElapsedRealtime;
        ih6Var.f21427d = z;
        ih6Var.f21428e = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ih6Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX INFO: renamed from: E */
    public final void m11557E(eh6 eh6Var, eh6 eh6Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        boolean z3 = eh6Var.f18109e;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        boolean z4 = false;
        if (eh6Var2 != null) {
            if (eh6Var2.f18107c == eh6Var.f18107c && Objects.equals(eh6Var2.f18106b, eh6Var.f18106b) && Objects.equals(eh6Var2.f18105a, eh6Var.f18105a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f31882i != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            dn6.m4574l0(eh6Var, bundle2, true);
            if (eh6Var2 != null) {
                String str = eh6Var2.f18105a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = eh6Var2.f18106b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", eh6Var2.f18107c);
            }
            if (z4) {
                vk6 vk6Var = oa6Var.f26516h;
                oa6.m9015k(vk6Var);
                dx4 dx4Var = vk6Var.f32709j;
                long j2 = j - dx4Var.f17483b;
                dx4Var.f17483b = j;
                if (j2 > 0) {
                    dn6 dn6Var = oa6Var.f26517i;
                    oa6.m9014j(dn6Var);
                    dn6Var.m4602b0(bundle2, j2);
                }
            }
            if (!oa6Var.f26512d.m9229I()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            oa6Var.f26519k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j3 = eh6Var.f18110f;
                if (j3 != 0) {
                    jCurrentTimeMillis = j3;
                }
            }
            mg6 mg6Var = oa6Var.f26521m;
            oa6.m9015k(mg6Var);
            mg6Var.m8302C(str3, "_vs", bundle2, jCurrentTimeMillis);
        }
        if (z4) {
            m11558y(this.f31882i, true, j);
        }
        this.f31882i = eh6Var;
        if (z3) {
            this.f31887n = eh6Var;
        }
        oj6 oj6VarM9027n = oa6Var.m9027n();
        oj6VarM9027n.mo5038t();
        oj6VarM9027n.m9741u();
        ar1 ar1Var = new ar1((byte) 26);
        ar1Var.f14798b = eh6Var;
        ar1Var.f14799c = oj6VarM9027n;
        VarHandle.storeStoreFence();
        oj6VarM9027n.m9140J(ar1Var);
    }

    @Override // p000.q56
    /* JADX INFO: renamed from: x */
    public final boolean mo8203x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m11558y(eh6 eh6Var, boolean z, long j) {
        oa6 oa6Var = (oa6) this.f36084a;
        ly5 ly5Var = oa6Var.f26522n;
        oa6.m9013i(ly5Var);
        oa6Var.f26519k.getClass();
        ly5Var.m8151w(SystemClock.elapsedRealtime());
        boolean z2 = eh6Var != null && eh6Var.f18108d;
        vk6 vk6Var = oa6Var.f26516h;
        oa6.m9015k(vk6Var);
        if (!vk6Var.f32709j.m4793e(z2, z, j) || eh6Var == null) {
            return;
        }
        eh6Var.f18108d = false;
    }

    /* JADX INFO: renamed from: z */
    public final eh6 m11559z(pz5 pz5Var) {
        y42.m12854a0(pz5Var);
        Integer numValueOf = Integer.valueOf(pz5Var.f28109d);
        ConcurrentHashMap concurrentHashMap = this.f31883j;
        eh6 eh6Var = (eh6) concurrentHashMap.get(numValueOf);
        if (eh6Var == null) {
            String strM11554B = m11554B(pz5Var.f28110e);
            dn6 dn6Var = ((oa6) this.f36084a).f26517i;
            oa6.m9014j(dn6Var);
            eh6 eh6Var2 = new eh6(null, strM11554B, dn6Var.m4613r0());
            concurrentHashMap.put(numValueOf, eh6Var2);
            eh6Var = eh6Var2;
        }
        return this.f31886m != null ? this.f31886m : eh6Var;
    }
}
