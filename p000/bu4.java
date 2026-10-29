package p000;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bu4 {

    /* JADX INFO: renamed from: a */
    public final String f15637a;

    /* JADX INFO: renamed from: b */
    public final String f15638b;

    /* JADX INFO: renamed from: c */
    public final String f15639c;

    /* JADX INFO: renamed from: d */
    public final int f15640d;

    public bu4(String str) {
        this.f15637a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15638b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f15639c = strOptString;
        this.f15640d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            C1077qn.m9987m("Product type cannot be empty.");
            throw null;
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bu4) {
            return TextUtils.equals(this.f15637a, ((bu4) obj).f15637a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15637a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f15638b);
        sb.append("', productType='");
        sb.append(this.f15639c);
        sb.append("', statusCode=");
        return c75.m3880l(sb, this.f15640d, "}");
    }
}
