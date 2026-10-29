package p000;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ji3 {

    /* JADX INFO: renamed from: a */
    public final String f22314a;

    /* JADX INFO: renamed from: b */
    public final String f22315b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f22316c;

    public ji3(String str, String str2) {
        this.f22314a = str;
        this.f22315b = str2;
        this.f22316c = new JSONObject(str);
        int i = bw5.f15662c;
        Object[] objArr = cx5.f16586i;
    }

    /* JADX INFO: renamed from: a */
    public final int m7131a() {
        return this.f22316c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji3)) {
            return false;
        }
        ji3 ji3Var = (ji3) obj;
        return TextUtils.equals(this.f22314a, ji3Var.f22314a) && TextUtils.equals(this.f22315b, ji3Var.f22315b);
    }

    public final int hashCode() {
        return this.f22314a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f22314a));
    }
}
