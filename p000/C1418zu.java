package p000;

/* JADX INFO: renamed from: zu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1418zu {

    /* JADX INFO: renamed from: a */
    public String f36372a;

    /* JADX INFO: renamed from: b */
    public String f36373b;

    /* JADX INFO: renamed from: c */
    public String f36374c;

    /* JADX INFO: renamed from: d */
    public String f36375d;

    /* JADX INFO: renamed from: e */
    public byte f36376e;

    /* JADX INFO: renamed from: f */
    public z32 f36377f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1418zu)) {
            return false;
        }
        C1418zu c1418zu = (C1418zu) obj;
        return this.f36372a.equals(c1418zu.f36372a) && this.f36373b.equals(c1418zu.f36373b) && this.f36374c.equals(c1418zu.f36374c) && this.f36375d.equals(c1418zu.f36375d) && this.f36376e == c1418zu.f36376e && this.f36377f.equals(c1418zu.f36377f);
    }

    public final int hashCode() {
        return this.f36377f.hashCode() ^ ((((((((((this.f36372a.hashCode() ^ 1000003) * 1000003) ^ this.f36373b.hashCode()) * 1000003) ^ this.f36374c.hashCode()) * 1000003) ^ this.f36375d.hashCode()) * 1000003) ^ this.f36376e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f36372a + ", versionCode=" + this.f36373b + ", versionName=" + this.f36374c + ", installUuid=" + this.f36375d + ", deliveryMechanism=" + ((int) this.f36376e) + ", developmentPlatformProvider=" + this.f36377f + "}";
    }
}
