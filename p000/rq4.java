package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rq4 implements j41 {

    /* JADX INFO: renamed from: a */
    public final int f29529a;

    /* JADX INFO: renamed from: b */
    public final int f29530b;

    /* JADX INFO: renamed from: c */
    public final g51 f29531c;

    public rq4(int i, int i2, g51 g51Var) {
        this.f29529a = i;
        this.f29530b = i2;
        this.f29531c = g51Var;
    }

    @Override // p000.InterfaceC1407zj
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ yw4 mo4410a(sq4 sq4Var) {
        return m10400f();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rq4) {
            rq4 rq4Var = (rq4) obj;
            if (rq4Var.f29529a == this.f29529a && rq4Var.f29530b == this.f29530b && z62.m13387o(rq4Var.f29531c, this.f29531c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final e00 m10400f() {
        e00 e00Var = new e00();
        int i = this.f29529a;
        e00Var.f17552a = i;
        int i2 = this.f29530b;
        e00Var.f17553b = i2;
        ni1 ni1Var = new ni1();
        ni1Var.f25842a = i;
        ni1Var.f25843b = this.f29531c;
        ni1Var.f25844c = ((long) i) * 1000000;
        ni1Var.f25845d = ((long) i2) * 1000000;
        VarHandle.storeStoreFence();
        e00Var.f17554c = new C1283w7(ni1Var);
        VarHandle.storeStoreFence();
        return e00Var;
    }

    public final int hashCode() {
        return ((this.f29531c.hashCode() + (this.f29529a * 31)) * 31) + this.f29530b;
    }

    @Override // p000.j41, p000.InterfaceC1407zj
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ax4 mo4410a(sq4 sq4Var) {
        return m10400f();
    }
}
