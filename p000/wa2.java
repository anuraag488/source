package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wa2 extends ba2 {

    /* JADX INFO: renamed from: a */
    public final pl2 f33192a;

    public wa2() {
        vl1 vl1Var = pl2.f27727i;
        this.f33192a = new pl2(false);
    }

    /* JADX INFO: renamed from: A */
    public final o92 m12176A(String str) {
        return (o92) this.f33192a.get(str);
    }

    /* JADX INFO: renamed from: B */
    public final wa2 m12177B(String str) {
        return (wa2) this.f33192a.get(str);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m12178C() {
        return this.f33192a.containsKey("ping_strategy");
    }

    /* JADX INFO: renamed from: D */
    public final void m12179D(String str) {
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof wa2) && ((wa2) obj).f33192a.equals(this.f33192a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f33192a.hashCode();
    }

    /* JADX INFO: renamed from: t */
    public final void m12180t(String str, ba2 ba2Var) {
        if (ba2Var == null) {
            ba2Var = sa2.f30035a;
        }
        this.f33192a.put(str, ba2Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m12181u(Number number, String str) {
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = number;
        m12180t(str, gb2Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m12182v(String str, Boolean bool) {
        ba2 ba2Var;
        if (bool == null) {
            ba2Var = sa2.f30035a;
        } else {
            gb2 gb2Var = new gb2();
            gb2Var.f19705a = bool;
            ba2Var = gb2Var;
        }
        m12180t(str, ba2Var);
    }

    /* JADX INFO: renamed from: w */
    public final void m12183w(String str, String str2) {
        ba2 ba2Var;
        if (str2 == null) {
            ba2Var = sa2.f30035a;
        } else {
            gb2 gb2Var = new gb2();
            gb2Var.f19705a = str2;
            ba2Var = gb2Var;
        }
        m12180t(str, ba2Var);
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final wa2 mo3522a() {
        wa2 wa2Var = new wa2();
        Iterator it = ((nl2) this.f33192a.entrySet()).iterator();
        while (((ml2) it).hasNext()) {
            ol2 ol2VarM8344a = ((ml2) it).m8344a();
            wa2Var.m12180t((String) ol2VarM8344a.getKey(), ((ba2) ol2VarM8344a.getValue()).mo3522a());
        }
        return wa2Var;
    }

    /* JADX INFO: renamed from: y */
    public final nl2 m12185y() {
        return (nl2) this.f33192a.entrySet();
    }

    /* JADX INFO: renamed from: z */
    public final ba2 m12186z(String str) {
        return (ba2) this.f33192a.get(str);
    }
}
