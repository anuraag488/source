package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xf3 implements g24 {

    /* JADX INFO: renamed from: a */
    public final String f34235a;

    /* JADX INFO: renamed from: b */
    public final tf3 f34236b;

    public xf3(String str, tf3 tf3Var) {
        this.f34235a = str;
        this.f34236b = tf3Var;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        m12694g();
        throw null;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return this.f34235a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        return this.f34236b;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        return 0;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        m12694g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf3)) {
            return false;
        }
        xf3 xf3Var = (xf3) obj;
        return this.f34235a.equals(xf3Var.f34235a) && z62.m13387o(this.f34236b, xf3Var.f34236b);
    }

    /* JADX INFO: renamed from: g */
    public final void m12694g() {
        throw new IllegalStateException(zi4.m13623w(new StringBuilder("Primitive descriptor "), this.f34235a, " does not have elements"));
    }

    public final int hashCode() {
        return (this.f34236b.hashCode() * 31) + this.f34235a.hashCode();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        m12694g();
        throw null;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        m12694g();
        throw null;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        m12694g();
        throw null;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f34235a + ')';
    }
}
