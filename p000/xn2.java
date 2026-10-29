package p000;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class xn2 {

    /* JADX INFO: renamed from: a */
    public final mc4 f34459a;

    /* JADX INFO: renamed from: b */
    public final String f34460b;

    static {
        Collections.singletonList(vd6.m11828L());
        k44 k44Var = AbstractC1310wx.f33816a;
    }

    public xn2(mc4 mc4Var, String str) {
        this.f34459a = mc4Var;
        this.f34460b = str;
    }

    /* JADX INFO: renamed from: a */
    public String m12721a() {
        return this.f34460b;
    }

    /* JADX INFO: renamed from: b */
    public final void m12722b(k44 k44Var, String str, String str2, Throwable th) {
        for (pn2 pn2Var : this.f34459a.f24820b) {
            pn2Var.getClass();
            pn2Var.mo9587a(k44Var, str2, str, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final xn2 m12723c(String str) {
        return new xn2(this.f34459a, str);
    }
}
