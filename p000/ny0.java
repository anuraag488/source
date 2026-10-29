package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a */
    public final ni3 f26188a;

    /* JADX INFO: renamed from: b */
    public final byte f26189b;

    /* JADX INFO: renamed from: c */
    public final byte f26190c;

    /* JADX WARN: Multi-variable type inference failed */
    public ny0(ni3 ni3Var, int i, int i2) {
        ev0.m5342Q(ni3Var, "Null dependency anInterface.");
        this.f26188a = ni3Var;
        this.f26189b = i;
        this.f26190c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static ny0 m8896a(ni3 ni3Var) {
        return new ny0(ni3Var, 1, 0);
    }

    /* JADX INFO: renamed from: b */
    public static ny0 m8897b(Class cls) {
        return new ny0(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ny0)) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return this.f26188a.equals(ny0Var.f26188a) && this.f26189b == ny0Var.f26189b && this.f26190c == ny0Var.f26190c;
    }

    public final int hashCode() {
        return this.f26190c ^ ((((this.f26188a.hashCode() ^ 1000003) * 1000003) ^ this.f26189b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f26188a);
        sb.append(", type=");
        byte b = this.f26189b;
        if (b == 1) {
            str = "required";
        } else {
            str = b == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        byte b2 = this.f26190c;
        if (b2 == 0) {
            str2 = "direct";
        } else if (b2 == 1) {
            str2 = "provider";
        } else {
            if (b2 != 2) {
                C1077qn.m9985k(c75.m3877i(b2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return zi4.m13623w(sb, str2, "}");
    }

    public ny0(Class cls, int i, int i2) {
        this(ni3.m8779a(cls), i, i2);
    }
}
