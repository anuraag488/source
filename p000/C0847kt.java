package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: kt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0847kt {

    /* JADX INFO: renamed from: a */
    public long f23407a;

    /* JADX INFO: renamed from: b */
    public String f23408b;

    /* JADX INFO: renamed from: c */
    public String f23409c;

    /* JADX INFO: renamed from: d */
    public long f23410d;

    /* JADX INFO: renamed from: e */
    public int f23411e;

    /* JADX INFO: renamed from: f */
    public byte f23412f;

    /* JADX INFO: renamed from: a */
    public final C0884lt m7627a() {
        String str;
        if (this.f23412f != 7 || (str = this.f23408b) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f23412f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f23408b == null) {
                sb.append(" symbol");
            }
            if ((this.f23412f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f23412f & 4) == 0) {
                sb.append(" importance");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        long j = this.f23407a;
        String str2 = this.f23409c;
        long j2 = this.f23410d;
        int i = this.f23411e;
        C0884lt c0884lt = new C0884lt();
        c0884lt.f24340a = j;
        c0884lt.f24341b = str;
        c0884lt.f24342c = str2;
        c0884lt.f24343d = j2;
        c0884lt.f24344e = i;
        VarHandle.storeStoreFence();
        return c0884lt;
    }
}
