package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wb2 extends yb2 {

    /* JADX INFO: renamed from: r */
    public static final vb2 f33213r = new vb2();

    /* JADX INFO: renamed from: s */
    public static final gb2 f33214s;

    /* JADX INFO: renamed from: o */
    public ArrayList f33215o;

    /* JADX INFO: renamed from: p */
    public String f33216p;

    /* JADX INFO: renamed from: q */
    public ba2 f33217q;

    static {
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = "closed";
        VarHandle.storeStoreFence();
        f33214s = gb2Var;
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: C */
    public final void mo12198C(double d) {
        if (this.f35097h != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        Double dValueOf = Double.valueOf(d);
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = dValueOf;
        m12205P(gb2Var);
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: D */
    public final void mo12199D(long j) {
        Long lValueOf = Long.valueOf(j);
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = lValueOf;
        m12205P(gb2Var);
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: J */
    public final void mo12200J(Boolean bool) {
        if (bool == null) {
            m12205P(sa2.f30035a);
            return;
        }
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = bool;
        m12205P(gb2Var);
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: K */
    public final void mo12201K(Number number) {
        if (number == null) {
            m12205P(sa2.f30035a);
            return;
        }
        if (this.f35097h != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                wb1.m12195o(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = number;
        m12205P(gb2Var);
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: L */
    public final void mo12202L(String str) {
        if (str == null) {
            m12205P(sa2.f30035a);
            return;
        }
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = str;
        m12205P(gb2Var);
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: M */
    public final void mo12203M(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = boolValueOf;
        m12205P(gb2Var);
    }

    /* JADX INFO: renamed from: O */
    public final ba2 m12204O() {
        ArrayList arrayList = this.f33215o;
        return (ba2) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: P */
    public final void m12205P(ba2 ba2Var) {
        if (this.f33216p != null) {
            if (!(ba2Var instanceof sa2) || this.f35100k) {
                ((wa2) m12204O()).m12180t(this.f33216p, ba2Var);
            }
            this.f33216p = null;
            return;
        }
        if (this.f33215o.isEmpty()) {
            this.f33217q = ba2Var;
            return;
        }
        ba2 ba2VarM12204O = m12204O();
        if (ba2VarM12204O instanceof o92) {
            ((o92) ba2VarM12204O).m9006t(ba2Var);
        } else {
            xy4.m12787p();
        }
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: b */
    public final void mo12206b() {
        o92 o92Var = new o92();
        m12205P(o92Var);
        this.f33215o.add(o92Var);
    }

    @Override // p000.yb2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f33215o;
        if (arrayList.isEmpty()) {
            arrayList.add(f33214s);
        } else {
            wb1.m12191j("Incomplete document");
        }
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: e */
    public final void mo12207e() {
        wa2 wa2Var = new wa2();
        m12205P(wa2Var);
        this.f33215o.add(wa2Var);
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: j */
    public final void mo12208j() {
        ArrayList arrayList = this.f33215o;
        if (arrayList.isEmpty() || this.f33216p != null) {
            xy4.m12787p();
        } else if (m12204O() instanceof o92) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            xy4.m12787p();
        }
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: k */
    public final void mo12209k() {
        ArrayList arrayList = this.f33215o;
        if (arrayList.isEmpty() || this.f33216p != null) {
            xy4.m12787p();
        } else if (m12204O() instanceof wa2) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            xy4.m12787p();
        }
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: l */
    public final void mo12210l(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f33215o.isEmpty() || this.f33216p != null) {
            C1077qn.m9989o("Did not expect a name");
        } else if (m12204O() instanceof wa2) {
            this.f33216p = str;
        } else {
            C1077qn.m9989o("Please begin an object before writing a name.");
        }
    }

    @Override // p000.yb2
    /* JADX INFO: renamed from: t */
    public final yb2 mo12211t() {
        m12205P(sa2.f30035a);
        return this;
    }

    @Override // p000.yb2, java.io.Flushable
    public final void flush() {
    }
}
