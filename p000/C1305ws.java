package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ws */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1305ws {

    /* JADX INFO: renamed from: a */
    public long f33669a;

    /* JADX INFO: renamed from: b */
    public String f33670b;

    /* JADX INFO: renamed from: c */
    public jq0 f33671c;

    /* JADX INFO: renamed from: d */
    public kq0 f33672d;

    /* JADX INFO: renamed from: e */
    public lq0 f33673e;

    /* JADX INFO: renamed from: f */
    public oq0 f33674f;

    /* JADX INFO: renamed from: g */
    public byte f33675g;

    /* JADX INFO: renamed from: a */
    public final C1342xs m12388a() {
        String str;
        jq0 jq0Var;
        kq0 kq0Var;
        if (this.f33675g != 1 || (str = this.f33670b) == null || (jq0Var = this.f33671c) == null || (kq0Var = this.f33672d) == null) {
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f33675g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f33670b == null) {
                sb.append(" type");
            }
            if (this.f33671c == null) {
                sb.append(" app");
            }
            if (this.f33672d == null) {
                sb.append(" device");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        long j = this.f33669a;
        lq0 lq0Var = this.f33673e;
        oq0 oq0Var = this.f33674f;
        C1342xs c1342xs = new C1342xs();
        c1342xs.f34569a = j;
        c1342xs.f34570b = str;
        c1342xs.f34571c = jq0Var;
        c1342xs.f34572d = kq0Var;
        c1342xs.f34573e = lq0Var;
        c1342xs.f34574f = oq0Var;
        VarHandle.storeStoreFence();
        return c1342xs;
    }
}
