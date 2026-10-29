package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class c91 extends st2 {

    /* JADX INFO: renamed from: a */
    public dp4 f15883a;

    /* JADX INFO: renamed from: b */
    public yo4 f15884b;

    /* JADX INFO: renamed from: c */
    public yo4 f15885c;

    /* JADX INFO: renamed from: d */
    public yo4 f15886d;

    /* JADX INFO: renamed from: e */
    public p91 f15887e;

    /* JADX INFO: renamed from: f */
    public mc1 f15888f;

    /* JADX INFO: renamed from: g */
    public b54 f15889g;

    /* JADX INFO: renamed from: h */
    public wp1 f15890h;

    /* JADX INFO: renamed from: i */
    public d91 f15891i;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        dp4 dp4Var = this.f15883a;
        yo4 yo4Var = this.f15884b;
        yo4 yo4Var2 = this.f15885c;
        yo4 yo4Var3 = this.f15886d;
        p91 p91Var = this.f15887e;
        mc1 mc1Var = this.f15888f;
        b54 b54Var = this.f15889g;
        wp1 wp1Var = this.f15890h;
        d91 d91Var = this.f15891i;
        o91 o91Var = new o91();
        o91Var.f26479o = dp4Var;
        o91Var.f26480p = yo4Var;
        o91Var.f26481q = yo4Var2;
        o91Var.f26482r = yo4Var3;
        o91Var.f26483s = p91Var;
        o91Var.f26484t = mc1Var;
        o91Var.f26485u = b54Var;
        o91Var.f26486v = wp1Var;
        o91Var.f26487w = d91Var;
        o91Var.f26488x = -9223372034707292160L;
        ll0.m8010b(0, 0, 0, 0, 15);
        o91Var.f26490z = new n91(o91Var, (byte) 0);
        o91Var.f26478A = new n91(o91Var, (byte) 1);
        VarHandle.storeStoreFence();
        return o91Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c91)) {
            return false;
        }
        c91 c91Var = (c91) obj;
        return z62.m13387o(c91Var.f15883a, this.f15883a) && z62.m13387o(c91Var.f15884b, this.f15884b) && z62.m13387o(c91Var.f15885c, this.f15885c) && z62.m13387o(c91Var.f15886d, this.f15886d) && z62.m13387o(c91Var.f15887e, this.f15887e) && z62.m13387o(c91Var.f15888f, this.f15888f) && z62.m13387o(c91Var.f15889g, this.f15889g) && c91Var.f15890h == this.f15890h && z62.m13387o(c91Var.f15891i, this.f15891i);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        o91 o91Var = (o91) mt2Var;
        o91Var.f26479o = this.f15883a;
        o91Var.f26480p = this.f15884b;
        o91Var.f26481q = this.f15885c;
        o91Var.f26482r = this.f15886d;
        o91Var.f26483s = this.f15887e;
        o91Var.f26484t = this.f15888f;
        o91Var.f26485u = this.f15889g;
        o91Var.f26486v = this.f15890h;
        o91Var.f26487w = this.f15891i;
    }

    public final int hashCode() {
        int iHashCode = this.f15883a.hashCode() * 31;
        yo4 yo4Var = this.f15884b;
        int iHashCode2 = (iHashCode + (yo4Var != null ? yo4Var.hashCode() : 0)) * 31;
        yo4 yo4Var2 = this.f15885c;
        int iHashCode3 = (iHashCode2 + (yo4Var2 != null ? yo4Var2.hashCode() : 0)) * 31;
        yo4 yo4Var3 = this.f15886d;
        return this.f15889g.hashCode() + (this.f15891i.hashCode() * 31) + ((this.f15890h.hashCode() + ((this.f15888f.f24813a.hashCode() + ((this.f15887e.f27464a.hashCode() + ((iHashCode3 + (yo4Var3 != null ? yo4Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
