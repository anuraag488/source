package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ly5 extends t36 {

    /* JADX INFO: renamed from: f */
    public C0805jo f24474f;

    /* JADX INFO: renamed from: g */
    public C0805jo f24475g;

    /* JADX INFO: renamed from: h */
    public long f24476h;

    /* JADX INFO: renamed from: u */
    public final void m8149u(String str, long j) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (str == null || str.length() == 0) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Ad unit id must be a non-empty string");
            return;
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        um5 um5Var = new um5((byte) 0);
        um5Var.f31995b = str;
        um5Var.f31996c = j;
        um5Var.f31997d = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(um5Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m8150v(String str, long j) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (str == null || str.length() == 0) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Ad unit id must be a non-empty string");
            return;
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        um5 um5Var = new um5((byte) 1);
        um5Var.f31995b = str;
        um5Var.f31996c = j;
        um5Var.f31997d = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(um5Var);
    }

    /* JADX INFO: renamed from: w */
    public final void m8151w(long j) {
        uh6 uh6Var = ((oa6) this.f36084a).f26520l;
        oa6.m9015k(uh6Var);
        eh6 eh6VarM11553A = uh6Var.m11553A(false);
        C0805jo c0805jo = this.f24474f;
        for (String str : (C0695go) c0805jo.keySet()) {
            m8153y(str, j - ((Long) c0805jo.get(str)).longValue(), eh6VarM11553A);
        }
        if (!c0805jo.isEmpty()) {
            m8152x(j - this.f24476h, eh6VarM11553A);
        }
        m8154z(j);
    }

    /* JADX INFO: renamed from: x */
    public final void m8152x(long j, eh6 eh6Var) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (eh6Var == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12504a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16831L.m12505b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            dn6.m4574l0(eh6Var, bundle, true);
            mg6 mg6Var = oa6Var.f26521m;
            oa6.m9015k(mg6Var);
            mg6Var.m8301B("am", "_xa", bundle);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m8153y(String str, long j, eh6 eh6Var) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (eh6Var == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12504a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16831L.m12505b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            dn6.m4574l0(eh6Var, bundle, true);
            mg6 mg6Var = oa6Var.f26521m;
            oa6.m9015k(mg6Var);
            mg6Var.m8301B("am", "_xu", bundle);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8154z(long j) {
        C0805jo c0805jo = this.f24474f;
        Iterator it = ((C0695go) c0805jo.keySet()).iterator();
        while (it.hasNext()) {
            c0805jo.put((String) it.next(), Long.valueOf(j));
        }
        if (c0805jo.isEmpty()) {
            return;
        }
        this.f24476h = j;
    }
}
