package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f83 {

    /* JADX INFO: renamed from: a */
    @s24("nofill_urls")
    public final List<String> f18841a;

    /* JADX INFO: renamed from: b */
    @s24("refresh_interval")
    public final long f18842b;

    /* JADX INFO: renamed from: c */
    @s24("gws_query_id")
    public final String f18843c;

    /* JADX INFO: renamed from: d */
    @s24("response_info_extras")
    public final wa2 f18844d;

    public f83(ArrayList arrayList, long j, String str, wa2 wa2Var) {
        this.f18841a = arrayList;
        this.f18842b = j;
        this.f18843c = str;
        this.f18844d = wa2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83Var = (f83) obj;
        return z62.m13387o(this.f18841a, f83Var.f18841a) && this.f18842b == f83Var.f18842b && z62.m13387o(this.f18843c, f83Var.f18843c) && z62.m13387o(this.f18844d, f83Var.f18844d);
    }

    public final int hashCode() {
        return this.f18844d.f33192a.hashCode() + kx5.m7712i(zi4.m13612l(this.f18841a.hashCode() * 31, this.f18842b, 31), this.f18843c);
    }

    public final String toString() {
        return "ParentCommonConfig(noFillUrls=" + this.f18841a + ", refreshIntervalInSeconds=" + this.f18842b + ", gwsQueryId=" + this.f18843c + ", responseInfoExtras=" + this.f18844d + ")";
    }
}
