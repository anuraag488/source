package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ft */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0663ft {

    /* JADX INFO: renamed from: a */
    public String f19265a;

    /* JADX INFO: renamed from: b */
    public String f19266b;

    /* JADX INFO: renamed from: c */
    public long f19267c;

    /* JADX INFO: renamed from: d */
    public byte f19268d;

    /* JADX INFO: renamed from: a */
    public final C0700gt m5803a() {
        String str;
        String str2;
        if (this.f19268d == 1 && (str = this.f19265a) != null && (str2 = this.f19266b) != null) {
            long j = this.f19267c;
            C0700gt c0700gt = new C0700gt();
            c0700gt.f20110a = str;
            c0700gt.f20111b = str2;
            c0700gt.f20112c = j;
            VarHandle.storeStoreFence();
            return c0700gt;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19265a == null) {
            sb.append(" name");
        }
        if (this.f19266b == null) {
            sb.append(" code");
        }
        if ((this.f19268d & 1) == 0) {
            sb.append(" address");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }
}
