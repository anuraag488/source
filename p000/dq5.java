package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dq5 implements aq5 {

    /* JADX INFO: renamed from: a */
    public String f17286a;

    /* JADX INFO: renamed from: b */
    public ArrayList f17287b;

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq5)) {
            return false;
        }
        dq5 dq5Var = (dq5) obj;
        String str = this.f17286a;
        String str2 = dq5Var.f17286a;
        if (str == null ? str2 == null : str.equals(str2)) {
            return this.f17287b.equals(dq5Var.f17287b);
        }
        return false;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f17286a;
        return this.f17287b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        return null;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: m */
    public final Double mo3119m() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: q */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        return this;
    }
}
