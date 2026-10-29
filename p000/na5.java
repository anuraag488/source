package p000;

import ads_mobile_sdk.AbstractC0082da;
import ads_mobile_sdk.C0045ba;
import ads_mobile_sdk.C0062ca;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0228m;
import ads_mobile_sdk.cg2;
import ads_mobile_sdk.eh2;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class na5 extends cg2 {

    /* JADX INFO: renamed from: c */
    public final HashSet f25600c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f25601d;

    /* JADX INFO: renamed from: e */
    public final long f25602e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ byte f25603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na5(C0200km c0200km, HashSet hashSet, JSONObject jSONObject, long j, byte b) {
        super(c0200km);
        this.f25603f = b;
        this.f25600c = new HashSet(hashSet);
        this.f25601d = jSONObject;
        this.f25602e = j;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.f25603f;
        JSONObject jSONObject = this.f25601d;
        switch (b) {
            case 0:
                return jSONObject.toString();
            default:
                C0200km c0200km = this.f1913b;
                if (eh2.m823c(jSONObject, (JSONObject) c0200km.f6400a)) {
                    return null;
                }
                c0200km.f6400a = jSONObject;
                return jSONObject.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.cg2
    public final void onPostExecute(String str) {
        C0062ca c0062ca;
        byte b = this.f25603f;
        long j = this.f25602e;
        HashSet hashSet = this.f25600c;
        switch (b) {
            case 0:
                C0062ca c0062ca2 = C0062ca.f1872c;
                if (c0062ca2 != null) {
                    for (C0045ba c0045ba : Collections.unmodifiableCollection(c0062ca2.f1873a)) {
                        if (hashSet.contains(c0045ba.f1085g)) {
                            AbstractC0082da abstractC0082da = c0045ba.f1082d;
                            if (j >= abstractC0082da.f2449d && abstractC0082da.f2448c != 3) {
                                abstractC0082da.f2448c = (byte) 3;
                                C0228m.f7071a.m1685a((WebView) abstractC0082da.f2447b.get(), "setNativeViewHierarchy", str, abstractC0082da.f2446a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (c0062ca = C0062ca.f1872c) != null) {
                    for (C0045ba c0045ba2 : Collections.unmodifiableCollection(c0062ca.f1873a)) {
                        if (hashSet.contains(c0045ba2.f1085g)) {
                            AbstractC0082da abstractC0082da2 = c0045ba2.f1082d;
                            if (j >= abstractC0082da2.f2449d) {
                                abstractC0082da2.f2448c = (byte) 2;
                                C0228m.f7071a.m1685a((WebView) abstractC0082da2.f2447b.get(), "setNativeViewHierarchy", str, abstractC0082da2.f2446a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // ads_mobile_sdk.cg2, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f25603f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
