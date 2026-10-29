package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: ht */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0737ht {

    /* JADX INFO: renamed from: a */
    public String f20832a;

    /* JADX INFO: renamed from: b */
    public int f20833b;

    /* JADX INFO: renamed from: c */
    public List f20834c;

    /* JADX INFO: renamed from: d */
    public byte f20835d;

    /* JADX INFO: renamed from: a */
    public final C0810jt m6503a() {
        String str;
        List list;
        if (this.f20835d == 1 && (str = this.f20832a) != null && (list = this.f20834c) != null) {
            int i = this.f20833b;
            C0810jt c0810jt = new C0810jt();
            c0810jt.f22597a = str;
            c0810jt.f22598b = i;
            c0810jt.f22599c = list;
            VarHandle.storeStoreFence();
            return c0810jt;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f20832a == null) {
            sb.append(" name");
        }
        if ((1 & this.f20835d) == 0) {
            sb.append(" importance");
        }
        if (this.f20834c == null) {
            sb.append(" frames");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }
}
