package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 {

    /* JADX INFO: renamed from: a */
    public boolean f25900a = true;

    /* JADX INFO: renamed from: b */
    public String[] f25901b;

    /* JADX INFO: renamed from: c */
    public String[] f25902c;

    /* JADX INFO: renamed from: d */
    public boolean f25903d;

    /* JADX INFO: renamed from: a */
    public final ok0 m8785a() {
        boolean z = this.f25900a;
        boolean z2 = this.f25903d;
        String[] strArr = this.f25901b;
        String[] strArr2 = this.f25902c;
        ok0 ok0Var = new ok0();
        ok0Var.f26798a = z;
        ok0Var.f26799b = z2;
        ok0Var.f26800c = strArr;
        ok0Var.f26801d = strArr2;
        VarHandle.storeStoreFence();
        return ok0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m8786b(m90... m90VarArr) {
        if (!this.f25900a) {
            C1077qn.m9987m("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(m90VarArr.length);
        for (m90 m90Var : m90VarArr) {
            arrayList.add(m90Var.f24763a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m8787c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: c */
    public final void m8787c(String... strArr) {
        if (!this.f25900a) {
            C1077qn.m9987m("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f25901b = (String[]) strArr.clone();
        } else {
            C1077qn.m9987m("At least one cipher suite is required");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8788d(dn4... dn4VarArr) {
        if (!this.f25900a) {
            C1077qn.m9987m("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(dn4VarArr.length);
        for (dn4 dn4Var : dn4VarArr) {
            arrayList.add(dn4Var.f17219a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m8789e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public final void m8789e(String... strArr) {
        if (!this.f25900a) {
            C1077qn.m9987m("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.f25902c = (String[]) strArr.clone();
        } else {
            C1077qn.m9987m("At least one TLS version is required");
        }
    }
}
