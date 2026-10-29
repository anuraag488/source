package p000;

/* JADX INFO: renamed from: nl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0950nl {

    /* JADX INFO: renamed from: a */
    public boolean f25920a;

    /* JADX INFO: renamed from: b */
    public String f25921b;

    /* JADX INFO: renamed from: c */
    public String f25922c;

    /* JADX INFO: renamed from: d */
    public String f25923d;

    /* JADX INFO: renamed from: e */
    public int f25924e;

    /* JADX INFO: renamed from: f */
    public int f25925f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0950nl)) {
            return false;
        }
        C0950nl c0950nl = (C0950nl) obj;
        return this.f25920a == c0950nl.f25920a && z62.m13387o(this.f25921b, c0950nl.f25921b) && z62.m13387o(this.f25922c, c0950nl.f25922c) && this.f25923d.equals(c0950nl.f25923d) && this.f25924e == c0950nl.f25924e && this.f25925f == c0950nl.f25925f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25925f) + zi4.m13609i(this.f25924e, zi4.m13613m(zi4.m13613m(zi4.m13613m(Boolean.hashCode(this.f25920a) * 31, this.f25921b, 31), this.f25922c, 31), this.f25923d, 31), 31);
    }

    public final String toString() {
        boolean z = this.f25920a;
        String str = this.f25921b;
        String str2 = this.f25922c;
        String str3 = this.f25923d;
        int i = this.f25924e;
        int i2 = this.f25925f;
        StringBuilder sb = new StringBuilder("AppConfig(isDebug=");
        sb.append(z);
        sb.append(", appName=");
        sb.append(str);
        sb.append(", packageName=");
        zi4.m13599B(sb, str2, ", versionName=", str3, ", versionCode=");
        sb.append(i);
        sb.append(", sdk=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
