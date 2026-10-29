package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: us */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1230us {

    /* JADX INFO: renamed from: a */
    public int f32130a;

    /* JADX INFO: renamed from: b */
    public String f32131b;

    /* JADX INFO: renamed from: c */
    public int f32132c;

    /* JADX INFO: renamed from: d */
    public long f32133d;

    /* JADX INFO: renamed from: e */
    public long f32134e;

    /* JADX INFO: renamed from: f */
    public boolean f32135f;

    /* JADX INFO: renamed from: g */
    public int f32136g;

    /* JADX INFO: renamed from: h */
    public String f32137h;

    /* JADX INFO: renamed from: i */
    public String f32138i;

    /* JADX INFO: renamed from: j */
    public byte f32139j;

    /* JADX INFO: renamed from: a */
    public final C1267vs m11638a() {
        String str;
        String str2;
        String str3;
        if (this.f32139j == 63 && (str = this.f32131b) != null && (str2 = this.f32137h) != null && (str3 = this.f32138i) != null) {
            int i = this.f32130a;
            int i2 = this.f32132c;
            long j = this.f32133d;
            long j2 = this.f32134e;
            boolean z = this.f32135f;
            int i3 = this.f32136g;
            C1267vs c1267vs = new C1267vs();
            c1267vs.f32813a = i;
            c1267vs.f32814b = str;
            c1267vs.f32815c = i2;
            c1267vs.f32816d = j;
            c1267vs.f32817e = j2;
            c1267vs.f32818f = z;
            c1267vs.f32819g = i3;
            c1267vs.f32820h = str2;
            c1267vs.f32821i = str3;
            VarHandle.storeStoreFence();
            return c1267vs;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f32139j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f32131b == null) {
            sb.append(" model");
        }
        if ((this.f32139j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f32139j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f32139j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f32139j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f32139j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f32137h == null) {
            sb.append(" manufacturer");
        }
        if (this.f32138i == null) {
            sb.append(" modelClass");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }
}
