package p000;

import android.os.Bundle;
import android.os.SystemClock;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tm5 extends bv5 {

    /* JADX INFO: renamed from: a */
    public oa6 f31241a;

    /* JADX INFO: renamed from: b */
    public mg6 f31242b;

    @Override // p000.og6
    /* JADX INFO: renamed from: a */
    public final void mo9063a(String str, String str2, Bundle bundle) {
        mg6 mg6Var = this.f31242b;
        ((oa6) mg6Var.f36084a).f26519k.getClass();
        mg6Var.m8321z(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: b */
    public final long mo9064b() {
        dn6 dn6Var = this.f31241a.f26517i;
        oa6.m9014j(dn6Var);
        return dn6Var.m4613r0();
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: c */
    public final void mo9065c(String str, String str2, Bundle bundle) {
        mg6 mg6Var = this.f31241a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m8309J(str, str2, bundle);
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: d */
    public final String mo9066d() {
        uh6 uh6Var = ((oa6) this.f31242b.f36084a).f26520l;
        oa6.m9015k(uh6Var);
        eh6 eh6Var = uh6Var.f31880g;
        if (eh6Var != null) {
            return eh6Var.f18105a;
        }
        return null;
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: e */
    public final String mo9067e() {
        uh6 uh6Var = ((oa6) this.f31242b.f36084a).f26520l;
        oa6.m9015k(uh6Var);
        eh6 eh6Var = uh6Var.f31880g;
        if (eh6Var != null) {
            return eh6Var.f18106b;
        }
        return null;
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: f */
    public final List mo9068f(String str, String str2) {
        mg6 mg6Var = this.f31242b;
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        ea6 ea6Var = oa6Var.f26515g;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(ea6Var);
        if (ea6Var.m5030A()) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (yj5.m13150b()) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ea6 ea6Var2 = oa6Var.f26515g;
        oa6.m9016l(ea6Var2);
        yb6 yb6Var = new yb6((byte) 3);
        yb6Var.f35105c = atomicReference;
        yb6Var.f35104b = str;
        yb6Var.f35106d = str2;
        yb6Var.f35107e = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var2.m5034E(atomicReference, 5000L, "get conditional user properties", yb6Var);
        List list = (List) atomicReference.get();
        if (list != null) {
            return dn6.m4572j0(list);
        }
        oa6.m9016l(d76Var);
        d76Var.f16835j.m12505b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: g */
    public final void mo9069g(Bundle bundle) {
        mg6 mg6Var = this.f31242b;
        ((oa6) mg6Var.f36084a).f26519k.getClass();
        mg6Var.m8308I(bundle, System.currentTimeMillis());
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: h */
    public final int mo9070h(String str) {
        mg6 mg6Var = this.f31242b;
        mg6Var.getClass();
        y42.m12851X(str);
        op5 op5Var = ((oa6) mg6Var.f36084a).f26512d;
        return 25;
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: i */
    public final String mo9071i() {
        return (String) this.f31242b.f24902k.get();
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: j */
    public final void mo9072j(String str) {
        oa6 oa6Var = this.f31241a;
        ly5 ly5Var = oa6Var.f26522n;
        oa6.m9013i(ly5Var);
        oa6Var.f26519k.getClass();
        ly5Var.m8150v(str, SystemClock.elapsedRealtime());
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: k */
    public final String mo9073k() {
        return (String) this.f31242b.f24902k.get();
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: l */
    public final Map mo9074l(String str, String str2, boolean z) {
        mg6 mg6Var = this.f31242b;
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        ea6 ea6Var = oa6Var.f26515g;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(ea6Var);
        if (ea6Var.m5030A()) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (yj5.m13150b()) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        ea6 ea6Var2 = oa6Var.f26515g;
        oa6.m9016l(ea6Var2);
        fe6 fe6Var = new fe6((byte) 1);
        fe6Var.f18935e = atomicReference;
        fe6Var.f18932b = str;
        fe6Var.f18933c = str2;
        fe6Var.f18934d = z;
        fe6Var.f18936f = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var2.m5034E(atomicReference, 5000L, "get user properties", fe6Var);
        List<xm6> list = (List) atomicReference.get();
        if (list == null) {
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C0805jo c0805jo = new C0805jo(list.size());
        for (xm6 xm6Var : list) {
            Object objM12714f = xm6Var.m12714f();
            if (objM12714f != null) {
                c0805jo.put(xm6Var.f34428e, objM12714f);
            }
        }
        return c0805jo;
    }

    @Override // p000.og6
    /* JADX INFO: renamed from: m */
    public final void mo9075m(String str) {
        oa6 oa6Var = this.f31241a;
        ly5 ly5Var = oa6Var.f26522n;
        oa6.m9013i(ly5Var);
        oa6Var.f26519k.getClass();
        ly5Var.m8149u(str, SystemClock.elapsedRealtime());
    }
}
