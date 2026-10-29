package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: ys */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1379ys {

    /* JADX INFO: renamed from: a */
    public hq0 f35483a;

    /* JADX INFO: renamed from: b */
    public List f35484b;

    /* JADX INFO: renamed from: c */
    public List f35485c;

    /* JADX INFO: renamed from: d */
    public Boolean f35486d;

    /* JADX INFO: renamed from: e */
    public iq0 f35487e;

    /* JADX INFO: renamed from: f */
    public List f35488f;

    /* JADX INFO: renamed from: g */
    public int f35489g;

    /* JADX INFO: renamed from: h */
    public byte f35490h;

    /* JADX INFO: renamed from: a */
    public final C1416zs m13230a() {
        hq0 hq0Var;
        if (this.f35490h != 1 || (hq0Var = this.f35483a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f35483a == null) {
                sb.append(" execution");
            }
            if ((this.f35490h & 1) == 0) {
                sb.append(" uiOrientation");
            }
            C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
            return null;
        }
        List list = this.f35484b;
        List list2 = this.f35485c;
        Boolean bool = this.f35486d;
        iq0 iq0Var = this.f35487e;
        List list3 = this.f35488f;
        int i = this.f35489g;
        C1416zs c1416zs = new C1416zs();
        c1416zs.f36331a = hq0Var;
        c1416zs.f36332b = list;
        c1416zs.f36333c = list2;
        c1416zs.f36334d = bool;
        c1416zs.f36335e = iq0Var;
        c1416zs.f36336f = list3;
        c1416zs.f36337g = i;
        VarHandle.storeStoreFence();
        return c1416zs;
    }
}
