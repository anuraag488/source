package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: ub */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1213ub {

    /* JADX INFO: renamed from: a */
    public String f31762a;

    /* JADX INFO: renamed from: b */
    public String f31763b;

    /* JADX INFO: renamed from: c */
    public String f31764c;

    /* JADX INFO: renamed from: d */
    public dg3 f31765d;

    /* JADX INFO: renamed from: e */
    public ArrayList f31766e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1213ub)) {
            return false;
        }
        C1213ub c1213ub = (C1213ub) obj;
        if (!this.f31762a.equals(c1213ub.f31762a) || !this.f31763b.equals(c1213ub.f31763b) || !this.f31764c.equals(c1213ub.f31764c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return z62.m13387o(str, str) && this.f31765d.equals(c1213ub.f31765d) && this.f31766e.equals(c1213ub.f31766e);
    }

    public final int hashCode() {
        return this.f31766e.hashCode() + ((this.f31765d.hashCode() + zi4.m13613m(zi4.m13613m(zi4.m13613m(this.f31762a.hashCode() * 31, this.f31763b, 31), this.f31764c, 31), Build.MANUFACTURER, 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f31762a + ", versionName=" + this.f31763b + ", appBuildVersion=" + this.f31764c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f31765d + ", appProcessDetails=" + this.f31766e + ')';
    }
}
