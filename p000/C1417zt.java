package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1417zt {

    /* JADX INFO: renamed from: a */
    public final Object f36349a;

    /* JADX INFO: renamed from: b */
    public final ag3 f36350b;

    public C1417zt(Object obj, ag3 ag3Var) {
        if (obj == null) {
            xy4.m12782k("Null payload");
            throw null;
        }
        this.f36349a = obj;
        this.f36350b = ag3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1417zt)) {
            return false;
        }
        C1417zt c1417zt = (C1417zt) obj;
        return this.f36349a.equals(c1417zt.f36349a) && this.f36350b.equals(c1417zt.f36350b);
    }

    public final int hashCode() {
        return (this.f36350b.hashCode() ^ (((1000003 * 1000003) ^ this.f36349a.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f36349a + ", priority=" + this.f36350b + ", productData=null, eventContext=null}";
    }
}
