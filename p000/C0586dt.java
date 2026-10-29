package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: dt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0586dt {

    /* JADX INFO: renamed from: a */
    public String f17337a;

    /* JADX INFO: renamed from: b */
    public String f17338b;

    /* JADX INFO: renamed from: c */
    public List f17339c;

    /* JADX INFO: renamed from: d */
    public dq0 f17340d;

    /* JADX INFO: renamed from: e */
    public int f17341e;

    /* JADX INFO: renamed from: f */
    public byte f17342f;

    /* JADX INFO: renamed from: a */
    public final C0625et m4678a() {
        String str;
        List list;
        if (this.f17342f != 1 || (str = this.f17337a) == null || (list = this.f17339c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f17337a == null) {
                sb.append(" type");
            }
            if (this.f17339c == null) {
                sb.append(" frames");
            }
            if ((this.f17342f & 1) == 0) {
                sb.append(" overflowCount");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        String str2 = this.f17338b;
        dq0 dq0Var = this.f17340d;
        int i = this.f17341e;
        C0625et c0625et = new C0625et();
        c0625et.f18456a = str;
        c0625et.f18457b = str2;
        c0625et.f18458c = list;
        c0625et.f18459d = dq0Var;
        c0625et.f18460e = i;
        VarHandle.storeStoreFence();
        return c0625et;
    }
}
