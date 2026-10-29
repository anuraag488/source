package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: bt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0503bt {

    /* JADX INFO: renamed from: a */
    public long f15559a;

    /* JADX INFO: renamed from: b */
    public long f15560b;

    /* JADX INFO: renamed from: c */
    public String f15561c;

    /* JADX INFO: renamed from: d */
    public String f15562d;

    /* JADX INFO: renamed from: e */
    public byte f15563e;

    /* JADX INFO: renamed from: a */
    public final C0550ct m3667a() {
        String str;
        if (this.f15563e != 3 || (str = this.f15561c) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f15563e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f15563e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f15561c == null) {
                sb.append(" name");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        long j = this.f15559a;
        long j2 = this.f15560b;
        String str2 = this.f15562d;
        C0550ct c0550ct = new C0550ct();
        c0550ct.f16438a = j;
        c0550ct.f16439b = j2;
        c0550ct.f16440c = str;
        c0550ct.f16441d = str2;
        VarHandle.storeStoreFence();
        return c0550ct;
    }
}
