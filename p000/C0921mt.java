package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: mt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0921mt {

    /* JADX INFO: renamed from: a */
    public String f25181a;

    /* JADX INFO: renamed from: b */
    public int f25182b;

    /* JADX INFO: renamed from: c */
    public int f25183c;

    /* JADX INFO: renamed from: d */
    public boolean f25184d;

    /* JADX INFO: renamed from: e */
    public byte f25185e;

    /* JADX INFO: renamed from: a */
    public final C0958nt m8390a() {
        String str;
        if (this.f25185e == 7 && (str = this.f25181a) != null) {
            int i = this.f25182b;
            int i2 = this.f25183c;
            boolean z = this.f25184d;
            C0958nt c0958nt = new C0958nt();
            c0958nt.f26072a = str;
            c0958nt.f26073b = i;
            c0958nt.f26074c = i2;
            c0958nt.f26075d = z;
            VarHandle.storeStoreFence();
            return c0958nt;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f25181a == null) {
            sb.append(" processName");
        }
        if ((this.f25185e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f25185e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f25185e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }
}
