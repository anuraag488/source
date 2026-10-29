package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z64 implements wv3 {

    /* JADX INFO: renamed from: a */
    public Object f35793a;

    /* JADX INFO: renamed from: b */
    public ny2 f35794b;

    /* JADX INFO: renamed from: c */
    public List f35795c;

    /* JADX INFO: renamed from: d */
    public List f35796d;

    /* JADX INFO: renamed from: e */
    public pg0 f35797e;

    @Override // p000.wv3
    /* JADX INFO: renamed from: a */
    public final List mo12426a() {
        return this.f35796d;
    }

    @Override // p000.wv3
    /* JADX INFO: renamed from: b */
    public final List mo12427b() {
        return this.f35795c;
    }

    @Override // p000.wv3
    /* JADX INFO: renamed from: c */
    public final pg0 mo12428c() {
        return this.f35797e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z64.class != obj.getClass()) {
            return false;
        }
        z64 z64Var = (z64) obj;
        return z62.m13387o(this.f35793a, z64Var.f35793a) && z62.m13387o(this.f35794b, z64Var.f35794b) && this.f35795c.equals(z64Var.f35795c) && this.f35796d.equals(z64Var.f35796d);
    }

    @Override // p000.wv3
    public final Object getKey() {
        return this.f35793a;
    }

    public final int hashCode() {
        return (this.f35796d.hashCode() * 31) + (this.f35795c.hashCode() * 31) + (this.f35794b.hashCode() * 31) + (this.f35793a.hashCode() * 31);
    }

    public final String toString() {
        return "SinglePaneScene(key=" + this.f35793a + ", entry=" + this.f35794b + ", previousEntries=" + this.f35795c + ", entries=" + this.f35796d + ")";
    }
}
