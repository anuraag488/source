package p000;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1267vs extends bq0 {

    /* JADX INFO: renamed from: a */
    public int f32813a;

    /* JADX INFO: renamed from: b */
    public String f32814b;

    /* JADX INFO: renamed from: c */
    public int f32815c;

    /* JADX INFO: renamed from: d */
    public long f32816d;

    /* JADX INFO: renamed from: e */
    public long f32817e;

    /* JADX INFO: renamed from: f */
    public boolean f32818f;

    /* JADX INFO: renamed from: g */
    public int f32819g;

    /* JADX INFO: renamed from: h */
    public String f32820h;

    /* JADX INFO: renamed from: i */
    public String f32821i;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bq0) {
            C1267vs c1267vs = (C1267vs) ((bq0) obj);
            if (this.f32813a == c1267vs.f32813a && this.f32814b.equals(c1267vs.f32814b) && this.f32815c == c1267vs.f32815c && this.f32816d == c1267vs.f32816d && this.f32817e == c1267vs.f32817e && this.f32818f == c1267vs.f32818f && this.f32819g == c1267vs.f32819g && this.f32820h.equals(c1267vs.f32820h) && this.f32821i.equals(c1267vs.f32821i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f32813a ^ 1000003) * 1000003) ^ this.f32814b.hashCode()) * 1000003) ^ this.f32815c) * 1000003;
        long j = this.f32816d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f32817e;
        return this.f32821i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f32818f ? 1231 : 1237)) * 1000003) ^ this.f32819g) * 1000003) ^ this.f32820h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f32813a);
        sb.append(", model=");
        sb.append(this.f32814b);
        sb.append(", cores=");
        sb.append(this.f32815c);
        sb.append(", ram=");
        sb.append(this.f32816d);
        sb.append(", diskSpace=");
        sb.append(this.f32817e);
        sb.append(", simulator=");
        sb.append(this.f32818f);
        sb.append(", state=");
        sb.append(this.f32819g);
        sb.append(", manufacturer=");
        sb.append(this.f32820h);
        sb.append(", modelClass=");
        return zi4.m13623w(sb, this.f32821i, "}");
    }
}
