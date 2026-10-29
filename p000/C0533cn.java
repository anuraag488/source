package p000;

import android.os.Build;

/* JADX INFO: renamed from: cn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0533cn {

    /* JADX INFO: renamed from: a */
    public String f16131a;

    /* JADX INFO: renamed from: b */
    public C1213ub f16132b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0533cn)) {
            return false;
        }
        C0533cn c0533cn = (C0533cn) obj;
        if (!z62.m13387o(this.f16131a, c0533cn.f16131a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!z62.m13387o(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return z62.m13387o(str2, str2) && this.f16132b.equals(c0533cn.f16132b);
    }

    public final int hashCode() {
        return this.f16132b.hashCode() + ((jn2.f22441b.hashCode() + zi4.m13613m((((Build.MODEL.hashCode() + (this.f16131a.hashCode() * 31)) * 31) + 47595001) * 31, Build.VERSION.RELEASE, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f16131a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + jn2.f22441b + ", androidAppInfo=" + this.f16132b + ')';
    }
}
