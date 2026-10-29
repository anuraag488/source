package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 {

    /* JADX INFO: renamed from: a */
    public String f24152a;

    /* JADX INFO: renamed from: b */
    public String f24153b;

    /* JADX INFO: renamed from: c */
    public String f24154c;

    /* JADX INFO: renamed from: d */
    public List f24155d;

    /* JADX INFO: renamed from: e */
    public String f24156e;

    /* JADX INFO: renamed from: f */
    public String f24157f;

    /* JADX INFO: renamed from: g */
    public String f24158g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.f24152a);
        sb.append(", mProviderPackage: ");
        sb.append(this.f24153b);
        sb.append(", mQuery: ");
        sb.append(this.f24154c);
        sb.append(", mSystemFont: ");
        sb.append(this.f24156e);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(zi4.m13623w(sb, this.f24157f, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.f24155d;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
