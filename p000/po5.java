package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class po5 implements aq5 {

    /* JADX INFO: renamed from: a */
    public final aq5 f27868a;

    /* JADX INFO: renamed from: b */
    public final String f27869b;

    public po5(String str) {
        this.f27868a = aq5.f14781np;
        this.f27869b = str;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof po5)) {
            return false;
        }
        po5 po5Var = (po5) obj;
        return this.f27869b.equals(po5Var.f27869b) && this.f27868a.equals(po5Var.f27868a);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.f27868a.hashCode() + (this.f27869b.hashCode() * 31);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        return null;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: m */
    public final Double mo3119m() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: q */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        return new po5(this.f27869b, this.f27868a.mo3121r());
    }

    public po5(String str, aq5 aq5Var) {
        this.f27868a = aq5Var;
        this.f27869b = str;
    }
}
