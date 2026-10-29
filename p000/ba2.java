package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ba2 {
    /* JADX INFO: renamed from: a */
    public ba2 mo3522a() {
        return sa2.f30035a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo3523b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: c */
    public double mo3524c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: d */
    public float mo3525d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: e */
    public int mo3526e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: g */
    public final o92 m3527g() {
        if (this instanceof o92) {
            return (o92) this;
        }
        wb1.m12196p(this, "Not a JSON Array: ");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final wa2 m3528l() {
        if (this instanceof wa2) {
            return (wa2) this;
        }
        wb1.m12196p(this, "Not a JSON Object: ");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final gb2 m3529m() {
        if (this instanceof gb2) {
            return (gb2) this;
        }
        wb1.m12196p(this, "Not a JSON Primitive: ");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public long mo3530q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: r */
    public Number mo3531r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: s */
    public String mo3532s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            yb2 yb2Var = new yb2(new ad4(sb));
            yb2Var.f35097h = 1;
            ga2 ga2Var = zr4.f36319z;
            ga2Var.getClass();
            ga2Var.mo167c(this, yb2Var);
            return sb.toString();
        } catch (IOException e) {
            C1077qn.m9985k(e);
            return null;
        }
    }
}
