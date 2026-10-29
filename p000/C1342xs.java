package p000;

/* JADX INFO: renamed from: xs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1342xs extends pq0 {

    /* JADX INFO: renamed from: a */
    public long f34569a;

    /* JADX INFO: renamed from: b */
    public String f34570b;

    /* JADX INFO: renamed from: c */
    public jq0 f34571c;

    /* JADX INFO: renamed from: d */
    public kq0 f34572d;

    /* JADX INFO: renamed from: e */
    public lq0 f34573e;

    /* JADX INFO: renamed from: f */
    public oq0 f34574f;

    /* JADX INFO: renamed from: a */
    public final C1305ws m12754a() {
        C1305ws c1305ws = new C1305ws();
        c1305ws.f33669a = this.f34569a;
        c1305ws.f33670b = this.f34570b;
        c1305ws.f33671c = this.f34571c;
        c1305ws.f33672d = this.f34572d;
        c1305ws.f33673e = this.f34573e;
        c1305ws.f33674f = this.f34574f;
        c1305ws.f33675g = (byte) 1;
        return c1305ws;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pq0) {
            C1342xs c1342xs = (C1342xs) ((pq0) obj);
            if (this.f34569a == c1342xs.f34569a && this.f34570b.equals(c1342xs.f34570b) && this.f34571c.equals(c1342xs.f34571c) && this.f34572d.equals(c1342xs.f34572d)) {
                lq0 lq0Var = this.f34573e;
                lq0 lq0Var2 = c1342xs.f34573e;
                if (lq0Var != null ? lq0Var.equals(lq0Var2) : lq0Var2 == null) {
                    oq0 oq0Var = this.f34574f;
                    oq0 oq0Var2 = c1342xs.f34574f;
                    if (oq0Var != null ? oq0Var.equals(oq0Var2) : oq0Var2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f34569a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f34570b.hashCode()) * 1000003) ^ this.f34571c.hashCode()) * 1000003) ^ this.f34572d.hashCode()) * 1000003;
        lq0 lq0Var = this.f34573e;
        int iHashCode2 = (iHashCode ^ (lq0Var == null ? 0 : lq0Var.hashCode())) * 1000003;
        oq0 oq0Var = this.f34574f;
        return iHashCode2 ^ (oq0Var != null ? oq0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f34569a + ", type=" + this.f34570b + ", app=" + this.f34571c + ", device=" + this.f34572d + ", log=" + this.f34573e + ", rollouts=" + this.f34574f + "}";
    }
}
