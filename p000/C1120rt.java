package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: rt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1120rt {

    /* JADX INFO: renamed from: a */
    public C1194tt f29590a;

    /* JADX INFO: renamed from: b */
    public String f29591b;

    /* JADX INFO: renamed from: c */
    public String f29592c;

    /* JADX INFO: renamed from: d */
    public long f29593d;

    /* JADX INFO: renamed from: e */
    public byte f29594e;

    /* JADX INFO: renamed from: a */
    public final C1157st m10424a() {
        C1194tt c1194tt;
        String str;
        String str2;
        if (this.f29594e == 1 && (c1194tt = this.f29590a) != null && (str = this.f29591b) != null && (str2 = this.f29592c) != null) {
            long j = this.f29593d;
            C1157st c1157st = new C1157st();
            c1157st.f30548a = c1194tt;
            c1157st.f30549b = str;
            c1157st.f30550c = str2;
            c1157st.f30551d = j;
            VarHandle.storeStoreFence();
            return c1157st;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29590a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f29591b == null) {
            sb.append(" parameterKey");
        }
        if (this.f29592c == null) {
            sb.append(" parameterValue");
        }
        if ((this.f29594e & 1) == 0) {
            sb.append(" templateVersion");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }
}
